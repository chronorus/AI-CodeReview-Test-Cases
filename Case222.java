/*
Case 222:"ThreadLocal" variables should be cleaned up when no longer used

*/
package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case222 {
    private static final ThreadLocal<UserSession> DELEGATE = new ThreadLocal<>();

    public UserSession get() throws UnauthorizedException {
      UserSession session = DELEGATE.get();
      if (session != null) {
        return session;
      }
      throw new UnauthorizedException("User is not authenticated");
    }

    public void set(UserSession session) {
      DELEGATE.set(session);
    }

     public void incorrectCleanup() {
       DELEGATE.set(null); // Noncompliant
     }

    private static class UserSession {

        public UserSession() {
        }
    }

    private static class UnauthorizedException extends Exception {

        public UnauthorizedException(String user_is_not_authenticated) {
        }
    }
    
}
