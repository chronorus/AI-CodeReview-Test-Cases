/*
Case 229 : Exception should not be created without being thrown
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case229 {
    public void doit() {
        int x = 0;
        if (x < 0)
          new IllegalArgumentException("x must be nonnegative");
    }
}
