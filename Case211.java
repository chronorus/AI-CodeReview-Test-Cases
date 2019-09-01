/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author john
 */
public class Case211 {

    private URI fileName;
    private Charset charset;
    private Iterable<String> propertyList;
    private void readTheFile() throws IOException {
      Path path = Paths.get(this.fileName);
      BufferedReader reader = Files.newBufferedReader(path, this.charset);
      // ...
      reader.close();  // Noncompliant
      // ...
      Files.lines(Paths.get("input.txt")).forEach(System.out::println); // Noncompliant: The stream needs to be closed
    }

    private void doSomething() throws IOException {
      OutputStream stream = null;
      try {
        for (String property : propertyList) {
          stream = new FileOutputStream("myfile.txt");  // Noncompliant
          // ...
        }
      } catch (Exception e) {
        // ...
      } finally {
        stream.close();  // Multiple streams were opened. Only the last is closed.
      }
    }
    
}

