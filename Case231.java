/*
231. Consumed Stream pipelines should not be reused
 */
package com.mycompany.mavenproject1;

import static java.awt.Color.RED;
import java.util.stream.Stream;

/**
 *
 * @author john
 */
public class Case231 {
    public void doit() {
        Widget widget;
        Stream<Widget> pipeline = widgets.stream().filter(b -> b.getColor() == RED);
        int sum1 = pipeline.sum();
        int sum2 = pipeline.mapToInt(b -> b.getWeight()).sum(); // Noncompliant

    }
}
