package ua.lviv.iot.weapons.manager;

import java.io.*;

public abstract class MilitaryBaseReader {
    public static String readMilitaryBaseFromCSVFile(File csvFile) throws IOException {
        Reader fileReader = new BufferedReader(new FileReader(csvFile));
        StringBuilder builder = new StringBuilder();
        while (true) {
            String result = ((BufferedReader) fileReader).readLine();
            if (result == null) break;
            builder.append(result + "\n");
        }
        return builder.toString();
    }

}

