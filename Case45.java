/*
45. Mutable fields should not be "public static"
*/

/**
 *
 * @author john
 */
public class Case45 {
    public static String [] strings1 = {"first","second"};  // Noncompliant
    public static String [] strings2 = {"first","second"};  // Noncompliant
    public static List<String> strings3 = new ArrayList<>();  // Noncompliant
    
}
