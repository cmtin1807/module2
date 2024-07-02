package molude2.vehicle.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
        public static List<String> readFromFile(String pathFile) throws IOException {
            List<String> stringList = new ArrayList();
            File file = new File(pathFile);
            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        stringList.add(line);
                    }
                }
            }
            return stringList;
        }
    }

