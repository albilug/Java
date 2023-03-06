package PROVE.Simulazione_2;

import java.util.ArrayList;
import java.util.List;
/*2) Scrivere un metodo main in una classe Main in cui si effettuano le seguenti
operazioni:
a) Inizializzare una lista coi seguenti oggetti Employee:
i) Mario Gialli, 0.5, 20
ii) Gianni Fannulloni, 0.2, 30
iii) Giorgia Lavoroni, 0.85, 40
*/
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee Gigi = new Employee("Mario Gialli", 0.5F, 20);
        Employee Gianni = new Employee("Gianni Fannulloni", 0.2F, 30);
        Employee Giorgia = new Employee("Giorgia Lavoroni", 0.85F, 40);
        employeeList.add(Gigi);
        employeeList.add(Gianni);
        employeeList.add(Giorgia);
        for (Employee impiegato : employeeList) {
            if (impiegato.canApplyForPromotion()) {
                System.out.println(impiegato.getName() + " Promuovibile!");
            } else if (impiegato.mayBeDemoted()) {
                System.out.println(impiegato.getName() + " Riducibile!");
            }
        }

        /*b) e un'altra lista:
        i) Alessio Antichi, 0.55, 20
        ii) Marianna Figlidelcapo, 0.3, 2
        iii) Gianluigi Figlidelcapo, 0.3, 4*/

            List<Employee> employeeList2 = new ArrayList<>();
            Employee Alessio = new Employee("Alessio Antichi", 0.55F, 20);
            Employee Marianna = new Employee("Marianna Figlidelcapo", 0.3F, 2);
            Employee Gianluigi = new Employee("Gianluigi FiglidelCapo", 0.3F, 4);
            employeeList2.add(Alessio);
            employeeList2.add(Marianna);
            employeeList2.add(Gianluigi);
            for (Employee impiegato2 : employeeList2) {
                if (impiegato2.canApplyForPromotion()) {
                    System.out.println(impiegato2.getName() + " Promuovibile!");
                } else if (impiegato2.mayBeDemoted()) {
                    System.out.println(impiegato2.getName() + " Riducibile!");
                }
            }

            List<Employee> Employee = new ArrayList<>();
            Employee.addAll(employeeList);
            Employee.addAll(employeeList2);
        System.out.println(Employee);
        }
    }
