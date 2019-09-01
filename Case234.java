/*
234. Optional value should only be accessed after calling isPresent()
*/
package com.mycompany.mavenproject1;

import java.util.Optional;

/**
 *
 * @author john
 */
public class Case234 {
    public void doit() {
        Optional<String> value = this.getOptionalValue();


        String stringValue = value.get(); // Noncompliant

    }

    private Optional<String> getOptionalValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
