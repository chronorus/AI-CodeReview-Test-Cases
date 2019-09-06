import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
/*
Case 27. SMTP SSL connection should check server identity 
*/

/**
 *
 * @author john
 */
public class Case27 {
    public void doit() {
        String username = null, password = null;
        Email email = new SimpleEmail();
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(username, password));
        email.setSSLOnConnect(true); // Noncompliant; setSSLCheckServerIdentity(true) should also be called before sending the email
        email.send();
    }
}
