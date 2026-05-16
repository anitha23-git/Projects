import java.util.Scanner;

class Student {

    int id;
    String name;
    double marks;

    void getDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    void displayDetails() {

        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.getDetails();

        s1.displayDetails();
    }
}