/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sandboxaicodereview.resources;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class case0  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
        ServletInputStream sis = req.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(sis);
        try {
            Object obj = ois.readObject(); // Noncompliant
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(case0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
