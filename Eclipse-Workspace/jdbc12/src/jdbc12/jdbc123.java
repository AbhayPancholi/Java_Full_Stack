package jdbc12;
import java.sql.*;
public class jdbc123 {



public static void main(String ar[]){

try{
System.out.println(System.getProperty("java.class.path"));

//Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Abhay@123");
System.out.println("Connection established");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from my_table");
while(rs.next()){

System.out.println(rs.getString(1)+":");
System.out.println(rs.getString(2)+":");
System.out.println(rs.getString(3));

}

}catch(SQLException e){
System.out.println(e);}

}
}