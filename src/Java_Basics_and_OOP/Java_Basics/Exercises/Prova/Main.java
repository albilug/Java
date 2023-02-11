package Java_Basics_and_OOP.Java_Basics.Exercises.Prova;

public class Main {
public static void main(String[] args) {
    double score = 0.00;
    String text = "prova prova 123 prova";
    int maxScore = 20;
    score = text.length();
    System.out.println(text.length());
    if (text.length()>maxScore) {
        score = 20;
    }
    System.out.println(score);
}
}
