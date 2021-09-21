package ir.maktab;

import ir.maktab.person.Master;
import ir.maktab.person.Person;
import ir.maktab.person.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
    private static final Scanner scanner = new Scanner(System.in);
    private static Person student;
    private static Person master;

    static {
        try {
            student = new Student();
            master = new Master();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void run() {
        int select;
        try{
            do {
                System.out.println("""
                    ==============================
                    1)See Students
                    2)See Masters
                    3)Add Student
                    4)Add Master
                    5)Delete Student
                    6)Delete Master
                    7)Update Student
                    8)Update Master
                    0)EXIT
                    """);
                select=scanner.nextInt();
                switch (select) {
                    case 1 -> student.printDatabase();
                    case 2 -> master.printDatabase();
                    case 3 -> student.addToDatabase();
                    case 4 -> master.addToDatabase();
                    case 5 -> student.deleteDatabase();
                    case 6 -> master.deleteDatabase();
                    case 7 -> student.updateDatabase();
                    case 8 -> master.updateDatabase();
                }
            } while (select != 0);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
