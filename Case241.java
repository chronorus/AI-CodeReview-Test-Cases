/*
241. "getClass" should not be used for synchronization
 */

/**
 *
 * @author john
 */
public class Case241 {
    public void doSomethingSynchronized(){
        synchronized (this.getClass()) {  // Noncompliant
          // ...
        }
    }
}
