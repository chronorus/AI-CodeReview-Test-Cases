
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;

/*
31. "SecureRandom" seeds should not be predictable
*/

/**
 *
 * @author john
 */
public class Case31 {
    public void doit() throws UnsupportedEncodingException {
        SecureRandom sr = new SecureRandom();
        sr.setSeed(123456L); // Noncompliant
//        int v = sr.next(32);

        sr = new SecureRandom("abcdefghijklmnop".getBytes("us-ascii")); // Noncompliant
//        v = sr.next(32);

    }
}
