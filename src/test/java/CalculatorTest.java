import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.fact(6), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(1), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.fact(4), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 1, calculator.fact(0), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, calculator.fact(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 42, calculator.fact(4), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 9, calculator.fact(2), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 0, calculator.fact(0), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.squareRoot(1), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.squareRoot(81), DELTA);
        assertEquals("Finding square root for True Positive", 6, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, calculator.squareRoot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, calculator.squareRoot(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, calculator.squareRoot(36), DELTA);

    }
}
