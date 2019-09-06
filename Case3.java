
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

public class Case3 {
    public void processRequest(HttpServletRequest request) throws IOException, ClassNotFoundException {
      ServletInputStream sis = request.getInputStream();
      ObjectInputStream ois = new ObjectInputStream(sis);
      Object obj = ois.readObject(); // Noncompliant
    }
  }
  
