package gosoft.A.I.CodeReviewTestCases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Case203 {
	private Object con = new Object();
	private Date date;
	private double salary;

	public void doit() throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  

		PreparedStatement ps = con.prepareStatement("SELECT fname, lname FROM employees where hireDate > ? and salary < ?");
		ps.setDate(0, date);  // Noncompliant
		ps.setDouble(3, salary);  // Noncompliant
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		  String fname = rs.getString(0);  // Noncompliant
		  // ...
		}
	}
}

