/*
232. Intermediate Stream methods should not be left unused
 */
package com.mycompany.mavenproject1;

import static java.awt.Color.RED;

/**
 *
 * @author john
 */
public class Case232 {
    public void doit() {
        widgets.stream().filter(b -> b.getColor() == RED); // Noncompliant
    }
}
