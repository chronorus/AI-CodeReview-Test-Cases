/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxaicodereview.resources;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class case0  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
        String input = req.getParameter("input");

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        try {
            engine.eval(input); // Noncompliant
        } catch (ScriptException ex) {
            Logger.getLogger(case0.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
