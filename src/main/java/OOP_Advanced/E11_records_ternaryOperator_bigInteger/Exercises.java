package OOP_Advanced.E11_records_ternaryOperator_bigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /** 1:In main method, create variable x as random number between 0-100 using Math.random() * 100;
     * Use ternary operator to check if x is greater than or equal to 50.
     * If it is, print "x is greater than or equal to 50".  If not, print "x is less than 50".
     * Experiment with different values of x and observe the output         */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        double x = Math.random()*100;
        String isGreaterEqualThan50 = x >= 50 ? "x is greater than or equal to 50" : "x is less than 50";
        System.out.println(isGreaterEqualThan50);
        // Your code here
    }

    /**2:Create a record called "Person" with fields for name, age and address.
     * Add a toString method to Person to print out the data in a different format
     * Print the record to the console              */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Person person = new Person("Pippo", 29, "Via Fasulla 1333");
        System.out.println(person);
        // Your code here
    }

    /**3:In the main method, create a BigInteger variable with a large value.
     * Create a BigDecimal variable with a large value
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * Print the results                    */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        BigInteger biggoInt = new BigInteger("100000000000000000000000000000000021");
        BigDecimal biggoDec = new BigDecimal("0.00010000101000010000010000100010001");
        BigInteger biggoIntDividedBy3 = new BigInteger(String.valueOf(biggoInt.divide(new BigInteger("3"))));
        System.out.println(biggoIntDividedBy3);
        BigDecimal biddoDecDividedByPi = new BigDecimal(String.valueOf(biggoDec.divide(new BigDecimal(Math.PI),30, 1)));
        System.out.println(biddoDecDividedByPi);
        // Your code here
    }

}
