/*
37. Cryptographic RSA algorithms should always incorporate OAEP (Optimal Asymmetric Encryption Padding)
*/

/**
 *
 * @author john
 */
public class Case37 {
    public void doit() {
        Cipher rsa = javax.crypto.Cipher.getInstance("RSA/NONE/NoPadding");
    }
}
