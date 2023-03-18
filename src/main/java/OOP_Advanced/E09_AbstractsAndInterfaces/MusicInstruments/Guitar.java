package OOP_Advanced.E09_AbstractsAndInterfaces.MusicInstruments;

public class Guitar extends Instruments {
    public Guitar(String name, String brand){super(name, brand);}
    @Override public String play() {return "SDLENG SDLEEENG!";}
    //Perché funziona anche togliendo l'override? Perchè ho creato un nuovo metodo ?
    //Ma allora a cosa serve implementare l'interfaccia, se tanto devo fare Overriding?
}
