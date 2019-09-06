
import javax.servlet.http.Cookie;

/*
33. "HttpOnly" should be set on cookies
*/

/**
 *
 * @author john
 */
public class Case33 {

    private String value;
    public void doit() {
        Cookie cookie = new Cookie("myCookieName", value); // Noncompliant; by default cookie.isHttpOnly() is returning false
    }
}
