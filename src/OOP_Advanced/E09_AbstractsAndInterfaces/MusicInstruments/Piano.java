package OOP_Advanced.E09_AbstractsAndInterfaces.MusicInstruments;

public class Piano extends Instruments {
    public Piano(String name, String brand){super(name, brand);}
    @Override public String play() {return "PLIN PLIN! PLON! PLIN!!";}
//Perché funziona anche togliendo l'override? Perchè ho creato un nuovo metodo ?
//Ma allora a cosa serve implementare l'interfaccia, se tanto devo fare Overriding?
}
