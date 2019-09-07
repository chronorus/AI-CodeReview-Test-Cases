
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
35. Web applications should not have a "main" method
*/

/**
 *
 * @author john
 */
public class Case35 {
    private static HttpServletRequest req;
    public class MyServlet extends HttpServlet {
        public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
          if (userIsAuthorized(req)) {
            updatePrices(req);
          }
        }

        /**
         *
         * @param args
         */
        public static void main(String[] args) { // Noncompliant
          updatePrices(req);
        }

        private boolean userIsAuthorized(HttpServletRequest req) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void static updatePrices(HttpServletRequest req) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
