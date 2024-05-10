package jdbctest1;

import java.sql.*;

public class CallProcedure1 {
	
//	SSL = "false";
	static final String DB_URL = "jdbc:mysql://localhost:3306/Banking?useUnicode=false&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";


	static final String USER = "root";
	static final String PASS = "Abhay@123";
	static final String QUERY = "{call get_cust_bal (?,?)}";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				CallableStatement stmt = conn.prepareCall(QUERY);){
			//Bind vlaues into the params.
			stmt.setInt(1, 3);
			
			stmt.registerOutParameter(2, java.sql.Types.INTEGER);
			
			System.out.println("Executing stored procedure...");
			stmt.execute();
			
			int balance = stmt.getInt(2);
			System.out.println("Balance with ID: 1 is:"+balance);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
