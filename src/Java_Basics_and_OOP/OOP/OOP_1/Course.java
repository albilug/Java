package Java_Basics_and_OOP.OOP.OOP_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    public static void main(String[] args) {
        exercise2();
        //exercise3();
    }

    String courseName = null;
    Integer maxStudents = null;
    Double qualityRatingOutOf10 = null;
    Boolean fullRemoteCourse = null;
    Integer numberOfTeachers = null;

    public static void exercise2() {
        List<Student> students = new ArrayList<>();
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        for (int i=0; i < studentNames.size(); i++) {
            Student student = createNewStudent(studentNames.get(i), studentAges.get(i));
            students.add(student);
            System.out.println(students.get(i).name + " " + (students.get(i).age));
        }
        double sum = 0;
        double divisore = 0;
        for (int i=0; i < studentNames.size(); i++) {
            sum = sum + studentAges.get(i);
            divisore++;
        }
        double etàMedia = sum/divisore;
        System.out.println(etàMedia);
    // Use a for i loop
    }


    public static Student createNewStudent(String name, Integer age) {
        Student student = new Student();
        student.age = age;
        student.name = name;

        // Write your code here
        return student;
    }

}