package ir.maktab.database;

import java.sql.SQLException;

public class SqlPreparedStatmentForMaster extends SqlStatment {
    private static final String QUERYPRINT = "SELECT * FROM university.master ";
    private static final String QUERYINSERT = "INSERT INTO university.master (first_name, last_name) VALUES(?, ?);";
    private static final String QUERYUPDATE = "UPDATE university.master SET first_name=?, last_name=? WHERE id=?;";
    private static final String QUERYDELETE = "DELETE FROM university.master WHERE id=?;";

    public SqlPreparedStatmentForMaster() throws SQLException, ClassNotFoundException {
    }


    public void add() throws SQLException {
        super.add(QUERYINSERT);
    }

    public void update() throws SQLException {
        super.update(QUERYUPDATE);
    }

    public void delete() throws SQLException {
        super.delete(QUERYDELETE);
    }

    public void print() throws SQLException {
        super.print(QUERYPRINT);
    }
}
