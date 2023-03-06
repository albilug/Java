package PROVE.Simulazione_1;
/*
Progettare una classe FootballPlayer che ha i seguenti attributi:
Id
Nome
Cognome
Numero di presenze
Numero di gol segnati
Numero di assist

*/

public class FootballPlayer {
    private int id;
    private static int counterId;
    private String nome;
    private String cognome;
    private int presenze;
    private int goal;
    private int assist;
    private Team team;

    public int getId() {return this.id;}
    public String getNome() {return this.nome;}
    public String getCognome(){return this.cognome;}
    public int getPresenze(){return this.presenze;}
    public int getGoal(){return this.goal;}
    public int getAssist(){return this.assist;}
    public void setPresenze(int presenze){this.presenze = presenze;}
    public void setGoal(int goal){this.goal = goal;}
    public void setAssist(int assist){this.assist = assist;}
    public Team getTeam(){return this.team;}
    public void setTeam(Team team){this.team = team;}



    public FootballPlayer(String nome, String cognome, int presenze, int goal, int assist) {
        this.id = ++counterId;
        this.nome = nome;
        this.cognome = cognome;
        this.presenze = presenze;
        this.goal = goal;
        this.assist = assist;
    }

    public FootballPlayer(String nome, String cognome) {
        this.id = ++counterId;
        this.nome = nome;
        this.cognome = cognome;
        this.presenze = presenze;
        this.goal = goal;
        this.assist = assist;

    }
    /*La classe avrà infine i seguenti metodi:
- score() : questo metodo calcola quanto un giocatore sia incisivo in campo. Il punteggio è dato da
(numeroGol + (0.75*numeroAssist)) / numeroPresenze.*/
    double score(int goal, int assist, int presenze) {
        return (goal + (0.75*assist))/presenze;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "id=" + id +
                ", counterId=" + counterId +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", presenze=" + presenze +
                ", goal=" + goal +
                ", assist=" + assist +
                ", team=" + team +
                '}';
    }
}
