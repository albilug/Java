package Java_Basics_and_OOP.Java_Basics.Exercises.E_16;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Put this into a function
        //double celsius = 30;
        // End
        System.out.println(celsiusToFahrenheitConversion(10));
    }
    static String celsiusToFahrenheitConversion(double celsius) {
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
    }

    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            callName(name); // COME POSSO INSERIRE LA FUNZIONE DI STAMPA (SOUT?) NELLA FUNZIONE?
        }
    }
    static void callName(String name) {
        boolean isNumberInName = name.indexOf('0') >= 0 || name.indexOf('1') >= 0 || name.indexOf('2') >= 0 ||
                name.indexOf('3') >= 0 || name.indexOf('4') >= 0 || name.indexOf('5') >= 0 || name.indexOf('6') >= 0 ||
                name.indexOf('7') >= 0 || name.indexOf('8') >= 0 || name.indexOf('9') >= 0;
        if (isNumberInName) {
            name = "invalid";
        } else {name = name.toUpperCase().trim();}
        System.out.println(name);;
    }


    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99; //SE LE DICHIARO IN FUNZIONE, PERCHÈ DICHIARARLE QUI?
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;
        stampaVariabili();
        // Call your function
    }
    static void stampaVariabili() { //C'È MODO DI ITERARE TRA VARIABILI, INVECE DI SOUT(SINGOLA VARIABILE)?
        double myLunchPrice = 5.99; //ALTERNATIVA AL RIDICHIARARLE IN FUNZIONE?
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        System.out.println(myLunchPrice);
        System.out.println(lunchType);
        System.out.println(description);
        System.out.println(weightInGrams);
    }
}
