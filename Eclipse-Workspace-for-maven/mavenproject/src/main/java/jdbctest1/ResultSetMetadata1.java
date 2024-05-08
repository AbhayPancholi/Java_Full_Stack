package jdbctest1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultSetMetadata1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Abhay@123");
			System.out.println("connectd");
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from my_table");
			ResultSetMetaData rsmd = rs.getMetaData();		
			
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnTypeName(1));
		}catch(Exception e) {}
	}

}
