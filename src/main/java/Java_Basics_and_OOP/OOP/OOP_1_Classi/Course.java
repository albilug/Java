package Java_Basics_and_OOP.OOP.OOP_1_Classi;

import java.util.List;

public class Course {
    public static String courseName = "JavaCorso";
    static int maxStudents = 1000;
    static double qualityRatingOutOf10 = 28.50;
    static boolean payInCash = true;
    static int teachersNumber = 10;

    List<Student> students;
    static double staticAverageCourseAge(List<Student> students) {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).studentAge;
        }
        double average = sum / students.size();
        return average;
    }

    double averageCourseAge(){
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).studentAge;
        }
        double average = sum / students.size();
        return average;
    }
}
