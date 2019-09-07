
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
53. HTTP referers should not be relied on

 */

/**
 *
 * @author john
 */
public class Case53 {
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String referer = request.getHeader("referer");  // Noncompliant
    if(isTrustedReferer(referer)){
      //..
    }
    //...
  }    

    private boolean isTrustedReferer(String referer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
