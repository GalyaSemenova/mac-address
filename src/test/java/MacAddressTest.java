import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author galya_semenova
 * in this class, the only method of the program 'isMAC' is tested
 */
public class MacAddressTest {
    /**
     * checks MAC-address
     */
    @Test
    public void isMAC() {
        assertTrue(MacAddress.isMAC("aE:dC:cA:56:76:54"));
        assertFalse(MacAddress.isMAC("01:23:45:67:89:Az"));
    }

}