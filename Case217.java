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
public class Case217 {
    public void doit() {
        System.runFinalizersOnExit(true);  // Noncompliant
    }
    protected void finalize(){
      doSomething();
    }

    private void doSomething() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
