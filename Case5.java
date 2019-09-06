import static java.util.Locale.filter;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;

public class Case5 {
    public void doit() throws NamingException {
        DirContext ctx = new InitialDirContext();
        ctx.search( "dc=People,dc=example,dc=com", 
                    "(uid=",  
                    new SearchControls(0, 0, 0, new String[1],
                    true, // Noncompliant; allows deserialization
                    true));
        
//        new SearchControls(0, 0, 0, "", true, true)
    }
}
