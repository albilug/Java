package PROVE.Simulazione_1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        FootballPlayer mario = new FootballPlayer("Mario", "Rossi",4,10,1);
        FootballPlayer gigi = new FootballPlayer("Gigi", "Bianchi",3,3,14);
        FootballPlayer marta = new FootballPlayer("Marta", "Sbruffon",99,1,0);
        FootballPlayer alessandro = new FootballPlayer("Alex", "Sandro",9,7,8);
        FootballPlayer beppa = new FootballPlayer("Pepsi", "Pig",11,8,2);

        Set<FootballPlayer> trio = new HashSet<>();
        trio.add(mario);
        trio.add(gigi);
        trio.add(marta);

        System.out.println(trio);

        Team teamA = new Team("Team A", trio);
        System.out.println(teamA);
        Team teamB = new Team("Team B", trio);
        System.out.println(teamB);
        teamB.addPlayer(alessandro);
        teamB.addPlayer(beppa);
        System.out.println(teamB);
        System.out.println(teamA);
    }
}
/*
Creare una classe Main nella quale:
a) Istanziare 5 variabili di tipo FootballPlayer (con parametri a scelta) e inserire 3 di loro in un insieme.
b) Istanziare un oggetto di tipo Team teamA passando come parametro al costruttore l'insieme appena creato.
c) Istanziare un oggetto di tipo Team teamB usando il costruttore senza l'insieme in input e poi aggiungere ad esso gli
altri 2 giocatori con il metodo addPlayer.
d) Stampare tutti i giocatori del teamA che hanno: almeno segnato 5 gol oppure ha almeno effettuato 7 assist e ha almeno
20 presenze.
e) Istanziare un teamC i cui giocatori sono quelli del teamA più quelli del teamB.
f) Creare una mappa dove le chiavi sono i giocatori del teamC e i valori sono i loro punteggi calcolati dal metodo score().
g) Stampare tutti i giocatori della mappa che hanno un punteggio superiore a 0.6
 */
