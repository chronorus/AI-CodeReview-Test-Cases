/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.io.IOException;
import java.io.Reader;
import static jdk.nashorn.internal.objects.ArrayBufferView.buffer;
import org.omg.CORBA.DataInputStream;

/**
 *
 * @author john
 */
public class Case224 extends Reader{

    private Buffer buffer;
    private int pos;
    @Override
    public int read() throws IOException {
      if (pos == buffer.length()) {
        return -1;
      }
      return buffer.getByte(pos++); // Noncompliant, a signed byte value is returned
    }    

    @Override
    public int read(char[] chars, int i, int i1) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static class Buffer {
        int getByte(int pos) {
            return 0;
        }
        int length() {
            return 0;
        }
    }
}
