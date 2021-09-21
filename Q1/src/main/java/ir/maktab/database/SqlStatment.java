package ir.maktab.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlStatment {
    protected final Scanner scanner = new Scanner(System.in);
    protected final Connection connection = DbConnection.createConnection();
    protected PreparedStatement ps;

    public SqlStatment() throws SQLException, ClassNotFoundException {
    }

    public void add(String QUERYINSERT) throws SQLException {
        ps = connection.prepareStatement(QUERYINSERT);
        System.out.println("Enter firstname : ");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter lastname : ");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }

    public void update(String QUERYUPDATE) throws SQLException {
        System.out.println();
        ps = connection.prepareStatement(QUERYUPDATE);
        System.out.println("Enter id: ");
        ps.setInt(3, scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter new first name:");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter new last name:");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }

    public void delete(String QUERYDELETE) throws SQLException {
        System.out.println();
        ps = connection.prepareStatement(QUERYDELETE);
        System.out.println("Enter student' id: ");
        ps.setInt(1, scanner.nextInt());
        scanner.nextLine();
        ps.executeUpdate();
    }

    public void print(String QUERYPRINT) throws SQLException {
        ps = connection.prepareStatement(QUERYPRINT);
        ResultSet resultSet = ps.executeQuery();
        System.out.println("id \t firstName \t lastName");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            System.out.println(id + "\t " + firstName + " \t\t " + lastName);
        }

    }
}
