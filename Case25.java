/*
Case 25. Persistent entities should not be used as arguments of "@RequestMapping" methods
*/
import javax.persistence.Entity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author john
 */
public class Case25 {
    @Entity
    public class Client {
      String clientId;
      String name;
      String password;
    }
    
    @Controller
    public class WishListController {
      @RequestMapping(value = "/saveForLater", method = RequestMethod.POST)
      public void saveForLater(Wish wish) {
        session.save(wish);
      }
    }
    @Entity
    public class Wish {
      Long productId;
      Long quantity;
      Client client;
    }




}
