package ir.maktab.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlPreparedStatmentForStudent {
    private final Scanner scanner = new Scanner(System.in);
    private static final String QUERY = "SELECT * FROM university.student ";
    private final Connection connection = DbConnection.createConnection();
    private PreparedStatement ps;

    public SqlPreparedStatmentForStudent() throws SQLException, ClassNotFoundException {
    }

    public void addStudent() throws SQLException {
        String query ="INSERT INTO university.student (first_name, last_name) VALUES(?, ?);";
        ps = connection.prepareStatement(query);
        System.out.println("Enter student' firstname : ");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter student' lastname : ");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }
    public void updateStudent() throws SQLException {
        System.out.println();
        printStudents();
        String query = "UPDATE university.student SET first_name=?, last_name=? WHERE id=?;";
        ps = connection.prepareStatement(query);
        System.out.println("Enter student' id: ");
        ps.setInt(3, scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter new first name:");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter new last name:");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }

    public void deleteStudent() throws SQLException {
        System.out.println();
        printStudents();
        String query = "DELETE FROM university.student WHERE id=?;";
        ps = connection.prepareStatement(query);
        System.out.println("Enter student' id: ");
        ps.setInt(1, scanner.nextInt());
        scanner.nextLine();
        ps.executeUpdate();
    }

    public void printStudents() throws SQLException {
        ps = connection.prepareStatement(QUERY);
        ResultSet resultSet=ps.executeQuery();
        System.out.println("id\t\tfirstName\t\tlastName");
        while(resultSet.next()) {
            int id=resultSet.getInt("id");
            String firstName=resultSet.getString("first_name");
            String lastName=resultSet.getString("last_name");
            System.out.println(id+"\t\t"+firstName+"\t\t"+lastName);
        }
    }
}
