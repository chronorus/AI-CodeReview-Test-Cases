/*
47. "public static" fields should be constant
*/

/**
 *
 * @author john
 */
public class Case47 {
    public static Foo foo = new Foo();

    private static class Foo {

        public Foo() {
        }
    }
}
