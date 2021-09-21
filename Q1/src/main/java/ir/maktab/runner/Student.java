package ir.maktab.runner;

import ir.maktab.database.SqlPreparedStatmentForStudent;

import java.sql.SQLException;

public class Student extends Person{

    @Override
    protected void addToDatabase() throws SQLException, ClassNotFoundException {
        SqlPreparedStatmentForStudent sql=new SqlPreparedStatmentForStudent();
        sql.addStudent();
    }
}
