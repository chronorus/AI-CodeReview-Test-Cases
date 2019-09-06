
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Case13 {
    public void doit() throws FileNotFoundException, IOException, XMLStreamException {
        /* Load XML stream and display content */
        String maliciousSample = "xxe.xml";
        XMLInputFactory factory = XMLInputFactory.newInstance();
        String malicousSample = null;

        try (FileInputStream fis = new FileInputStream(malicousSample)) {
          // Load XML stream
          XMLStreamReader xmlStreamReader = factory.createXMLStreamReader(fis);  // Noncompliant; reader is vulnerable
        }
    }
}
