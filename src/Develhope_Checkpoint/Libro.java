package Develhope_Checkpoint;

public class Libro {
    private String titolo;
    private String autore;
    private int annoPubblicazione = 0;
    private double prezzo;
    private String descrizione;

    //GETTER
    public String getTitolo() {return titolo;}

    public void setTitolo(String titolo) {this.titolo = titolo;}

    public String getAutore() {return autore;}

    public void setAutore(String autore) {this.autore = autore;}

    public int getAnnoPubblicazione() {return annoPubblicazione;}

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    //SETTER
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    //COSTRUTTORI
    Libro(String titolo, String autore, int annoPubblicazione, double prezzo, String descrizione){
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }
    Libro(String titolo, String autore, double prezzo){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    static void confrontaLibri(Libro libro1, Libro libro2){
        if(libro1.getAnnoPubblicazione()> libro2.getAnnoPubblicazione()){
            System.out.println(libro2);
    }
    }

    void stampaInfo(Libro libro1){
        System.out.println("Titolo " + libro1.getTitolo() + ", Autore " + libro1.getAutore() +
                ", Prezzo " + libro1.getPrezzo());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}
