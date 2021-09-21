package ir.maktab;

import java.util.Scanner;

public class Demo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
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
        } while (select != 0);
    }
}
