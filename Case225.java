/*
Case 225: "compareTo" should not be overloaded
*/
package com.mycompany.mavenproject1;

/**
 *
 * @author john
 */
public class Case225 {
    static class Bar implements Comparable<Bar> {
    public int compareTo(Bar rhs) {
      return -1;
    }
  }

  static class FooBar extends Bar {
    public int compareTo(FooBar rhs) {  // Noncompliant: Parameter should be of type Bar
      return 0;
    }
  }    
}
