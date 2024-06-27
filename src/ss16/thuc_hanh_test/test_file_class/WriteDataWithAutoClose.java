package ss16.thuc_hanh_test.test_file_class;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("src//ss16//Helloacd.txt");
        if (file.exists()) {
            System.out.println("Nguyen 12A1");
            System.exit(0);
        }
        try (
                PrintWriter pw = new PrintWriter(file);
                ){
            pw.println("Cong,Nguyen,Quyet");

        }
    }
}
