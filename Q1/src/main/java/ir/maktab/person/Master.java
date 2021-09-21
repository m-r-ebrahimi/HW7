package ir.maktab.person;

import ir.maktab.database.SqlPreparedStatmentForMaster;

import java.sql.SQLException;

public class Master extends Person {
    private final SqlPreparedStatmentForMaster sql = new SqlPreparedStatmentForMaster();
    private int id;

    public Master() throws SQLException, ClassNotFoundException {
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

    @Override
    public void addMaster() {

    }

    @Override
    public void printStudentsMaster() {

    }


}
