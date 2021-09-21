package ir.maktab.person;

import java.sql.SQLException;

public abstract class Person {
    private String firstName;
    private String lastName;

    public abstract void addToDatabase() throws SQLException;

    public abstract void updateDatabase() throws SQLException;

    public abstract void deleteDatabase() throws SQLException;

    public abstract void printDatabase() throws SQLException;

    public abstract void addMaster() throws SQLException;

    public abstract void printStudentsMaster() throws SQLException;
}
