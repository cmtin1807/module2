package ss16.thuc_hanh_test.test_file_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileInDirectory {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src//ss17//Hella.txt");
        File dir = new File("src//ss17//");
        dir.mkdirs();
        PrintWriter pw = new PrintWriter("src//ss17//Hellccac.txt");

        file.mkdir();
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isHidden());
        System.out.println(file.exists());

        if (dir.isDirectory()) {
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++) {
            System.out.println(dirContents[i]);
        }}
//        boolean isDelete = file.delete();
//        System.out.println(isDelete);
    }
}
