package ir.maktab.runner;

import ir.maktab.database.SqlPreparedStatmentForMaster;

import java.sql.SQLException;

public class Master extends Person{

    @Override
    protected void addToDatabase() throws SQLException, ClassNotFoundException {
        SqlPreparedStatmentForMaster sql=new SqlPreparedStatmentForMaster();
        sql.addMaster();
    }
}
