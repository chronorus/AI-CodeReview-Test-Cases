
import java.nio.file.Files;
import java.nio.file.Paths;

/*
Case 19. I/O function calls should not be vulnerable to path injection attacks
*/

/**
 *
 * @author john
 */
public class Case19 {
    public boolean authenticate(javax.servlet.http.HttpServletRequest request) {
      String user = request.getParameter("user");

      // If the special value "../bin" is passed as user, authentication is bypassed
      // Indeed, if it passed as a user, the path becomes:
      // /bin
      // which exists on most Linux / BSD / Mac OS distributions

      return Files.exists(Paths.get("/home/", user)); // Noncompliant
    }
}
