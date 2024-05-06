import java.sql.*;

class Testjdbc4{

public static void main(String ar[]){

try{
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Abhay@123");

String sql = "UPDATE my_table SET name=?, age=?, area=? WHERE id=?";

PreparedStatement statement = con.prepareStatement(sql);

statement.setString(1, "Rajesh");
statement.setInt(2, 35);
statement.setString(3, "Ahemedabad");
statement.setInt(4,1);

int rowsUpdated = statement.executeUpdate();

if (rowsUpdated > 0){
	System.out.println("An existing user was updated");
}

con.close();

}catch(Exception e){System.out.println("An exception occured"+e);}
}
}