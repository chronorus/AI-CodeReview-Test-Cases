/*
38."HttpServletRequest.getRequestedSessionId()" should not be used
*/

/**
 *
 * @author john
 */
public class Case38 {
    public void doit() {
        if(isActiveSession(request.getRequestedSessionId()) ){
        }
    }
}
