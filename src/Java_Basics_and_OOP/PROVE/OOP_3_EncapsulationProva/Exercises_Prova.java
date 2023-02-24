package Java_Basics_and_OOP.PROVE.OOP_3_EncapsulationProva;

public class Exercises_Prova {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student nuovoStudente1 = new Student();
        nuovoStudente1.setStudentName("Martino");
        nuovoStudente1.setStudentAge(81);
        nuovoStudente1.setStudentCorso("Java for Dummies");
        nuovoStudente1.setCleverStud(true);
        nuovoStudente1.setTaxPaid(false);

        System.out.println(nuovoStudente1.getStudentName() + " is " + nuovoStudente1.getStudentAge() + " years old student," +
                " enrolled in " + nuovoStudente1.getStudentCorso());
        System.out.println(nuovoStudente1.getStudentName() + " is " + nuovoStudente1.messageTaxPaid(nuovoStudente1.getTaxPaid())
        + " and course performance is " + nuovoStudente1.cleverStudMessage(nuovoStudente1.getCleverStud()) + " level");

        // Write and use your 5 getters and setters!
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {                       // LA DIFFICOLTA' STA NELLA FANTASIA...
        System.out.println("\nExercise 2:");
        Student nuovoStudento = new Student();
        nuovoStudento.setStudentName("Gianni");
        nuovoStudento.setStudentAge(18);
        System.out.println(nuovoStudento);

        System.out.println(nuovoStudento.getNumberOfBuoniPasto());
        nuovoStudento.setNumberOfBuoniPasto(-4);
        nuovoStudento.setNumberOfBuoniPasto(30);
        System.out.println(nuovoStudento.getNumberOfBuoniPasto());
        System.out.println(nuovoStudento.getNumberOfChecksBuoniPasto());

        //Write your code here
    }

}
