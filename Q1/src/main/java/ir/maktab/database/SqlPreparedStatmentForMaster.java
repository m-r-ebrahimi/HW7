package ir.maktab.database;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlPreparedStatmentForMaster {
    private Scanner scanner = new Scanner(System.in);
    private static final String QUERY = "SELECT * FROM university.master";
    private Connection connection=DbConnection.createConnection();
    private PreparedStatement ps;

    public SqlPreparedStatmentForMaster() throws SQLException, ClassNotFoundException {
    }

    /*public void addMaster() throws SQLException {
        String query = " INSERT INTO university.master\n" +
                "(first_name, last_name)\n" +
                "VALUES(?, ?);\n";
        ps = connection.prepareStatement(query);
        System.out.println("Enter master' firstname : ");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter master' lastname : ");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }*/
}
