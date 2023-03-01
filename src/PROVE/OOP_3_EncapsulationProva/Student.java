package PROVE.OOP_3_EncapsulationProva;

public class Student {
    // STUDENTNAME
    private String studentName;
    public String getStudentName() {return studentName;}

    public void setStudentName(String newStudentName) {this.studentName = newStudentName;}

    // STUDENTAGE
    private int studentAge;
    public int getStudentAge() {return studentAge;}
    public void setStudentAge(int newStudentAge) {                                  //CONSTRAINT 1
        if (newStudentAge < 18 || newStudentAge >= 120) {
            System.out.println("Invalid Age!");
        } else {this.studentAge = newStudentAge;}}

    // STUDENTCORSO
    private String studentCorso = "Java";
    public String getStudentCorso() {return studentCorso;}
    public void setStudentCorso(String newStudentCorso) {this.studentCorso = newStudentCorso;}

    // TASSEPAGATE
    private boolean TaxPaid = true;
    public boolean getTaxPaid() {return TaxPaid;}
    public void setTaxPaid(boolean newTaxPaid) {this.TaxPaid = newTaxPaid;}

    public String messageTaxPaid(boolean TaxPaid) {
        if (TaxPaid == true) {return "PAGATORE REGOLARE";}
        else {return "EVASORE!";}
    }

    // STUDENTESECCHIONE
    private boolean CleverStud = false;
    public boolean getCleverStud() {return CleverStud;}
    public void setCleverStud(boolean newCleverStud) {this.CleverStud = newCleverStud;}
    public String cleverStudMessage(boolean CleverStud) {
        if (CleverStud == true) {return "Nerd";}
        else {return "Asino";}
    }

    // SKIPPED DAYS
    private int schoolDaysSkipped;
    public int getSchoolDaysSkipped() {return schoolDaysSkipped;}
    public void setSchoolDaysSkipped(int skippedDays) {                                 //CONSTRAINTS
        if (skippedDays < 0) {System.out.println("Error: Skipped Days < 0");}
        else if (skippedDays >= 50) {System.out.println("Bocciato!");}
        else {this.schoolDaysSkipped = skippedDays;}
    }

    // BUONI PASTO
    private int numberOfBuoniPasto = 100;
    private int numberOfChecksBuoniPasto = 0;      //COUNTER
    public int getNumberOfChecksBuoniPasto() {return numberOfChecksBuoniPasto;}
    public int getNumberOfBuoniPasto(){numberOfChecksBuoniPasto++; return numberOfBuoniPasto;} //CONSTRAINT
    public void setNumberOfBuoniPasto(int numBuoniPasti) {
        if (numBuoniPasti<0) {System.out.println("La mensa non fa credito.");}
        else {this.numberOfBuoniPasto = numBuoniPasti;}}

    public Student() {
        this.studentName = "STUDENTE_IGNOTO";
        this.numberOfBuoniPasto = 10;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
