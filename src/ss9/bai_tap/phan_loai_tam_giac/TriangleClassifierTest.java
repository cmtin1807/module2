package ss9.bai_tap.phan_loai_tam_giac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleClassifierTest {
    @Test
    public void testIsEquilateralTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "Là tam giác đều";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    public void testIsosceleTriangle() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "Là tam giác cân";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    public void testIsTriangle() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        String expected = "Là tam giác thường";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    public void testNotIsTriangle1SideBig() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    public void testNotIsTriangleSideNegative() {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
    @Test
    public void testNotIsTriangleSideZero() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.checkTriangle(sideA, sideB, sideC);
        assertEquals(expected, result);
    }
}
