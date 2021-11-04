import edu.MessageUtil;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Tests {

    /**
     * Test with input data from CsvSource.
     */
    @DisplayName("Test name here 1")
    @ParameterizedTest(name = "Your code must print: {0} + {1} = {2}")
    @CsvSource({
            "10,20,30",
            "0,0,0",
            "-10,-20,-30"
    })
    public void test1(int a, int b, int expectedSum) {
        String expectedString = a + " + " + b + " = " + expectedSum;
        MatcherAssert.assertThat(
                MessageUtil.shouldAcceptAndReturn(expectedString, a, b),
                Task.sumAB(a, b),
                Matchers.is(expectedString)
        );
    }
}