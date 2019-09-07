/*
51. Cypher Block Chaining IV's should be random and unique
 */

/**
 *
 * @author john
 */
public class Case51 {
  public String applyCBC(String strKey, String plainText) {
    byte[] bytesIV = "7cVgr5cbdCZVw5WY".getBytes("UTF-8");

    /* KEY + IV setting */
    IvParameterSpec iv = new IvParameterSpec(bytesIV);
    SecretKeySpec skeySpec = new SecretKeySpec(strKey.getBytes("UTF-8"), "AES");

    /* Ciphering */
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);  // Noncompliant because IV hard coded and cannot vary with each ciphering round
    byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
    return DatatypeConverter.printBase64Binary(bytesIV) // IV is typically published
            + ";" + DatatypeConverter.printBase64Binary(encryptedBytes);
  }    
}
