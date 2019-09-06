
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;


public class Case6{
    public static void a() throws NoSuchAlgorithmException {
    KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
    keyGen.init(64); // Noncompliant

    KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
    keyPairGen.initialize(512); // Noncompliant
    }
}
