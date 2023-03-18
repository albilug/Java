package OOP_Advanced.E09_AbstractsAndInterfaces.GeometricalShapes;

public class Rectangle extends Shape {
    public Rectangle(double height, double width){
        super(height, width);
    }

    @Override
    public double calculateArea() {
        return getHeight()*getWidth();
    }
}
