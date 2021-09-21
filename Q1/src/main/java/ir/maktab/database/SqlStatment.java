package ir.maktab.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlStatment {
    private final Scanner scanner = new Scanner(System.in);
    private static String QUERYPRINT;
    private static String QUERYINSERT;
    private static String QUERYUPDATE;
    private static String QUERYDELETE;
    private final Connection connection = DbConnection.createConnection();
    private PreparedStatement ps;

    public SqlStatment() throws SQLException, ClassNotFoundException {
    }

    public void add() throws SQLException {
        ps = connection.prepareStatement(QUERYINSERT);
        System.out.println("Enter firstname : ");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter lastname : ");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }

    public void update() throws SQLException {
        System.out.println();
        print();
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

    public void delete() throws SQLException {
        System.out.println();
        print();
        ps = connection.prepareStatement(QUERYDELETE);
        System.out.println("Enter student' id: ");
        ps.setInt(1, scanner.nextInt());
        scanner.nextLine();
        ps.executeUpdate();
    }

    public void print() throws SQLException {
        ps = connection.prepareStatement(QUERYPRINT);
        ResultSet resultSet = ps.executeQuery();
        System.out.println("id\t\tfirstName\t\tlastName");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            System.out.println(id + "\t\t" + firstName + "\t\t" + lastName);
        }

    }
}
