package OOP_Advanced.E09_AbstractsAndInterfaces.MezziPesanti;

public class Ship implements Movable{
    private String shipName;
    private boolean isOligarchShip;
    public Ship(String shipName, boolean isOligarchShip){this.shipName=shipName; this.isOligarchShip=isOligarchShip;}
    @Override public String moveForward(){return "SQWUUUIIISH!! SQWUAAASHH!!";}
    @Override public String moveBackward(){return "SWRUUUSHH! SWRAAASHH!!";}
}
