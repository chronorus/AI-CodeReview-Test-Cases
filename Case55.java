/*
55. Mutable members should not be stored or returned directly
 */

/**
 *
 * @author john
 */
public class Case55 {
  private String [] strings;

  public Case55 () {
    strings = new String[]{"first", "second"};
  }

  public String [] getStrings() {
    return strings; // Noncompliant
  }

  public void setStrings(String [] strings) {
    this.strings = strings;  // Noncompliant
  }
    
}
