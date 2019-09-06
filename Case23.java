
import java.util.Collection;
import javax.activation.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/*
23. Authentication should not rely on insecure "PasswordEncoder"
*/

/**
 *
 * @author john
 */
public class Case23 {
    final InMemoryUserDetailsManager inMemory = new InMemoryUserDetailsManager(getUsers());

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth, DataSource dataSource) throws Exception {
        auth.jdbcAuthentication()
                .dataSource((javax.sql.DataSource) dataSource)
                .usersByUsernameQuery("SELECT * FROM users WHERE username = ?")
                .passwordEncoder(new StandardPasswordEncoder()); // Noncompliant
        // OR
        auth.jdbcAuthentication()
                .dataSource((javax.sql.DataSource) dataSource)
                .usersByUsernameQuery("SELECT * FROM users WHERE username = ?"); // Noncompliant; default uses plain-text
        // OR
        auth.userDetailsService(inMemory); // Noncompliant; default uses plain-text
        // OR
        auth.userDetailsService(inMemory).passwordEncoder(new StandardPasswordEncoder()); // Noncompliant
    }

    private Collection<UserDetails> getUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
