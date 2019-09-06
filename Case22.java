
import java.sql.Connection;
import java.sql.DriverManager;

/*
22.Credentials should not be hard-coded 
*/

/**
 *
 * @author john
 */
public class Case22 {
    public void doit() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                    "user=steve&password=blue"); // Noncompliant
            String uname = "steve";
            String password = "blue";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?" +
                  "user=" + uname + "&password=" + password); // Noncompliant

            java.net.PasswordAuthentication pa = new java.net.PasswordAuthentication("userName", "1234".toCharArray());  // Noncompliant
        } catch(Exception e) {
            
        }
    }
}
