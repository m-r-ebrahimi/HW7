package ir.maktab.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlPreparedStatmentForStudent {
    private final Scanner scanner = new Scanner(System.in);
    private static final String QUERY = "SELECT * FROM university.student";
    private final Connection connection = DbConnection.createConnection();
    private PreparedStatement ps;

    public SqlPreparedStatmentForStudent() throws SQLException, ClassNotFoundException {
    }

    public void addStudent() throws SQLException {
        String query = " INSERT INTO university.student (first_name, last_name) VALUES(?, ?);";
        ps = connection.prepareStatement(query);
        System.out.println("Enter student' firstname : ");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter student' lastname : ");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }
}
