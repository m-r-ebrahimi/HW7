package ir.maktab.database;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class SqlPreparedStatmentForMaster {
    private Scanner scanner = new Scanner(System.in);
    private static final String QUERY = "SELECT * FROM university.master ";
    private Connection connection = DbConnection.createConnection();
    private PreparedStatement ps;

    public SqlPreparedStatmentForMaster() throws SQLException, ClassNotFoundException {
    }

    public void addMaster() throws SQLException {
        String query = " INSERT INTO university.master (first_name, last_name) VALUES(?, ?);";
        ps = connection.prepareStatement(query);
        System.out.println("Enter master' firstname : ");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter master' lastname : ");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }

    public void updateMaster() throws SQLException {
        System.out.println();
        printMasters();
        String query = "UPDATE university.master SET first_name=?, last_name=? WHERE id=?;";
        ps = connection.prepareStatement(query);
        System.out.println("Enter master' id: ");
        ps.setInt(3, scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter new first name:");
        ps.setString(1, scanner.nextLine());
        System.out.println("Enter new last name:");
        ps.setString(2, scanner.nextLine());
        ps.executeUpdate();
    }
    public void deleteMaster() throws SQLException {
        System.out.println();
        printMasters();
        String query = "DELETE FROM university.master WHERE id=?;";
        ps = connection.prepareStatement(query);
        System.out.println("Enter student' id: ");
        ps.setInt(1, scanner.nextInt());
        scanner.nextLine();
        ps.executeUpdate();
    }
    public void printMasters() throws SQLException {
        ps = connection.prepareStatement(QUERY);
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
