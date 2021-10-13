package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void readnames() {
        Solution41 myApp = new Solution41();
        ArrayList<String> listofNames = new ArrayList<>();
        ArrayList<String> namesOnFiles = new ArrayList<>();
        listofNames.add("Ling, Mai");
        listofNames.add("Johnson, Jin");
        listofNames.add("Zarnecki, Sabrina");
        listofNames.add("Jones, Chris");
        listofNames.add("Jones, Aaron");
        listofNames.add("Swift, Geoffrey");
        listofNames.add("Xiong, Fong");
        boolean actual_value = true;
        Scanner input = null;
        try{
            input = new Scanner(new File("data/exercise41_input.txt"));
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        myApp.readnames(input, namesOnFiles);
        if (!(listofNames.equals(namesOnFiles))){
            actual_value = false;
        }
        assertEquals(false, actual_value);
    }

    @Test
    void organizeName() {
        Solution41 myApp = new Solution41();
        List<String> listofNames = new ArrayList<>();
        List<String> namesOnFiles = new ArrayList<>();
        listofNames.add("Ling, Mai");
        listofNames.add("Johnson, Jin");
        listofNames.add("Zarnecki, Sabrina");
        listofNames.add("Jones, Chris");
        listofNames.add("Jones, Aaron");
        listofNames.add("Swift, Geoffrey");
        listofNames.add("Xiong, Fong");
        boolean actual_value = true;
        Scanner input = null;
        try{
            input = new Scanner(new File("data/exercise41_input.txt"));
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        myApp.readnames(input, namesOnFiles);
        myApp.organizeName(namesOnFiles);
        if (listofNames.equals(namesOnFiles)){
            actual_value = true;
        }
        else
            actual_value = false;
        assertEquals(false, actual_value);
    }
}