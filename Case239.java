/*
239. Expressions used in "assert" should not produce side effects
 */

/**
 *
 * @author john
 */
public class Case239 {
    public void doit() {
        assert myList.remove(myList.get(0));  // Noncompliant
    }
}
