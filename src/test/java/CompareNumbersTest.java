import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.netology.CompareNumbers;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CompareNumbersTest {
    CompareNumbers compDigits = new CompareNumbers();

    @BeforeAll
    public static void before() {
        System.out.println("Comparing digits started");
    }

    @AfterAll
    public static void after() {
        System.out.println("Comparing digits finished");
    }

    @BeforeEach
    public void beforeEachTest() {
        CompareNumbers compDigits = new CompareNumbers();
        System.out.println("Variable added");
    }

    @AfterEach
    public void afterEachTest() {
        CompareNumbers compDigits = null;
        System.out.println("Variable deleted");
    }

    @Test
    public void testComparing() {
        double a = 0.5555555, b = 0.5555556, eps = 0.1;
        int expected = 0;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int result = CompareNumbers.Comparing(a, b, eps);
        Assertions.assertEquals(expected, result);
        System.out.println("Comparing test");
    }

    @ParameterizedTest
    @MethodSource("addTestParameters")
    public void testAddWithParameters(double a, double b, double eps, int expected) {
        System.out.println("Test add with parameters");
        int result = CompareNumbers.Comparing(a, b, eps);
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments> addTestParameters() {
        return Stream.of(
                Arguments.of(1, 2, 0, -1),
                Arguments.of(0.7777778, 0.7777777, 0.1, 0),
                Arguments.of(0.7777778, 0.7777777, 0.00000001, 1)
        );
    }

    @Test
    public void testDoubleToString() {
        double doubleNumber = 0.7777777777;
        String expected = "0.7777777777";
        String actual = CompareNumbers.doubleToString(doubleNumber);
        assertEquals(expected, actual);
    }
}
