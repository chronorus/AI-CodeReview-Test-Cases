/*
240. "volatile" variables should not be used with compound operators
 */

/**
 *
 * @author john
 */
public class Case240 {
    private volatile int count = 0;
    private volatile boolean boo = false;
    public void incrementCount() {
      count++;  // Noncompliant
    }

    public void toggleBoo(){
      boo = !boo;  // Noncompliant
    }


}
