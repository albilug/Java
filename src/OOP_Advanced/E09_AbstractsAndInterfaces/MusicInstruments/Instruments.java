package OOP_Advanced.E09_AbstractsAndInterfaces.MusicInstruments;

public class Instruments {
    private String name;
    private String brand;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getBrand(){return brand;}
    public void setBrand(String brand){this.brand = brand;}

    Instruments(String name, String brand){
        this.name = name;
        this.brand = brand;
    }
}
