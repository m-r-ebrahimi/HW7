package ir.maktab.database;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;

public class SqlPreparedStatmentForMaster extends SqlStatment {
    private static String QUERYPRINT= "SELECT * FROM university.master ";
    private static String QUERYINSERT="INSERT INTO university.master (first_name, last_name) VALUES(?, ?);";
    private static String QUERYUPDATE= "UPDATE university.master SET first_name=?, last_name=? WHERE id=?;";
    private static String QUERYDELETE= "DELETE FROM university.master WHERE id=?;";

    public SqlPreparedStatmentForMaster() throws SQLException, ClassNotFoundException {
    }
}
