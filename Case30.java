
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/*
30. AES encryption algorithm should be used with secured mode
*/

/**
 *
 * @author john
 */
public class Case30 {
    public void doit() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher c1 = Cipher.getInstance("AES/ECB/NoPadding"); // Noncompliant
        Cipher c2 = Cipher.getInstance("AES/CBC/PKCS5Padding"); // Noncompliant
    }
}
