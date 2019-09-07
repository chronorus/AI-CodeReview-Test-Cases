/*
48. Throwable.printStackTrace(...) should not be called
 */

/**
 *
 * @author john
 */
public class Case48 {
    public void doit() {
        try {
            /* ... */
        } catch(Exception e) {
            e.printStackTrace();        // Noncompliant
        }
    }
}
