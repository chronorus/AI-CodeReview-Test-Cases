/*
Case 223. : Strings and Boxed types should be compared using "equals()" 
*/

package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case223 {
    public void doit() {
        String firstName = getFirstName(); // String overrides equals
        String lastName = getLastName();

        if (firstName == lastName) {  }; // Non-compliant; false even if the strings have the same value

    }

    private String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
