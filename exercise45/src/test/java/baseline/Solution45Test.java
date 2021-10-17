package baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {

    @Test
    void modifyFile() throws IOException {
        Solution45 myApp = new Solution45();
        String path1 = "data/exercise45_input.txt";
        myApp.modifyFile(path1, "utilize", "use");
        String path3 = "data/exercise45_output.txt";
        String path2 = "data/exercise45_expectedOutput.txt";
        BufferedReader file1 = new BufferedReader(new FileReader(path3));
        BufferedReader file2 = new BufferedReader(new FileReader(path2));

        String line1 = file1.readLine();
        String line2 = file2.readLine();

        boolean ret = true;
        int lineNum = 1;

        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                ret = false;
                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                ret = false;
                break;
            }
            line1 = file1.readLine();
            line2 = file2.readLine();
            lineNum++;
        }
        file1.close();
        file2.close();

        assertTrue(ret);
    }
}
