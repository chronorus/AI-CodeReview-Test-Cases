/*
Case 227: Map values should not be replaced unconditionally
*/
package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case227 {
    public void doit() {
        letters.put("a", "Apple");
        letters.put("a", "Boy");  // Noncompliant
        String[] towns = null;
        int i = 0;

        towns[i] = "London";
        towns[i] = "Chicago";  // Noncompliant
    }

    private static class letters {

        private static void put(String a, String boy) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public letters() {
        }
    }
    
}
