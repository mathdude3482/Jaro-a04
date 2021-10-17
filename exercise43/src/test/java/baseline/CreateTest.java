package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class CreateTest {

    @Test
    void createWebsiteName() {
       Create test = new Create();
       String testpath = "data/exercise43_input.txt";
       String testName = "James";
       String expected = "data/exercise43_input.txt/website/James";
       String actual = test.createWebsiteName(testpath,testName);
       assertEquals(expected,actual);
    }

    @Test
    void createHTMLWebsite() {
        Create test = new Create();
        String testpath = "data/exercise43_input.txt";
        String testName = "James";
        String expected = "data/exercise43_input.txt/website/James/index.html";
        String actual = test.createHTMLWebsite(testpath,testName);
        assertEquals(expected,actual);
    }
}