package Java_Basics_and_OOP.Java_Basics.Exercises.E_03;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        System.out.print("a");
        System.out.print(" ");
        System.out.println("l");
        // Write your code here
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        System.out.print("Quanti anni hai? ");
        System.out.println(29);
        System.out.print("Did you have lunch today? ");
        System.out.println(true);
        System.out.print("How much did it cost? ");
        System.out.println(2.12);
        // Write your code here
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        int age = 29;
        boolean lunch = true;
        double cost = 2.12;
        System.out.println("\nExercise 3:");
        System.out.print("Quanti anni hai? ");
        System.out.println(age);
        System.out.print("Did you have lunch today? ");
        System.out.println(lunch);
        System.out.print("How much did it cost? ");
        System.out.println(cost);
        // Write your code here
    }
}