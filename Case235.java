/*
235. Overrides should match their parent class methods in synchronization
 */
package com.mycompany.mavenproject1;
import com.mycompany.mavenproject1.Parent;
/**
 *
 * @author john
 */
public class Case235 extends Parent {
    @Override
    public foo () {  // Noncompliant
      // ...
      super.foo();
    }
}

