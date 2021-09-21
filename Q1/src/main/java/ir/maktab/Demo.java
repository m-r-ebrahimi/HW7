package ir.maktab;

import ir.maktab.person.Master;
import ir.maktab.person.Person;
import ir.maktab.person.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
    private static final Scanner scanner = new Scanner(System.in);
    private static Person person;
    public static void run() throws SQLException, ClassNotFoundException {
        int select;
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
                case 1 -> {
                    person = new Student();
                    person.printDatabase();
                }
                case 2 -> {
                    person = new Master();
                    person.printDatabase();
                }
                case 3 -> {
                    person = new Student();
                    person.addToDatabase();
                }
                case 4 -> {
                    person = new Master();
                    person.addToDatabase();
                }
                case 5 -> {
                    person = new Student();
                    person.deleteDatabase();
                }
                case 6 -> {
                    person = new Master();
                    person.deleteDatabase();
                }
                case 7 -> {
                    person = new Student();
                    person.updateDatabase();
                }
                case 8 -> {
                    person = new Master();
                    person.updateDatabase();
                }
            }
        } while (select != 0);
    }
}
