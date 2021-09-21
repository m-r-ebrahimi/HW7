package ir.maktab.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SqlPreparedStatmentForStudent extends SqlStatment{
    private static final String QUERYPRINT= "SELECT * FROM university.student ";
    private static final String QUERYINSERT="INSERT INTO university.student (first_name, last_name) VALUES(?, ?);";
    private static final String QUERYUPDATE= "UPDATE university.student SET first_name=?, last_name=? WHERE id=?;";
    private static final String QUERYDELETE= "DELETE FROM university.student WHERE id=?;";

    public SqlPreparedStatmentForStudent() throws SQLException, ClassNotFoundException {
    }

    public void add() throws SQLException {
        super.add(QUERYINSERT);
    }

    public void update() throws SQLException {
        super.update(QUERYUPDATE);
    }

    public void delete() throws SQLException {
        super.delete(QUERYDELETE);
    }


    public void print() throws SQLException {
        super.print(QUERYPRINT);
    }
}
