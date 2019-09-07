/*
243. Assignment of lazy-initialized members should be the last step with double-checked locking
 */

/**
 *
 * @author john
 */
public class Case243 {
  private volatile List<String> strings;

  public List<String> getStrings() {
    if (strings == null) {  // check#1
      synchronized(Case243.class) {
        if (strings == null) {
          strings = new ArrayList<>();  // Noncompliant
          strings.add("Hello");  //When threadA gets here, threadB can skip the synchronized block because check#1 is false
          strings.add("World");
        }
      }
    }
    return strings;
  }
    
}
