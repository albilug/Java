package OOP_Advanced.E08_Inheritance;

public class Fish extends Animal{
    private String species;
    String getSpecies(){return species;}
    void setSpecies(String species){this.species=species;}
    public Fish(double height, double weight, String species){
        super (height, weight);
        this.species=species;
    }
    double swimSpeedMetersPerSecond(){return getWeight()*2;}
}
