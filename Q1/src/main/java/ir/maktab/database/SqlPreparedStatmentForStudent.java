package ir.maktab.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlPreparedStatmentForStudent extends SqlStatement {
    private static final String QUERYPRINT= "SELECT * FROM university.student ";
    private static final String QUERYPRINTLIST= "SELECT * FROM university.list where student_id=?";
    private static final String QUERYINSERT="INSERT INTO university.student (first_name, last_name) VALUES(?, ?);";
    private static final String QUERYUPDATE= "UPDATE university.student SET first_name=?, last_name=? WHERE id=?;";
    private static final String QUERYDELETE= "DELETE FROM university.student WHERE id=?;";
    private static final String QUERYDELETELIST= "DELETE FROM university.list WHERE student_id=?;";
    private static final String QUERYADDMASTER= "INSERT INTO university.list (student_id, master_id) VALUES(?, ?);";

    public SqlPreparedStatmentForStudent() throws SQLException, ClassNotFoundException {
    }

    public void add() throws SQLException {
        super.add(QUERYINSERT);
    }

    public void update() throws SQLException {
        super.update(QUERYUPDATE);
    }

    public void delete() throws SQLException {
        super.delete(QUERYDELETE,QUERYDELETELIST);
    }


    public void print() throws SQLException {
        super.print(QUERYPRINT);
    }

    public void addMaster() throws SQLException {
        ps = connection.prepareStatement(QUERYADDMASTER);
        System.out.println("Enter student id : ");
        ps.setInt(1, scanner.nextInt());
        System.out.println("Enter master id : ");
        ps.setInt(2, scanner.nextInt());
        scanner.nextLine();
        ps.executeUpdate();
    }

    public void printStudentsMaster() throws SQLException {
        ps = connection.prepareStatement(QUERYPRINTLIST);
        System.out.println("Enter student id : ");
        ps.setInt(1, scanner.nextInt());
        scanner.nextLine();
        ResultSet resultSet = ps.executeQuery();
        System.out.println("student_id \t master_id");
        while (resultSet.next()) {
            int s_id = resultSet.getInt("student_id");
            int m_id = resultSet.getInt("master_id");
            System.out.println(s_id + "\t " +m_id);
        }
    }
}
