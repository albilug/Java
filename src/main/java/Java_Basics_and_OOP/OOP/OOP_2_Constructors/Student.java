package Java_Basics_and_OOP.OOP.OOP_2_Constructors;

public class Student {
    String studentName = "UL1SS3";
    int studentAge = 999;

     public Student(String name, int age) {
         System.out.println("Costruendo!");
         this.studentName = name;
         this.studentAge = age;
         System.out.println("Costruito!");
    }

    public Student(String name) {
        System.out.println("Costruendo!");
        this.studentName = name;
        System.out.println("Costruito!");
    }

    public Student(int age) {
        System.out.println("Costruendo!");
        this.studentAge = age;
        System.out.println("Costruito!");
    }

    public Student() {
        System.out.println("Costruendo!");
        System.out.println("Costruito!");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }

}
