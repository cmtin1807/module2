package ss16.thuc_hanh_test.test_file_class;

import java.io.*;

public class TextWriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("src//ss16//Hellodadcac.txt",true);
            BufferedWriter bufer = new BufferedWriter(file);
            bufer.write("Nguyen Duc ");
            bufer.write("Thao Nguyen");
            bufer.newLine();
            bufer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        }

}
