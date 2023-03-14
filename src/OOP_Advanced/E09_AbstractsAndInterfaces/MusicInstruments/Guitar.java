package OOP_Advanced.E09_AbstractsAndInterfaces.MusicInstruments;

public class Guitar extends Instruments implements Playable {
    public Guitar(String name, String brand){super(name, brand);}

    @Override  public String play() {return "SDLENG!! SDLENG!! SDLEEEEEEENG!!";}
}
