/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 *
 * @author john
 */
public class Case8 {
    @RequestMapping(value = "/greet", method = GET)
    private String greet(String greetee) {  // Noncompliant
        return null;
    }    
}
