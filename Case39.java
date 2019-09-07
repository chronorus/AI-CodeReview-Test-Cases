
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
39. Server-side requests should not be vulnerable to forging attacks
*/

/**
 *
 * @author john
 */
public class Case39 {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        URL url = new URL(req.getParameter("url"));
        HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // Noncompliant
    }
}
