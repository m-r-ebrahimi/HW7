package ir.maktab.person;

import ir.maktab.database.SqlPreparedStatmentForMaster;
import ir.maktab.database.SqlPreparedStatmentForStudent;
import ir.maktab.database.SqlStatment;

import java.sql.SQLException;

public class Student extends Person {

    private int id;
    private final SqlPreparedStatmentForStudent sql = new SqlPreparedStatmentForStudent();

    public Student() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void addToDatabase() throws SQLException {
        sql.add();
    }

    @Override
    public void updateDatabase() throws SQLException {
        sql.update();
    }

    @Override
    public void deleteDatabase() throws SQLException {
        sql.delete();
    }

    @Override
    public void printDatabase() throws SQLException {
        sql.print();
    }

    public void addMaster() throws SQLException {
        sql.addMaster();
    }

    public void printStudentsMaster() throws SQLException {
        sql.printStudentsMaster();
    }
}
