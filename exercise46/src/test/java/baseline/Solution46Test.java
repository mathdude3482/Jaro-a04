package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    @Test
    void findWord() throws FileNotFoundException {
        Solution46 test = new Solution46();
        List<Integer> sortedlist = new ArrayList<>();
        sortedlist.add(7);
        sortedlist.add(2);
        sortedlist.add(1);
        int i;
        boolean ret = false;
        test.findWord();
        for (i = 0; i < sortedlist.size(); i++) {
            if (sortedlist.contains(test.frequencyvalue.get(i)))
                ret = true;
            else {
                ret = false;
                break;
            }
        }
        assertTrue(ret);
    }
}
