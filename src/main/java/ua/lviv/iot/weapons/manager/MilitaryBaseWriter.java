package ua.lviv.iot.weapons.manager;

import ua.lviv.iot.weapons.model.AbstractArm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public abstract class MilitaryBaseWriter {
    public static void writeToCSVFile(List<AbstractArm> abstractArmList) throws IOException {

        File outputCSVFile = new File("AbstractArmList.csv");
        Writer fileWriter = new FileWriter(outputCSVFile);

        StringBuilder csvInfoBuilder = new StringBuilder();

        for (AbstractArm arm : abstractArmList){
            csvInfoBuilder.append(arm.getHeaders() + "\r\n" + arm.toCSV() + "\r\n");
        }

        fileWriter.write(csvInfoBuilder.toString());

        fileWriter.close();
    }
}
