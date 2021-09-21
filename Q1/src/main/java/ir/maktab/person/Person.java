package ir.maktab.person;

import ir.maktab.database.SqlStatment;

import java.sql.SQLException;

public abstract class Person {
    private String firstName;
    private String lastName;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public abstract void addToDatabase() throws SQLException;

    public abstract void updateDatabase() throws SQLException;

    public abstract void deleteDatabase() throws SQLException;

    public abstract void printDatabase() throws SQLException;

    public abstract void addMaster() throws SQLException;

    public abstract void printStudentsMaster() throws SQLException;
}
