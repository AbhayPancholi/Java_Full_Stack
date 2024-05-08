import java.sql.*;

public class DBMSFeatures1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "Pass@123";
        
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("Support Batch updates: " + meta.supportsBatchUpdates());
            System.out.println("Support Column Aliasing: " + meta.supportsColumnAliasing());
            System.out.println("Support core SQL Grammar: " + meta.supportsCoreSQLGrammar());
            System.out.println("Support Full Outer Joins: " + meta.supportsFullOuterJoins());
            System.out.println("Support Group By: " + meta.supportsGroupBy());

            System.out.println("Support Savepoints: " + meta.supportsSavepoints());
            System.out.println("Support Stored Procedures: " + meta.supportsStoredProcedures());
            System.out.println("Support Subqueries in EXISTS: " + meta.supportsSubqueriesInExists());
            System.out.println("Support Transaction: " + meta.supportsTransactions());
            System.out.println("Support Union : " + meta.supportsUnion());
            System.out.println("Support Union All: " + meta.supportsUnionAll());

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
}