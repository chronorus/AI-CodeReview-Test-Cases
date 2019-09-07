/*
41. Weak SSL protocols should not be used
*/

/**
 *
 * @author john
 */
public class Case41 {
    public void doit() {
        context = SSLContext.getInstance("SSL"); // Noncompliant
    }
}
