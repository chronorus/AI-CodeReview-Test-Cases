
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
28. XML transformers should be secured
*/

/**
 *
 * @author john
 */
public class Case28 {
    public void doit() throws TransformerException {
        Source input = null;
        Result result = null;
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.transform(input, result);
    }
}
