/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Random;

/**
 *
 * @author john
 */
public class Case219 {
    public void doSomethingCommon() {
        Random rand = new Random();  // Noncompliant; new instance created with each invocation
        int rValue = rand.nextInt();
    }
}
