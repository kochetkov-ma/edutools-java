import edu.MessageUtil;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Tests {

    /**
     * Complex input data
     */
    private static Stream<Arguments> arrayData() {
        return Stream.of(
                arguments(new int[]{1}, 1),
                arguments(new int[]{1, 2}, 2)
        );
    }

    /**
     * Test with input data from CsvSource.
     */
    @DisplayName("Test name here 1")
    @ParameterizedTest(name = "Your code must calculate: {0} + {1} = {2}")
    @CsvSource({
            "10,20,30",
            "0,0,0"
    })
    public void test1(int left, int right, int expectedSum) {
        MatcherAssert.assertThat(
                MessageUtil.shouldAcceptAndReturn(expectedSum, left, right),
                Task.thisTask(),
                Matchers.is(expectedSum)
        );
    }

    /**
     * Test with complex input data.
     */
    @DisplayName("Test name here 2")
    @ParameterizedTest(name = "Array {0} length = {1}")
    @MethodSource("arrayData")
    public void test2(int[] actualArray, long expectedLength) {
        MatcherAssert.assertThat(
                MessageUtil.shouldAcceptAndReturnNoClass(expectedLength, Arrays.toString(actualArray)),
                Task.thisTask(),
                Matchers.is(expectedLength)
        );
    }

}