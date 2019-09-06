
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

/*
Case 20. LDAP queries should not be vulnerable to injection attacks */

/**
 *
 * @author john
 */
public class Case20 {
    public boolean authenticate(javax.servlet.http.HttpServletRequest request, DirContext ctx) throws NamingException {
      String user = request.getParameter("user");
      String pass = request.getParameter("pass");

      String filter = "(&(uid=" + user + ")(userPassword=" + pass + "))"; // Unsafe

      // If the special value "*)(uid=*))(|(uid=*" is passed as user, authentication is bypassed
      // Indeed, if it is passed as a user, the filter becomes:
      // (&(uid=*)(uid=*))(|(uid=*)(userPassword=...))
      // as uid=* match all users, it is equivalent to:
      // (|(uid=*)(userPassword=...))
      // again, as uid=* match all users, the filter becomes useless

      NamingEnumeration<SearchResult> results = ctx.search("ou=system", filter, new SearchControls()); // Noncompliant
      return results.hasMore();
    }
}
