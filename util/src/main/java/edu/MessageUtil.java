package edu;

import java.util.*;
import java.util.stream.Collectors;

import static com.google.common.collect.ImmutableMap.of;
import static java.lang.String.format;

public final class MessageUtil {

    public static String COURSE_LOCALE = System.getProperty("courseLocale", "en");

    private MessageUtil() {
        throw new AssertionError();
    }

    public static String shouldAcceptAndReturnNoClass(Object expected, Object... parameters) {
        var expectedName = Objects.toString(expected);
        var arguments = Arrays.stream(parameters).map(Objects::toString).collect(Collectors.joining("', '", "'", "'"));

        return print(
                of(
                        "ru", format("Для входных данных %s результат (return) твоего метода должен быть равен '%s'", arguments, expectedName),
                        "en", format("For input data %s the result (return) of your method should be equals = '%s'", arguments, expectedName)

                )
        );
    }

    public static String shouldAcceptAndReturn(Object expected, Object... parameters) {
        var className = Optional.ofNullable(expected).map(Object::getClass).map(Class::getSimpleName).orElse("любого");
        var expectedName = Objects.toString(expected);
        var arguments = Arrays.stream(parameters).map(Objects::toString).collect(Collectors.joining("', '", "'", "'"));

        return print(
                of(
                        "ru", format("Для входных данных %s результат (return) твоего метода должен быть типа '%s' и равен = '%s'", arguments, className, expectedName),
                        "en", format("For input data %s the result (return) of your method should be '%s' and equals = '%s'", arguments, className, expectedName)
                )
        );
    }

    public static String shouldReturn(Object expected) {
        var className = Optional.ofNullable(expected).map(Object::getClass).map(Class::getSimpleName).orElse("любого");
        var expectedName = Objects.toString(expected);

        return print(
                of(
                        "ru", format("Результат (return) твоего метода должен быть типа '%s' и равен '%s'", className, expectedName),
                        "en", format("The result (return) of your method should be '%s' and equals = '%s'", className, expectedName)
                )
        );
    }

    private static String print(Map<String, String> langMap) {
        var message = langMap.getOrDefault(COURSE_LOCALE.toLowerCase(Locale.ROOT), langMap.get("en"));
        if (message == null) throw new IllegalArgumentException("You should add 'en' localization to map");
        return message;
    }
}
