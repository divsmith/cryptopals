import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

/**
 * Created by parker on 3/21/18.
 */
public class Converter {
    public static String hex_to_base64(String input)
    {
        byte[] buffer;

        try
        {
            buffer = Base64.encodeBase64(Hex.decodeHex(input));
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong decoding hex");
            return null;
        }

        return new String(buffer);
    }
}
