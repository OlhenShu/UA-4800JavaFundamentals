package module5_Kateryna.homework_optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopDo_WhileTest {
    @Test
    public void testCalculateSumPositiveNumbers() {
        // Checking the sum of two positive numbers
        double actual = LoopDo_While.calculateSum(5.6, 10.4);
        double expected = 16.0;
        assertEquals(expected, actual, "The sum of the positive numbers should be 16.0");
    }

    @Test
    public void testCalculateSumNegativeNumbers() {
        // Checking sums involving negative numbers
        double actual = LoopDo_While.calculateSum(-5.0, 3.0);
        double expected = -2.0;
        assertEquals(expected, actual, "The sum of -5.0 and 3.0 should be -2.0");
    }

    @Test
    public void testCalculateSumZero() {
        // Checking for a zero in the sum
        double actual = LoopDo_While.calculateSum(0, 7.7);
        double expected = 7.7;
        assertEquals(expected, actual, "Adding a zero should not change the number");
    }
}