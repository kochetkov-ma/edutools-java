package edu;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import static edu.Constant.FRAMEWORK;

/**
 * Расширение для Junit5.
 * Включается автоматически через ServiceLoader, который описан в resource/META-INF/services/org.junit.jupiter.api.extension.Extension
 */
public class EduExtension implements BeforeAllCallback, AfterAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) {
        if (!context.getTags().contains(FRAMEWORK))
            TaskUtil.switchToRun();
    }

    @Override
    public void afterAll(ExtensionContext context) {
        if (!context.getTags().contains(FRAMEWORK))
            TaskUtil.collapse();
    }
}