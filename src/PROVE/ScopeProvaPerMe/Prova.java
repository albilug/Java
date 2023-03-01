package PROVE.ScopeProvaPerMe;

public class Prova {
    public static void main(String[] args) {
    MyClass secondaClasseProva = new MyClass();
    MyClass privatClasseProva = new MyClass("proviamoci private");

        System.out.println(secondaClasseProva);
        System.out.println(privatClasseProva);
        System.out.println(privatClasseProva.getCount());
        System.out.println(privatClasseProva.publicCheeky + privatClasseProva.publicStaticCheeky);
    }
}
