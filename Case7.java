/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author john
 */
public class Case7 {
    String path;
    
    @RequestMapping("/greet")  // Noncompliant
    public String greet(String greetee) {
        return null;
    }
}
