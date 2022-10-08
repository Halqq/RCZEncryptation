
import java.util.ArrayList;
import java.util.List;

/**
 * @author Halq
 * @since 08/10/22
 */

public class EncryptRCZ {

    public static int ENCODE_MODE = 1;
    public static int DECODE_MODE = 2;

    public static String encryptRCZ(int Mode, String input) {

        List<String> output = new ArrayList<String>();

        switch (Mode) {

            case 1:
                output.add(RCZTransformer.encodeBytes(input));
                break;

            case 2:
                output.add(RCZTransformer.decodeBytes(input).replace("-", ""));
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + Mode);
        }
        return output.toString();
    }
}
