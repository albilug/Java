package OOP_Advanced.E09_AbstractsAndInterfaces.GeometricalShapes;

public class Circle extends Shape{

  //  Circle(double height, double width) {
  //      super(height, width);
  //      if (height != width) {
  //          setWidth(getHeight());
  //          System.out.println("Width value set equal to Heigth value. It's a circle!");

    public Circle(double radius){
        super(radius,radius);
        }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
