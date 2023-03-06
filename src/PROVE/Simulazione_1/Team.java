package PROVE.Simulazione_1;
import java.util.HashSet;
import java.util.*;
/*
- Progettare la classe Team che ha i seguenti attributi:
Id
Nome
L'insieme dei giocatori della squadra

Impostare:
- un costruttore in modo che inizializzi id e nome, inizializzando vuoto l'insieme dei giocatori
- un altro costruttore che invece prende come parametro anche un insieme di giocatori.

Aggiungere inoltre nella classe FootballPlayer la squadra in cui gioca come attributo,
con corrispettivi getter e setter. Implementare infine il seguente metodo:

printTeam() : stampa riga per riga nome e cognome di ogni giocatore.
addPlayer(FootballPlayer p) : aggiunge il giocatore p al team.
*/
public class Team {
    private int id;
    private static int counterId = 0;
    private String name;
    private Set<FootballPlayer> giocatori;
    public Team(String name) {
        this.id = ++counterId;
        this.name = name;
        this.giocatori = new HashSet<>();
    }
    public Team(String name, Set<FootballPlayer> players) {
        this.id = ++counterId;
        this.name = name;
        giocatori = players;
    }

    public void printTeam(){
        for( FootballPlayer giocatore : giocatori)
        System.out.println(giocatore.getNome() + giocatore.getCognome());
    }
    public void addPlayer(FootballPlayer player) {
        this.giocatori.add(player);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giocatori=" + giocatori +
                '}';
    }
}

