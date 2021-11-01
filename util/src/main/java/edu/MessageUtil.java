package edu;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public final class MessageUtil {

    private MessageUtil() {
        throw new AssertionError();
    }

    public static String shouldAcceptAndReturnNoClass(Object expected, Object... parameters) {
        var expectedName = Objects.toString(expected);
        var arguments = Arrays.stream(parameters).map(Objects::toString).collect(Collectors.joining("', '", "'", "'"));

        return String.format(" [For input data %s the result (return) of your method should be equals = '%s'] ", arguments, expectedName);
    }

    public static String shouldAcceptAndReturn(Object expected, Object... parameters) {
        var className = Optional.ofNullable(expected).map(Object::getClass).map(Class::getSimpleName).orElse("любого");
        var expectedName = Objects.toString(expected);
        var arguments = Arrays.stream(parameters).map(Objects::toString).collect(Collectors.joining("', '", "'", "'"));

        return String.format(" [For input data %s the result (return) of your method should be '%s' and equals = '%s'] ", arguments, className, expectedName);
    }

    public static String shouldReturn(Object expected) {
        var className = Optional.ofNullable(expected).map(Object::getClass).map(Class::getSimpleName).orElse("любого");
        var expectedName = Objects.toString(expected);

        return String.format(" [The result (return) of your method should be '%s' and equals = '%s'] ", className, expectedName);
    }
}
