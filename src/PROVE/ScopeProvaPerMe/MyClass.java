package PROVE.ScopeProvaPerMe;

public class MyClass {
    private static int count = 0;
    private String privateCheeky = "Croccantini";
    public String publicCheeky = "CHEEEKYYY";
    private static String privateStaticCheeky = "MadeByCheeky";
    public static String publicStaticCheeky = "Cuccia di Cheeky";


   // MyClass(String publicCheeky) {
   //     count++;
   //     this.publicCheeky = publicCheeky;
   // }

    MyClass(String privateCheeky) {
        count++;
        this.privateCheeky = privateCheeky;
    }

    MyClass(){count++;}


    static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "privateCheeky='" + privateCheeky + '\'' +
                ", publicCheeky='" + publicCheeky + '\'' +
                '}';
    }
}