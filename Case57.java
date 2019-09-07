/*
57. Class variable fields should not have public accessibility
 */

/**
 *
 * @author john
 */
public class Case57 {
  public static final int SOME_CONSTANT = 0;     // Compliant - constants are not checked

  public String firstName;                       // Noncompliant
    
}
