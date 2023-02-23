package Java_Basics_and_OOP.OOP.OOP_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Java_Basics_and_OOP.OOP.OOP_1.Course.staticAverageCourseAge;

public class Exercises {
    public static void main(String[] args) {

        exercise2();
        exercise3();
    }

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called 'Student', add variables
     *    (class variables are called 'fields' or 'attributes')
     *    called 'name' and 'age'
     *    Using the function below set the student name and ages
     *
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> studentsList = new ArrayList<>(); //creo una nuova ArrayList vuota.

        for (int i = 0; i < studentNames.size(); i++) {
            Student studentNew = createNewStudent(studentNames.get(i), studentAges.get(i)); //Metodo costruttore crea studentNew
            studentsList.add(studentNew); //aggiungo ad ArrayList.
        }
        System.out.println(studentsList);
    }

     private static Student createNewStudent(String name, Integer age) {
        Student student = new Student(); //creo oggetto, ci attacco le proprietà studentAge e studentName e le definisco
        student.studentAge = age; //definito dal parametro age
        student.studentName = name; //definito dal parametro age
        // Write your code here
        return student;
    }

    /*
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // --------- COPIO E INCOLLO COME IN EXERCISE2. ----------------
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> studentsList = new ArrayList<>(); //creo una nuova ArrayList vuota.

        for (int i = 0; i < studentNames.size(); i++) {
            Student studentNew = createNewStudent(studentNames.get(i), studentAges.get(i)); //Costruttore crea studentNew
            studentsList.add(studentNew); //aggiungo studentNew a studentList.
        }
        System.out.println(studentsList);

        //--------------- METODO STATIC: proprietà generale di classe Course. --------------
        System.out.println(staticAverageCourseAge(studentsList));
        /* qui studentsList è presa come argomento della seguente funzione.
        DA COURSE:
        static double staticAverageCourseAge(List<Student> students) {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {sum += students.get(i).studentAge;}
        double average = sum / students.size();
        return average;     }                                                           */


        //-------------- METODO NON STATIC: proprietà specifica, a singole istanze. ---------------------
        Course corsoStudenti = new Course();
        /*      creo oggetto corsoStudenti classe Course, con proprietà della classe.
        Es:    $$$List<Student> students;    $$$metodo averageCourseAge;               */

        corsoStudenti.students = studentsList;
        /*      In oggetto corsoStudenti imposto propriet §§§ students = studentList;
        studentList arriva da sopra:    List<Student> studentsList = new ArrayList<>(); */

        System.out.println(corsoStudenti.averageCourseAge());
        /*                      averageCourseAge() è proprietà dell'oggetto corsoStudenti.
        DA COURSE:
        double averageCourseAge(){
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {sum += students.get(i).studentAge;}
        double average = sum / students.size();
        return average;}                                                             */
    }
}
