/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import javax.annotation.Resource;
import javax.annotation.concurrent.NotThreadSafe;

/**
 *
 * @author john
 */
@NotThreadSafe
public class Case210 {
    private static Resource resource;

    public static Resource getInstance() {
        if (resource == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (resource == null)
                    resource = new Resource();
            }
        }
        return resource;
    }

    static class Resource {

    }

    private static class DoubleCheckedLocking {

        public DoubleCheckedLocking() {
        }
    }
}

