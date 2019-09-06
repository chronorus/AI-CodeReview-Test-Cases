
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Case15 {
    public void doit() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher c = Cipher.getInstance("DESede/ECB/PKCS5Padding");
    }
}
