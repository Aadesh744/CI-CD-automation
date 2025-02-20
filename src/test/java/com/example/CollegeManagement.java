import java.util.*;

class Student {
    int id;
    String name;
    String department;
    double cgpa;

    public Student(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", CGPA: " + cgpa;
    }
}

class Course {
    int courseId;
    String courseName;
    String instructor;

    public Course(int courseId, String courseName, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Instructor: " + instructor;
    }
}

public class CollegeManagement {
    static List<Student> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- College Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Add Course");
            System.out.println("4. Display All Courses");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    addCourse();
                    break;
                case 4:
                    displayCourses();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = scanner.nextDouble();

        students.add(new Student(id, name, department, cgpa));
        System.out.println("Student added successfully.");
    }

    public static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("\n--- List of Students ---");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void addCourse() {
        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Enter Instructor Name: ");
        String instructor = scanner.nextLine();

        courses.add(new Course(courseId, courseName, instructor));
        System.out.println("Course added successfully.");
    }

    public static void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses to display.");
        } else {
            System.out.println("\n--- List of Courses ---");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }
}

