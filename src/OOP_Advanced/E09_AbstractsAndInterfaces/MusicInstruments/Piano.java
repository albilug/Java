package OOP_Advanced.E09_AbstractsAndInterfaces.MusicInstruments;

public class Piano extends Instruments implements Playable {
    public Piano(String name, String brand){super(name, brand);}
    @Override
    public String play(){return "Plin! Plin! Plon! Plon! Plin! Plin! Plon! Plon! Plinplonplinpplinplonplinplinplinplonplon!";}
}
