package ir.maktab.runner;

import ir.maktab.database.SqlPreparedStatmentForStudent;

import java.sql.SQLException;

public class Student extends Person{

    private int id;
    private SqlPreparedStatmentForStudent sql=new SqlPreparedStatmentForStudent();

    public Student() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void addToDatabase() throws SQLException{
        sql.addStudent();
    }

    @Override
    public void updateDatabase() throws SQLException{
        sql.updateStudent();
    }


}
