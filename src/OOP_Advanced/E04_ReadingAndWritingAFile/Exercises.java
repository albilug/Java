package OOP_Advanced.E04_ReadingAndWritingAFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("src/OOP_Advanced/E04_ReadingAndWritingAFile/myDirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    // Use the MY_PATH constant

    /** 1: Write a method that writes myString to a file */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            Files.writeString(MY_PATH, myString);
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /** 2:Write a method that reads the file from exercise 1 then prints it out  */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            String contentOfMY_PATH = Files.readString(MY_PATH);
            System.out.println(contentOfMY_PATH);
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }


    }

     /** 3: Write a method that reads a file and print the number of lines in the file */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split
        try {
            String contentOfMY_PATH = Files.readString(MY_PATH);
            String[] lines = contentOfMY_PATH.split("\n"); //creo lista, splittando ad ogni \n
            int numLines = lines.length; //conto n. elementi in lista (sarà = a n. di \n +1)
            System.out.println("Number of lines in " + MY_PATH.toString() + ": " + numLines);
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            String ContentOf_MY_PATH = Files.readString(MY_PATH);
            int numberOfWords = ContentOf_MY_PATH.split(" ").length; //splitto e conto
            System.out.println(numberOfWords);
            Files.delete(MY_PATH); //cancello
            // Your code here
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below*/

    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("src/OOP_Advanced/E04_ReadingAndWritingAFile/myDirectory");

        try {
            // Your code
            Files.createDirectories(myDirectoryPath);
            Files.writeString(PATH_IN_A_FOLDER, "Why am I in a folder?");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

}
