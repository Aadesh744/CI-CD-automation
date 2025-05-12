package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;
    private List<Integer> grades;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        OptionalDouble average = grades.stream().mapToInt(Integer::intValue).average();
        return average.orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", averageGrade=" + getAverageGrade() + "}";
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student("Aadesh", 20);
        s1.addGrade(85);
        s1.addGrade(90);
        s1.addGrade(78);

        Student s2 = new Student("Bikesh", 22);
        s2.addGrade(88);
        s2.addGrade(76);
        s2.addGrade(95);

        Student s3 = new Student("Nihil", 19);
        s3.addGrade(92);
        s3.addGrade(89);
        s3.addGrade(85);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("All Students:");
        students.forEach(System.out::println);

        System.out.println("\nStudents with average grade above 85:");
        List<Student> topStudents = students.stream()
                                            .filter(s -> s.getAverageGrade() > 85)
                                            .collect(Collectors.toList());
        topStudents.forEach(System.out::println);
    }
}

