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
public class Case212 {
    class A {
      private int x;
      private int y;

      public void setX(int val) { // Noncompliant: field 'x' is not updated
        this.y = val;
      }

      public int getY() { // Noncompliant: field 'y' is not used in the return value
        return this.x;
      }
    }    
}
