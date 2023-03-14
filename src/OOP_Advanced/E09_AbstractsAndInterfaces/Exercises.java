package OOP_Advanced.E09_AbstractsAndInterfaces;

import OOP_Advanced.E09_AbstractsAndInterfaces.GeometricalShapes.Circle;
import OOP_Advanced.E09_AbstractsAndInterfaces.GeometricalShapes.Rectangle;
import OOP_Advanced.E09_AbstractsAndInterfaces.MezziPesanti.Car;
import OOP_Advanced.E09_AbstractsAndInterfaces.MezziPesanti.Ship;
import OOP_Advanced.E09_AbstractsAndInterfaces.MusicInstruments.Guitar;
import OOP_Advanced.E09_AbstractsAndInterfaces.MusicInstruments.Piano;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /** 1: Create abstract class "Shape" with fields "height" , "width".
     Create classes "Rectangle" and "Circle" that extend the GeometricShape class and implement calculateArea() method.
     Create instances of both and calculate their area
     To calculate the area copy this:  Math.PI * Math.pow((height / 2), 2)
     BONUS: Make sure height and width values are exactly the same for Circle, change the constructor for this      */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle.calculateArea());
        Circle circle = new Circle(2);
        System.out.println(circle.calculateArea());

        // Your code here
    }

    /** 2: Create interface "Movable" that has methods: moveForward, moveBackward
     * Create classes "Car" and "Boat" that implement Movable Interface
     * Below create instances of both Car and Ship and use methods from the Movable interface.              */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Car panda = new Car("Sfiato", 9998);
        System.out.println(panda.moveBackward() + " " + panda.moveForward());

        Ship yatch = new Ship("Lussuriosa e Sibaritica", true);
        System.out.println(yatch.moveBackward() + " " + yatch.moveForward());
        // Your code here
    }

    /** 3: Create interface "Playable" with abstract method "play()".
     * Create abstract "Instrument" that implements Playable interface and contains fields "name", "brand".
     * Create classes "Guitar" and "Piano" that extend Instrument and implement play() method.
     * Below create instances of Guitar and Piano and use play() method.                        */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Piano pianoforte = new Piano("AlbertoForte", "BrioPiani.srl");
        Guitar chitarra = new Guitar("GianpiRock", "Team1JavaBandBrand");
        System.out.println(pianoforte.play());
        System.out.println(chitarra.play());
        // Your code here
    }
}
