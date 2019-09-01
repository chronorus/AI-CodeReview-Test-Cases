/*
233. All branches in a conditional structure should not have exactly the same implementation
*/
package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case233 {
    public void doit() {
        int b = 0;
        if (b == 0) {  // Noncompliant
            doOneMoreThing();
          } else {
            doOneMoreThing();
          }
        int a = 0;
        b = a > 12 ? 4 : 4;  // Noncompliant
        int i = 0;

        switch (i) {  // Noncompliant
          case 1:
            doSomething();
            break;
          case 2:
            doSomething();
            break;
          case 3:
            doSomething();
            break;
          default:
            doSomething();
      }
    }

    private void doOneMoreThing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void doSomething() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
