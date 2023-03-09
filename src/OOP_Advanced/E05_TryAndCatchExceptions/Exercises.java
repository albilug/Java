package OOP_Advanced.E05_TryAndCatchExceptions;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /** 1: Uncomment the Files.createFile() line below and write a try catch block that prints its stack trace */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        // Your code here
            try {
                Files.createFile(Path.of("Test.txt"));
            } catch (Exception exception) {
                System.err.println("Errore!");
                exception.printStackTrace();
            }
            }

    /** 2: Write a try-catch block that attempts to open a file
     * In the catch block, print a message that informs the user that the file could not be found. */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
            String userInputFileName = "test-file.txt";
        try {
            Files.readString(Path.of(userInputFileName));
        } catch(Exception exception){
            System.err.println("File could not be found!");
            exception.printStackTrace();
        }
    }

    /** 3: Write a try-catch block that attempts to parse a string as an integer.
     * In the catch block, print a message that informs the user that the input was not a valid integer.*/
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        try {
            Integer.parseInt("house");
        } catch (Exception exception){
            System.err.println("L'input mica è un integer valido...");
            exception.printStackTrace();
        }
    }

    /** 4: Write a try block that around this print statement that attempts to divide 2 numbers.
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException
     * and DivideByZeroException.
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it
     * occurred.  */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here

        Double num1 = 10.0;
        String num2AsString = "0.0";    // Perché sputa fuori "Infinity"? Non prende l'errore?
        try{
            System.out.println(num1/Double.parseDouble(num2AsString));
        } catch (NumberFormatException numberFormatException){
            System.err.println("Number Format is not good!");
        } catch (ArithmeticException divideByZeroException ){
            System.err.println("Divisor is Zero!");
        } catch (Exception exception) {
            System.err.println("Insomma, non va mica bene!");
        }
        // Your catch blocks here

    }
}
