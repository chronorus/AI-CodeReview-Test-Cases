/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case214 {
    void test_divide() {
      int z = 0;
      if (unknown()) {
        // ..
        z = 3;
      } else {
        // ..
      }
      z = 1 / z; // Noncompliant, possible division by zero
    }

    private boolean unknown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
