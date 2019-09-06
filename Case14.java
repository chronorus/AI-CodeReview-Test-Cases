/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Case14 {
    public boolean validate(javax.servlet.http.HttpServletRequest request) {
        String regex = request.getParameter("regex");
        String input = request.getParameter("input");

        // Enables attackers to force the web server to evaluate
        // regex such as "(a+)+" on inputs such as "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa!"

        input.matches(regex);  // Noncompliant
        return false;
    }
    
}
