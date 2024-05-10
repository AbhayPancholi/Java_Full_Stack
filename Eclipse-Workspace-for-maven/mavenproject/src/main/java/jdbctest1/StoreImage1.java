package jdbctest1;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;

public class StoreImage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/images";
		String user = "root";
		String password = "Abhay@123";
		
		String filepath = "C:/Users/ABHAY/OneDrive/Pictures/Saved Pictures/anime wallpaper.png";
		
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			String sql = "INSERT INTO storeimages (Name, Image) values (?,?)";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, "Wallpaper");
			
			InputStream inputstream = new FileInputStream(new File(filepath));
			statement.setBlob(2, inputstream);
			
			int row = statement.executeUpdate();
			
			if(row>0) {
				System.out.println("A contant was inserted with photo image.");
			}
			conn.close();
			
		}catch(SQLException ex) {
			ex.printStackTrace();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
