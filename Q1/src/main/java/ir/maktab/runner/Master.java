package ir.maktab.runner;

import ir.maktab.database.SqlPreparedStatmentForMaster;

import java.sql.SQLException;

public class Master extends Person {
    private SqlPreparedStatmentForMaster sql = new SqlPreparedStatmentForMaster();
    private int id;

    public Master() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void addToDatabase() throws SQLException {
        sql.addMaster();
    }

    @Override
    protected void updateDatabase() throws SQLException {
        sql.updateMaster();
    }

    @Override
    protected void deleteDatabase() throws SQLException {
        sql.deleteMaster();
    }


}
