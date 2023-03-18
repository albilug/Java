package OOP_Advanced.E09_AbstractsAndInterfaces.MezziPesanti;

public class Car implements Movable{
    private String carFirm;
    private int carKilometers;
    public Car(String carFirm, int carKilometers){this.carFirm=carFirm; this.carKilometers=carKilometers;}

    @Override public String moveForward(){return "WROOM WROOOOM";}
    @Override public String moveBackward(){return "Biiip! Biiip!";}
}
