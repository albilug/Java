package OOP_Advanced.E08_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /** 1: Create a class "Dog" that extends the Animal class.
     * Add a new field "breed" to Dog class.
     * Write constructor for Dog class that takes in breed, height, and weight as parameters,
     * and passes height and weight to the superclass constructor.
     * Write getters and setters for the breed field.           */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");       //riporto, ma è tutto nelle classi create nel package
  /**      class Dog extends Animal{
            private String breed;
            String getBreed(){return breed;}
            void setBreed(String breed){this.breed =breed;}
            public Dog(double height, double weight, String breed) {
                super(height, weight);
                this.breed = breed;
            }
        } **/
        // Your code here
    }

    /** 2: Create new classes "Fish" and "Bird" that extends the Animal class.
     * Add a new field "species" to Fish class and "wingSpan" to Bird class.
     * Also create constructors, getters and setters            */
    private static void exercise2() {           //idem
        System.out.println("\nExercise 2: ");
  /**      class Fish extends Animal{
            private String species;
            String getSpecies(){return species;}
            void setSpecies(String species){this.species=species;}
            public Fish(double height, double weight, String species){
                super (height, weight);
                this.species=species;
            }
        }**/

  /**       class Bird extends Animal{
            private double wingSpan;
            double getWingSpan(){return wingSpan;}
            void setWingSpan(double wingSpan){this.wingSpan=wingSpan;}
            Bird(double height, double weight, double wingSpan){
                super(height, weight);
                this.wingSpan=wingSpan;
            }
        } **/
        // Your code here
    }


    /** 3 In Dog class create a method runSpeedMetersPerSecond() that returns  Dog's Height * 2
     * In Fish class create a method swimSpeedMetersPerSecond() that returns  Fish's Weight * 2
     * In Bird class create a method flySpeedMetersPerSecond() that returns Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: "); //creo i metodi nelle classi del package, senza aggiornare sopra
        Dog doggo = new Dog(0.8,30,"Uschio");
        Bird birdo = new Bird(0.5, 3, 1 );
        Fish fiscio = new Fish(0.3,10,"Fiscio Siluro");

        if (doggo.runSpeedMetersPerSecond() > birdo.flySpeedMetersPerSecond() &
                doggo.speedMetersPerSecond()> fiscio.speedMetersPerSecond()){
            System.out.println("Doggo is the fastest animal. Here's some info about doggo " + doggo + " speed test "
                    + doggo.speedMetersPerSecond());
        } else if (birdo.flySpeedMetersPerSecond()>fiscio.swimSpeedMetersPerSecond()){
            System.out.println("Birdo is the fastest animal. Here's some info about birdo " + doggo + " speed test "
                    + doggo.speedMetersPerSecond());
        } else {
            System.out.println("Fiscio is the fastest animal. Here's some info about fiscio " + doggo + " speed test "
                    + doggo.speedMetersPerSecond());
        }
    }
}
