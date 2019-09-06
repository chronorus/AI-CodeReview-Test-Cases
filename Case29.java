
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/*
29. LDAP connections should be authenticated
*/

/**
 *
 * @author john
 */
public class Case29 {
    public void doit() throws NamingException {
        // Set up the environment for creating the initial context
        Hashtable<String, Object> env = new Hashtable<String, Object>();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=JNDITutorial");

        // Use anonymous authentication
        env.put(Context.SECURITY_AUTHENTICATION, "none"); // Noncompliant

        // Create the initial context
        DirContext ctx = new InitialDirContext(env);
    }
}
