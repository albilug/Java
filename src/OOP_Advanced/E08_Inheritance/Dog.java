package OOP_Advanced.E08_Inheritance;

public class Dog extends Animal{
    private String breed;
    String getBreed(){return breed;}
    void setBreed(String breed){this.breed =breed;}
    public Dog(double height, double weight, String breed) {
        super(height, weight);
        this.breed = breed;
    }
    double runSpeedMetersPerSecond(){return getHeight()*2;}
}
