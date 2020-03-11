package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.weapons.manager.MilitaryBaseReader;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;

public class MilitaryBaseReaderTest {
    
    @Test
    public void readerTest(){
        File csvInputFile = new File("AbstractArmList.csv");
        String info = "";
        try {
            info = MilitaryBaseReader.readMilitaryBaseFromCSVFile(csvInputFile);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Problem with file");
        }
        System.out.println(info);
    }
}
