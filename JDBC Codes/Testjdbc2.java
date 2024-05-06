import java.sql.*;

class Testjdbc2{

public static void main(String args[]){

try{
System.out.println(System.getProperty("java.class.path"));

//Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Abhay@123");
System.out.println("Connection established");

//executing sql dml insert a row
Statement st = con.createStatement();
int numberofrowsaffected = st.executeUpdate("insert into my_table values(6,'Abhishekh Naval', 22, 'Pune')");


System.out.println("number of rows inserted: "+numberofrowsaffected);

con.close();

}catch(SQLException e){
System.out.println(e);}
}
}