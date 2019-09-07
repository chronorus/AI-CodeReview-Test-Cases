/*
43. Logging should not be vulnerable to injection attacks
*/

/**
 *
 * @author john
 */
public class Case43 {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
      String param1 = req.getParameter("param1");
      Logger.info("Param1: " + param1 + " " + Logger.getName()); // Noncompliant
      // ...
    }
}
