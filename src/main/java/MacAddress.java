import java.util.regex.Pattern;

/**
 * @author galya_semenova
 * The program consists in determining the correctness of the MAC address using a regular expression.
 * If the conditions are met, the program returns true, otherwise false.
 */
public class MacAddress {
    /**
     * Using the static matches method of the Pattern class, a regular expression is passed
     * for comparison with the MAC address passed to the function.
     * @param mac - mac address as a string
     * @return true if the specified string is the correct mac address, and false otherwise.
     */
    public static boolean isMAC(String mac) {
        return Pattern.matches("[a-fA-F\\d]{2}(:[a-fA-F\\d]{2}){5}", mac);
    }
}

