/*
42. Return values should not be ignored when they contain the operation status code 
*/

/**
 *
 * @author john
 */
public class Case42 {
    public void doSomething(File file, Lock lock) {
      file.delete();  // Noncompliant
      // ...
      lock.tryLock(); // Noncompliant
    }
}
