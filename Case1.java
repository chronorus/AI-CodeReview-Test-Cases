import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author john
 */
public class Case1 extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String input = req.getParameter("input");
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        try {
            engine.eval(input); // Noncompliant
        } catch (ScriptException ex) {
            Logger.getLogger(Case1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
}
