
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Case2 {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String location = req.getParameter("http://www.google.com");
        resp.sendRedirect(location); // Noncompliant
    }
}
  
