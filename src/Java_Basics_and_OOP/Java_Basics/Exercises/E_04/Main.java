package Java_Basics_and_OOP.Java_Basics.Exercises.E_04;

public class Main {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int myAge = 29;
        System.out.println("My age is " + myAge);
        // Write your code here
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char initialName = 'A';
        int myAge = 29;
        System.out.println("My age = " + myAge + ", my initial = " + initialName);
        //Write your code here
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        //dichiara variabile booleana hasEatenLunch con valore falso
        boolean hasEatenLunch = false;
        //dichiara variabile double lunchCost con valore 5.99
        double lunchCost = 5.99;
        //stampa stringa + valore corrispondente alla variabile double, poi a capo di una riga.
        System.out.println("Lunch cost=" + lunchCost);
        //stampa stringa + valore corrispondente alla variabile booleana, poi a capo di una riga.
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
