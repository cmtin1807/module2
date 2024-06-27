package ss16.thuc_hanh_test.test_file_class;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextReadFile {
    public static void main(String[] args) {
        try{
            FileReader read = new FileReader("src//ss16//Hello.txt");
            BufferedReader br = new BufferedReader(read);
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
