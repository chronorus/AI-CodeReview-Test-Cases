/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Case244 {
    public void doit() {
        String speech = "Now is the time for all good people to come to the aid of their country.";

        String substr1 = speech.substring(-1, speech.length());  // Noncompliant; start and end values both bad
        String substr2 = speech.substring(speech.length(), 0); // Noncompliant, start value must be < end value
        char ch = speech.charAt(speech.length());  // Noncompliant
    }
}
