/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 *
 * @author john
 */
public class Case218 {

    private int POOL_SIZE;
    public void doit() {
        ScheduledThreadPoolExecutor stpe1 = new ScheduledThreadPoolExecutor(0); // Noncompliant
        ScheduledThreadPoolExecutor stpe2 = new ScheduledThreadPoolExecutor(POOL_SIZE);
        stpe2.setCorePoolSize(0);  // Noncompliant
    }
}
