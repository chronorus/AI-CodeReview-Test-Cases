
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Case17 {
    public void doit() throws SQLException {
        Connection conn  = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true\", \"AppLogin\", \"");
        Connection conn2 = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true?user=user&password=");
    }
}
