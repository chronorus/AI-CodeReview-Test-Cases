/*
Case 221 : Jump statements should not occur in "finally" blocks
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case221 {

    private static int q;
    public static void main(String[] args) {
      try {
        doSomethingWhichThrowsException();
        System.out.println("OK");   // incorrect "OK" message is printed
      } catch (RuntimeException e) {
        System.out.println("ERROR");  // this message is not shown
      }
    }

    public static void doSomethingWhichThrowsException() {
      try {
        throw new RuntimeException();
      } finally {
        for (int i = 0; i < 10; i ++) {
          //...
          if (q == i) {
            break; // ignored
          }
        }

        /* ... */
        return;      // Noncompliant - prevents the RuntimeException from being propagated
      }
    }    
}
