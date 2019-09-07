
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
54. SHA-1 and Message-Digest hash algorithms should not be used in secure contexts
 */

/**
 *
 * @author john
 */
public class Case54 {
    public void doit() throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");  // Noncompliant
    }
}
