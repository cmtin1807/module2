package ss9.thuc_hanh.tim_gia_tri_tuyet_doi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Testing Number 0")
    public void testFindAbsolute0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);

    }
    @Test
    @DisplayName("Testing Number 1")
    public void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);

    }
    @Test
    @DisplayName("Testing Number 1")
    public void testFindAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected, result);

    }

}

