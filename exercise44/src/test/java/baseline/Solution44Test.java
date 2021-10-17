package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {
    @Test
    public void isProductTest1() throws FileNotFoundException {
        String str1 = "ipad";
        boolean ret = Solution44.isProduct(str1);
        assertFalse(ret);
    }

    @Test
    public void isProductTest2() throws FileNotFoundException {
        String str1 = "Thing";
        boolean ret = Solution44.isProduct(str1);
        assertTrue(ret);
    }

    @Test
    public void isProductTest3() throws FileNotFoundException {
        String str1 = "Random";
        boolean ret = Solution44.isProduct(str1);
        assertFalse(ret);
    }
}