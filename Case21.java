
import java.io.IOException;

/*
21. OS commands should not be vulnerable to injection attacks
*/

/**
 *
 * @author john
 */
public class Case21 {
    public void run(javax.servlet.http.HttpServletRequest request) throws IOException {
      String binary = request.getParameter("binary");

      // If the value "/sbin/shutdown" is passed as binary and the web server is running as root,
      // then the machine running the web server will be shut down and become unavailable for future requests

      Runtime.getRuntime().exec(binary); // Noncompliant
    }
    
}
