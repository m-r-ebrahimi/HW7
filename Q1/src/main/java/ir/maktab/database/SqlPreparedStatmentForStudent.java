package ir.maktab.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlPreparedStatmentForStudent extends SqlStatment{
    private static String QUERYPRINT= "SELECT * FROM university.student ";
    private static String QUERYINSERT="INSERT INTO university.student (first_name, last_name) VALUES(?, ?);";
    private static String QUERYUPDATE= "UPDATE university.student SET first_name=?, last_name=? WHERE id=?;";
    private static String QUERYDELETE= "DELETE FROM university.student WHERE id=?;";

    public SqlPreparedStatmentForStudent() throws SQLException, ClassNotFoundException {
    }
}
