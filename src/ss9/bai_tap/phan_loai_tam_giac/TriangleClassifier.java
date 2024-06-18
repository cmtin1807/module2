package ss9.bai_tap.phan_loai_tam_giac;

public class TriangleClassifier {
    public static String checkTriangle(int sideA, int sideB, int sideC) {
        if (isNotIsTriangle(sideA, sideB, sideC)) {
            return "không phải là tam giác";
        }
        if (isNotIsTriangleSideNegativeOrZero(sideA, sideB, sideC)) {
            return "không phải là tam giác";
        }
        if (isEqualaterralTriangle(sideA, sideB, sideC)) {
            return "Là tam giác đều";
        }
        if (isOsceleTriangle(sideA, sideB, sideC)) {
            return "Là tam giác cân";
        }
        return "Là tam giác thường";
    }

    private static boolean isNotIsTriangleSideNegativeOrZero(int sideA, int sideB, int sideC) {
        return sideA <= 0 || sideB <= 0 || sideC <= 0;
    }

    private static boolean isNotIsTriangle(int sideA, int sideB, int sideC) {
        return sideA + sideB <= sideC || sideA + sideC <= sideB || sideC + sideB <= sideA;
    }

    private static boolean isOsceleTriangle(int sideA, int sideB, int sideC) {
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    private static boolean isEqualaterralTriangle(int sideA, int sideB, int sideC) {
        return sideA == sideB && sideA == sideC;
    }

}
