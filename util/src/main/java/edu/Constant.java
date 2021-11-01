package edu;

import static edu.MessageUtil.shouldReturn;

public final class Constant {
    public static final String FALSE_MSG = shouldReturn(false);
    public static final String TRUE_MSG = shouldReturn(true);
    public static final String FRAMEWORK = "framework";
    private Constant() {
        throw new AssertionError();
    }
}
