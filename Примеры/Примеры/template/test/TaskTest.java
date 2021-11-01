import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static edu.Constant.TRUE_MSG;

public class TaskTest {
    private static final String test1 = "имя_теста";

    @DisplayName(test1)
    @ParameterizedTest(name = "Ожидаемый результат {0}")
    @ValueSource(booleans = true)
    public void test1(boolean expected) {
        MatcherAssert.assertThat(
                test1 + TRUE_MSG,
                Task.thisTask(),
                Matchers.is(true)
        );
    }
}