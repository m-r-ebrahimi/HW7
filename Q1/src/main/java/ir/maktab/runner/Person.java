package ir.maktab.runner;

import java.sql.SQLException;

public abstract class Person {
    private String firstName;
    private String lastName;

    protected abstract void addToDatabase() throws SQLException, ClassNotFoundException;
}
