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
public class Case209 {
    public void doit1() {
        for (;;) {  // Noncompliant; end condition omitted
            // ...
        }
    }
    public void doit2() {
        int j = 0;
        while (true) { // Noncompliant; end condition omitted
            j++;
        }
    }
    public void doit3() {
        int k = 0;
        boolean b = true;
        while (b) { // Noncompliant; b never written to in loop
            k++;
        }
    }
}
