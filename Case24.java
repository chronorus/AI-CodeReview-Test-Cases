
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
Case 24. HTTP response headers should not be vulnerable to injection attacks
*/

/**
 *
 * @author john
 */
public class Case24 {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      String value = req.getParameter("value");
      resp.addHeader("X-Header", value); // Noncompliant
      // ...
    }
    
}
