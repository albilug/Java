package Develhope_Checkpoint;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Il giro del mondo della pimpa", "Bob Marley", 9.99);
        Libro libro2 = new Libro("Il giro del mondo di tom e gerry", "Scooby Doo", 2001,0.99, "Bibbibi");
        Libro libro3 = new Libro("Smarmottando in montagna", "Asino Jeo", 1999, 9.99,
                "Un giorno gli amici smarmottavano in montagna... e poi???");

        List<Libro> lista = new ArrayList<>();
        lista.add(libro1);
        lista.add(libro2);
        lista.add(libro3);
        Biblioteca bibliotecaDiQuartiere = new Biblioteca("Bibliobus", "Via Fasulla 33", lista);

        Biblioteca bibliotecaGianpi = new Biblioteca("Gianpi", "Via fasullo 21");
        bibliotecaGianpi.addBook(libro1);

        System.out.println(bibliotecaGianpi.cercaLibri("Bob Marley"));
    }
}
