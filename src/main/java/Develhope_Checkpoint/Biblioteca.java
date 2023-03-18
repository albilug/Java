package Develhope_Checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    String nomeBiblioteca;
    String indirizzoBiblioteca;
    List<Libro> listaLibri = new ArrayList<>();

    //GETTER
    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public String getIndirizzoBiblioteca() {
        return indirizzoBiblioteca;
    }

    //SETTER
    public void setIndirizzoBiblioteca(String indirizzoBiblioteca) {
        this.indirizzoBiblioteca = indirizzoBiblioteca;
    }

    public List<Libro> getListaLibri() {
        return listaLibri;
    }

    public void setListaLibri(List<Libro> listaLibri) {
        this.listaLibri = listaLibri;
    }

    //COSTRUTTORE
    Biblioteca(String nomeBiblioteca, String indirizzoBiblioteca, List<Libro> listaLibri) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzoBiblioteca = indirizzoBiblioteca;
        this.listaLibri = listaLibri;
    }

    Biblioteca(String nomeBiblioteca, String indirizzoBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzoBiblioteca = indirizzoBiblioteca;
    }

    List<Libro> cercaLibri(String stringa) {
        List<Libro> listaRicerca = new ArrayList<>();
        for (Libro libro : this.listaLibri) {
            if (stringa == libro.getAutore() || stringa == libro.getTitolo()) {
                listaRicerca.add(libro);
            }
        }
        return listaRicerca;
    }

    void stampaLibriInBiblio (){
        System.out.println(getListaLibri());
    }

    void addBook(Libro libro){
        listaLibri.add(libro);
    }
}
