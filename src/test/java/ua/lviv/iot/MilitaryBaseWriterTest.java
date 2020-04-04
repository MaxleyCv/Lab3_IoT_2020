package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;
import static ua.lviv.iot.weapons.manager.MilitaryBaseWriter.writeToCSVFile;

public class MilitaryBaseWriterTest extends BaseMillitaryManagerTest{

    @Test
    void writeToFileTest(){

            writeToCSVFile(weapons);

    }

}
