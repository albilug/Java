package OOP_Advanced.E06_Enum;

import static OOP_Advanced.E06_Enum.Exercises.Operator.calcolatore;
import static OOP_Advanced.E06_Enum.Exercises.Seasons.getSeasonDate;
import static OOP_Advanced.E06_Enum.Exercises.TrafficLight.RED;
import static OOP_Advanced.E06_Enum.Exercises.TrafficLight.getNextTrafficLight;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        for (Days day : Days.values()){
            System.out.println(day.getDayName());
        };
        // Your code here
    }
    enum Days {
        MONDAY("Monday", false),
        TUESDAY("Tuesday", false),
        WEDNESDAY("Wednesday", false),
        THURSDAY("Thursday", false),
        FRIDAY("Friday", false),
        SATURDAY("Saturday", true),
        SUNDAY("Sunday", true);

        private String dayName;
        private boolean dayWeekEnd;
        String getDayName(){return dayName;}
        boolean getDayWeekEnd(){return dayWeekEnd;}
        Days(String dayName, boolean dayWeekEnd){
            this.dayName = dayName;
            this.dayWeekEnd = dayWeekEnd;
        }
    }
    /** 2: Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months. */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        System.out.println(getSeasonDate(Seasons.WINTER));
        // Your code here
    }

    enum Seasons {
        SPRING("21.03 - 21.06"),
        SUMMER("21.06 - 21.09"),
        FALL("21.09 - 21.12"),
        WINTER("21.12 - 21.03");

        private String date;
        public String getDate() {return date;}

        Seasons(String date){this.date = date;}
        public static String getSeasonDate(Seasons season){return season.getDate();}
        }

    /** 3: Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light
     * as input and return the next state.  */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        System.out.println(getNextTrafficLight(RED));
        // Your code here
    }

    public enum TrafficLight {RED, YELLOW, GREEN;

        static TrafficLight nextLight;
        public static TrafficLight getNextTrafficLight(TrafficLight currentLight) {
            switch (currentLight) {
                case GREEN: return nextLight = YELLOW;
                case YELLOW: return nextLight = RED;
                case RED: return nextLight = GREEN;
                default : return nextLight;
            }
        }
    }


    /** 4: Given Days enum from ex.1, add local field "isWeekend", set true for weekend days, false for weekdays.
     * Write an if statement that prints weekend or weekday based on the enum */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        for (Days day : Days.values())
              {if(day.getDayWeekEnd()){System.out.println(day.getDayName() + " is Weekend");}
              else {System.out.println(day.getDayName() + "is Weekday");}
        }
        // Your code here
    }

    /** 5: Create an enum "Operator", values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * Write a method that:
     * - takes two integers and an Operator value as input,
     * - performs the operation and returns the result.                 */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        double num1 = 5;
        double num2 = 2;
        // Your code here
        System.out.println(calcolatore(num1, num2, Operator.ADD));
    }

    public enum Operator {ADD, SUBTRACT, MULTIPLY, DIVIDE;
         static double result;  //mica tanto sicuro di tutti questi static...
        static public double calcolatore(double num1, double num2, Operator operator){
            return switch (operator) {
                case ADD -> result = num1 + num2;
                case SUBTRACT -> result = num1 - num2;
                case MULTIPLY -> result = num1 * num2;
                case DIVIDE -> result = num1 / num2;
                default -> result;
            };
        }
    }

}
