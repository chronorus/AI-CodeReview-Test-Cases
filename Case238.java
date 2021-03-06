
import java.util.Optional;

/*
238. Value-based classes should not be used for locking
 */

/**
 *
 * @author john
 */
public class Case238 {
    public void doit() {
        Optional<Foo> fOpt = doSomething();
        synchronized (fOpt) {  // Noncompliant
          // ...
        }
    }
    
    public Optional<Foo> doSomething() {
        return null;
    }
    
}
