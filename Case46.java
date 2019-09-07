/*
46. Exceptions should not be thrown from servlet methods

 */

/**
 *
 * @author john
 */
public class Case46 {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {
      String ip = request.getRemoteAddr();
      InetAddress addr = InetAddress.getByName(ip); // Noncompliant; getByName(String) throws UnknownHostException
      //...
    }
}
