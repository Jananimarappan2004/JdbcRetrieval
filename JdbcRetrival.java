package JdbcRetrivalPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRetrival {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// step 1: register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
       // step 2 : create connection
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newversion","root","root");
	System.out.println("Connection created");
	
	String sql = "Select name from unisoft where id = 001";
	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	String name = rs.getString("name");
	System.out.println(name);
	con.close();
	}

}
