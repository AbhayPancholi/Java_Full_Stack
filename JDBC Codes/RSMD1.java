import java.sql.*;

public class RSMD1{

public static void main(String ar[]){

String url = "jdbc:mysql://localhost:3306/test";
String username = "root";
String password = "Abhay@123";

try(Connection con = DriverManager.getConnection(url, username, password)){

DatabaseMetaData meta = con.getMetaData();

String productName = meta.getDatabaseProductName();
String productVersion = meta.getDatabaseProductVersion();
System.out.println(productName+ " " + productVersion);


int majorVersion = meta.getDatabaseMajorVersion();
int minorVersion = meta.getDatabaseMinorVersion();
System.out.printf("Database version: %d.%d\n", majorVersion, minorVersion);

String driverName = meta.getDriverName();
String driverVersion = meta.getDriverVersion();
System.out.println("Driver info: "+driverName + " - "+driverVersion );

int jdbcMajorVersion = meta.getJDBCMajorVersion();
int jdbcMinorVersion = meta.getJDBCMinorVersion();

System.out.println("JDBC version: "+jdbcMajorVersion + "-"+jdbcMinorVersion);
}catch(SQLException ex){
System.out.println(ex.getMessage());
ex.printStackTrace();
}

}
}