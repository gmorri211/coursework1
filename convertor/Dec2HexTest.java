package convertor;

import  org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Test
    public void mainWithInput() {
        String[] args = {"15"};
        Dec2Hex.main(args);
        assertEquals("F", Dec2Hex.hexadecimal);
    }

    @Test
    public void mainNoInput() {
        String[] args = {};
        Dec2Hex.main(args);
        assertEquals(1, Dec2Hex.status);
    }

    @Test
    public void mainInvalidInput() {
        String[] args = {"Fifteen"};
        Dec2Hex.main(args);
        assertEquals(2, Dec2Hex.status);
    }
}
