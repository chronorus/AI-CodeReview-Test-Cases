
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;

/*
Case18 : XPath expressions should not be vulnerable to injection attacks
*/

/**
 *
 * @author john
 */
public class Case18 {
    public boolean authenticate(javax.servlet.http.HttpServletRequest request, javax.xml.xpath.XPath xpath, org.w3c.dom.Document doc) throws XPathExpressionException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        String expression = "/users/user[@name='" + user + "' and @pass='" + pass + "']"; // Unsafe

        // An attacker can bypass authentication by setting user to this special value
        user = "' or 1=1 or ''='";

        return (boolean)xpath.evaluate(expression, doc, XPathConstants.BOOLEAN); // Noncompliant
    }
}
