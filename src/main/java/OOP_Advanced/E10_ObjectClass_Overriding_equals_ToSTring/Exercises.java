package OOP_Advanced.E10_ObjectClass_Overriding_equals_ToSTring;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /** 1: Create class "Person" with fields "name", "age", "address".
     * Override `toString()` in Person to display object's name,age,address in user-friendly format.
     * Create instances of Person and print using the overridden `toString()`.                  */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Person persona = new Person("Topo Gigio", 45, "Albero Azzurro 45Dodo");
        Person personcina = new Person("Paperino", 35, "PAPEROPOLI - Walt Disney Studios");
        System.out.println(persona);
        System.out.println(personcina);
        // Your code here
    }

    /** 2:Override`hashCode()` in Person class to generate a unique hashcode based on object's name, age, and address.
     * You can do this by using String.hashCode() to convert strings to ints and adding fields together
     * Create 2 people and print out their hashcodes                                                            */
    private static void exercise2() {
        System.out.println("\nExercise 1: ");
        Person bizzarro = new Person("Weird Person", 75, "Fungolandia 52");
        Person animalista = new Person("Francesco D'Assisi", 30, "Monastero Francescano 01");
        System.out.println(bizzarro.hashCode());
        System.out.println(animalista.hashCode());
        // Your code here
    }

    /** 3:BONUS: Read about the nuances of hashcodes here:
     * https://www.baeldung.com/java-hashcode
     * Don't necessarily expect to understand it all right away, it can get quite complicated                   */
}
