package ss16.bai_tap.copy_file_text;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args)  {
        try{
        File file = new File("src/ss16/bai_tap/copy_file_text/source.txt");
        File paste = new File("src/ss16/bai_tap/copy_file_text/paste.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(paste);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String line;
        while ((line = bufferedReader.readLine())!=null){
            bufferedWriter.write(line+"\n");

        }
        bufferedWriter.close();
        bufferedReader.close();}
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
