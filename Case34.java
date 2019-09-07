/*
34. "File.createTempFile" should not be used to create a directory
*/

/**
 *
 * @author john
 */
public class Case34 {
    public void doit() {
        File tempDir;
        tempDir = File.createTempFile("", ".");
        tempDir.delete();
        tempDir.mkdir();  // Noncompliant
    }
}
