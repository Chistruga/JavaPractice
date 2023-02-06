package DBTask;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDBTable {
    public void createDBTable() throws SQLException, IOException {
        Connection con = DBConnection.connectToDB();
        Statement statement = con.createStatement();

        String intialTable = "CREATE TABLE WordList " +
                "(ID INT NOT NULL IDENTITY(1,1), " +
                " WORD VARCHAR(255))";
        statement.executeUpdate(intialTable);
        System.out.println("Initial Table is created in the database...");

        String secondTable = "CREATE TABLE WordCount " +
                "(WORD VARCHAR(255))";
        statement.executeUpdate(secondTable);
        System.out.println("Second Table is created in the database...");
    }
}