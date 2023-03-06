package PROVE.Simulazione_2;

public class Employee {
    /*
    Creare una classe Employee con i seguenti attributi:
- id: int (createlo autoincrementale)
- name: String
- efficiencyIndex: float
- weeklyWorkingHours: int
*/
    private static int counter;
    private int id;
    private String name;
    private float efficiencyIndex;
    private int weeklyWorkingHours;
    /*
Implementare anche costruttore e getter per ogni attributo ed un setter per l’attributo
“efficiencyIndex”.
*/
    public Employee(String name, float efficiencyIndex, int weeklyWorkingHours) {
        this.id = ++counter;
        this.name = name;
        this.efficiencyIndex = efficiencyIndex;
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    public String getName(){return this.name;}
    public float getEfficiencyIndex(){return this.efficiencyIndex;}
    public int getWeeklyWorkingHours(){return this.weeklyWorkingHours;}

    public void setEfficiencyIndex(float efficiencyIndex){this.efficiencyIndex=efficiencyIndex;}

    /*
Aggiungere un metodo  “canApplyForPromotion()” che ritorna un boolean.
Il metodo “canApplyForPromotion()” ritorna true se weeklyWorkingHours > 35 ed
efficiencyIndex > 0.65.*/
    public boolean canApplyForPromotion() {
        if (weeklyWorkingHours > 35 && efficiencyIndex > 0.65) {
            return true;
        } else {return false;}
    }
    /*
Aggiungere un metodo “mayBeDemoted()” che ritorna un boolean.
Il metodo “mayBeDemoted()” ritorna true se e solo se weeklyWorkingHours < 10 e
efficiencyIndex < 0.5.
*/
    public boolean mayBeDemoted(){
        if (weeklyWorkingHours<10 && efficiencyIndex<0.5){
            return true;
        }  else {return false;}
    }



    /*
2) Scrivere un metodo main in una classe Main in cui si effettuano le seguenti
operazioni:
a) Inizializzare una lista coi seguenti oggetti Employee:
i) Mario Gialli, 0.5, 20
ii) Gianni Fannulloni, 0.2, 30
iii) Giorgia Lavoroni, 0.85, 40
b) e un'altra lista:
i) Alessio Antichi, 0.55, 20
ii) Marianna Figlidelcapo, 0.3, 2
iii) Gianluigi Figlidelcapo, 0.3, 4

c) Stampare a schermo tutti gli impiegati che potrebbero essere promossi
d) Stampare a schermo tutti gli impiegati che potrebbero essere declassati
e) Creare una lista di oggetti Employee unendo le due liste precedentemente
create
f) Stampare il nome e l’efficiencyIndex di ogni persona
g)
     */

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", efficiencyIndex=" + efficiencyIndex +
                ", weeklyWorkingHours=" + weeklyWorkingHours +
                '}';
    }
}
