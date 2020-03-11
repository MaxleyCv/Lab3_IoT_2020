package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;
import static ua.lviv.iot.weapons.manager.MilitaryBaseWriter.writeToCSVFile;

public class MilitaryBaseWriterTest extends BaseMillitaryManagerTest{

    @Test
    void writeToFileTest(){
        try {
            writeToCSVFile(weapons);
        } catch (IOException e) {
            e.printStackTrace();
            fail("Got an IOException");
        }
    }

}
