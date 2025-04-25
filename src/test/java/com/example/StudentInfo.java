import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student GPA: " + gpa);
        input.close();
    }
}

