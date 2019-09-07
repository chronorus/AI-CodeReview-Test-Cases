
import static javax.swing.text.html.FormSubmitEvent.MethodType.GET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
50. Members of Spring components should be injected
 */

/**
 *
 * @author john
 */
@Controller
public class Case50 {
  private String name = null;

  @RequestMapping("/greet", method = GET)
  public String greet(String greetee) {

    if (greetee != null) {
      this.name = greetee;
    }

    return "Hello " + this.name;  // if greetee is null, you see the previous user's data
  }
    
}
