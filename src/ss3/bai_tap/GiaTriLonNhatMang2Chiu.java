package ss3.bai_tap;

public class GiaTriLonNhatMang2Chiu {
    public static void main(String[] args) {
        int [][] arr = {
                {11,2,3},
                {4,5,6},
                {7,22,19}
        };
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
             if (arr[i][j] > max) {
                 max = arr[i][j];
             }
            }
        }
        System.out.println(max);
    }
}
