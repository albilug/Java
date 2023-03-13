package OOP_Advanced.E08_Inheritance;

public class Bird extends Animal{
    private double wingSpan;
    double getWingSpan(){return wingSpan;}
    void setWingSpan(double wingSpan){this.wingSpan=wingSpan;}
    Bird(double height, double weight, double wingSpan){
        super(height, weight);
        this.wingSpan=wingSpan;
    }
    double flySpeedMetersPerSecond(){return getWingSpan()*2;}
}