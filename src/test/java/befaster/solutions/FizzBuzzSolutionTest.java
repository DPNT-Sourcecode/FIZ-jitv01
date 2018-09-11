package befaster.solutions;

import befaster.solutions.FIZ.FizzBuzzSolution;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzSolutionTest {
    private FizzBuzzSolution solution;

    @Before
    public void prepare() {
        solution = new FizzBuzzSolution();
    }

    @Test
    public void run() {
        assertThat(solution.fizzBuzz(45), equalTo("fizz buzz fake deluxe"));
    }
}
