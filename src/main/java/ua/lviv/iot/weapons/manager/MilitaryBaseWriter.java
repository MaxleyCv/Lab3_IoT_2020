package ua.lviv.iot.weapons.manager;

import ua.lviv.iot.weapons.model.Arm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public abstract class MilitaryBaseWriter {
    public static void writeToCSVFile(List<Arm> armList) {
        File outputCSVFile = new File("AbstractArmList.csv");
        try(Writer fileWriter = new FileWriter(outputCSVFile)) {
            StringBuilder csvInfoBuilder = new StringBuilder();
            for (Arm arm : armList) {
                csvInfoBuilder.append(arm.getHeaders() + "\r\n" + arm.toCSV() + "\r\n");
            }
            fileWriter.write(csvInfoBuilder.toString());
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
