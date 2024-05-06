import java.sql.*;

class Testjdbc3 {

    public static void main(String args[]) {

        try {
            //System.out.println(System.getProperty("java.class.path"));

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Abhay@123");
            System.out.println("Connection established");

            // Create a Statement object
            Statement st = con.createStatement();

            // Add multiple SQL statements to the batch
            st.addBatch("insert into my_table values(5,'Aditya Mheta', 20, 'Amravati')");
            st.addBatch("insert into my_table values(7,'Sonam Singh', 22, 'Aurangabad')");
            st.addBatch("insert into my_table values(8,'Varnan', 52, 'Tamil Nadu')");

            // Execute the batch
            int[] rowsAffected = st.executeBatch();

            // Print the number of rows affected for each statement
            for (int i = 0; i < rowsAffected.length; i++) {
                System.out.println("Number of rows affected by statement " + (i + 1) + ": " + rowsAffected[i]);
            }

            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
