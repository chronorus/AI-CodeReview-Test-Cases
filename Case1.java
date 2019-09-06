/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.a.i.codereviewtestcases;

import java.io.IOException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author john
 */
public class Case1 {
    protected static void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ScriptException {
    String input = req.getParameter("input");  
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");
    engine.eval(input); // Noncompliant
  }
      
}
