package jdbctest1;
import java.sql.*;
public class Scrollable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "Abhay@123";
		
		try(Connection conn = DriverManager.getConnection(url,username, password)){
			
			String sql = "SELECT * FROM my_table";
			
			Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet result = statement.executeQuery(sql);
			
			result.first();
			
			readStudentInfo("first", result);
			
			result.relative(3);
			
			readStudentInfo("relative(3)", result);
			
			result.previous();
			
			readStudentInfo("previous", result);
			
			result.absolute(4);
			
			readStudentInfo("absolute(4)", result);
			
			result.last();
			
			readStudentInfo("last", result);
			
			result.relative(-2);
			
			readStudentInfo("relative(-2)", result);
			
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	private static void readStudentInfo(String position, ResultSet result) throws SQLException{
		String id = result.getString("id");
		String name = result.getString("name");
		String area = result.getString("area");
		
		String studentInfo = "%s: %s - %s - %s\n";
		
		System.out.format(studentInfo, position, name, area, id);
	}

}
