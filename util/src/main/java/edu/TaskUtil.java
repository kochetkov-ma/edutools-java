package edu;

import java.awt.*;
import java.awt.event.KeyEvent;

public final class TaskUtil {

    private static final String ROBOT_MSG = "Не удалось настроить авто переход на дерево тестов в IDEA, но ничего страшного, просто нажмите Alt+4";
    private static Robot robot;

    static {
        try {
            robot = new Robot();
            robot.setAutoDelay(250);
        } catch (AWTException e) {
            System.err.println(ROBOT_MSG);
        }
    }

    private TaskUtil() {
        throw new AssertionError();
    }

    /**
     * Переместиться в IDEA на панель 'Run' чтобы наблюдать результаты теста в удобном виде.
     */
    public static void switchToRun() {
        try {
            robot.keyPress(KeyEvent.VK_ALT);

            robot.keyPress(KeyEvent.VK_4);
            robot.keyRelease(KeyEvent.VK_4);
        } catch (Throwable t) {
            System.err.println(t.getLocalizedMessage());
        } finally {
            robot.keyRelease(KeyEvent.VK_ALT);
        }
    }

    public static void collapse() {
        try {
            robot.keyPress(KeyEvent.VK_CONTROL);

            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_ADD);
        } catch (Throwable t) {
            System.err.println(t.getLocalizedMessage());
        } finally {
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }
    }
}
