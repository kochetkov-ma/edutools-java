import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Tests {

    @Test
    @DisplayName("5.0 + 10.0 = 15.0")
    public void testSolution() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;

        System.setOut(ps);

        Task.sumAndPrint(5, 10);

        System.out.flush();
        System.setOut(old);

        MatcherAssert.assertThat(baos.toString(), Matchers.containsString("5.0 + 10.0 = 15.0"));
    }
}