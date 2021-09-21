package ir.maktab.person;

import ir.maktab.database.SqlPreparedStatmentForStudent;

import java.sql.SQLException;

public class Student extends Person {

    private int id;
    private SqlPreparedStatmentForStudent sql = new SqlPreparedStatmentForStudent();

    public Student() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void addToDatabase() throws SQLException {
        sql.addStudent();
    }

    @Override
    public void updateDatabase() throws SQLException {
        sql.updateStudent();
    }

    @Override
    public void deleteDatabase() throws SQLException {
        sql.deleteStudent();
    }

    @Override
    public void printDatabase() throws SQLException {
        sql.printStudents();
    }


}
