package Java_Basics_and_OOP.Java_Basics.Exercises.E_10;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * AND = &&
     * OR = ||
     * XOR = ^
     */

    /**
     * 1: Using an if statement, print: "Comfortable clothes" if the following conditions are met:
     *
     *    isWarm is true and wearingShorts is true
     *    isWarm is false and wearingShorts is false
     *
     *    If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 19;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = false;
        if (isWarm ^ wearingShorts) {
            System.out.println("Uncomfortable clothes");
        } else {
            System.out.println("Comfortable clothes");
        }
        // Write your code here
    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with an if statement with the && (and)
     *    to check if someone is able to enter the club.
     *
     *    Their shoeType must be "fancy" AND they must be over 18 AND they must have at least 10 euros in their pocket
     *
     *    Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     *    or "stay out" if they don't.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";



        int age = 30;
        double eurosInPocket = 7.5;
        double eurosForEntry = 10;


        if (shoeType.equals("fancy") && age>=18 && eurosInPocket>eurosForEntry) {
            System.out.println("Come in");// Write your code here
        } else {
            System.out.println("stay out");
        }// Write your code here
    }

    /**
     * 3: Write an if else statement to calculate our grade
     *
     *    If our grade is 90%+ of the total, we print "A"
     *    If our grade is 80%+ of the total, we print "B"
     *    If our grade is 70%+ of the total, we print "C"
     *    If our grade is 60%+ of the total, we print "D"
     *    If our grade is under 60% of the total, we print "F"
     *
     *    If 'isTestRetry' we cap the maximum grade at C
     *
     *    Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */
    private static void exercise3() {
        System.out.println("\nExercise 3 - Test Grader:");
        double ourTestScore = 3;
        double maxTestScore = 10;
        double percentTestScore = ourTestScore / maxTestScore * 100;
        boolean isTestRetry = false;
        if (!isTestRetry && percentTestScore >= 90) {
            System.out.println("A");
        } else if (!isTestRetry && percentTestScore < 90 && percentTestScore >= 80) {
            System.out.println("B");
        } else if (!isTestRetry && percentTestScore < 80 && percentTestScore >= 70) {
            System.out.println("C");
        } else {
            if (isTestRetry && percentTestScore>=70) {
                System.out.println("C");
            } else {
                if (percentTestScore < 70 && percentTestScore >=60) {
                    System.out.println("D");
                } else {
                    System.out.println("F"); //standing for Fallito
                }
            }

        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ---------------------------------------------------------------------------------
     *    Write a XOR condition, print "safe" if only one car is driving down the road,
     *    print "CRASH! or No cars" if not.
     *
     *    XOR = ^
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = false;
        boolean onlyOneCarDrivingDownTheRoad = carIsDrivingFromLeftToRight ^ carIsDrivingFromRightToLeft;
        if (onlyOneCarDrivingDownTheRoad) {
            System.out.println("safe");
        } else {
            System.out.println("Crash! or No cars");
        }
    }
}
