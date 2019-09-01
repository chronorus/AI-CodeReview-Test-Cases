/*
Case 226 : "iterator" should not return "this"
 */
package com.mycompany.mavenproject1;

import java.util.Iterator;
import com.mycompany.mavenproject1.Foo;
/**
 *
 * @author john
 */
public class Case226 implements Iterator<Foo>{
    private Foo[] seq;
    private int idx = 0;


  public boolean hasNext() {
    return idx < seq.length;
  }

  public Foo next() {
    return seq[idx++];
  }

  public Iterator<Foo> iterator() {
    return this; // Noncompliant
  }
}