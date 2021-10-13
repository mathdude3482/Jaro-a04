package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void setInfo() {
        Solution42 test = new Solution42();
        List<String> myNames = new ArrayList<>();
        List<String> names = new ArrayList<>();
        myNames.add("Ling,Mai,55900");
        myNames.add("Johnson,Jim,56500");
        myNames.add("Jones,Aaron,46000");
        myNames.add("Jones,Chris,34500");
        myNames.add("Swift,Geoffrey,14200");
        myNames.add("Xiong,Fong,65000");
        myNames.add("Zarnecki,Sabrina,51500");
        boolean actual_Value = true;
        Scanner fileName = null;
        try{
            fileName = new Scanner(new File("data/exercise42_input.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        assert fileName != null;
        test.setInfo(fileName);
        if (!myNames.equals(names)){
            actual_Value = false;
        }
        assertEquals(false, actual_Value);
    }
}