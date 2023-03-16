package OOP_Advanced.E10_ObjectClass_Overriding_equals_ToSTring;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String address;


    public String getName(){return name;}
    public int getAge(){return age;}
    public String getAddress() {return address;}

    Person(String name, int age, String address){this.name=name; this.age=age; this.address=address;}

    @Override public String toString() {
        return "This guy's name is " + name + ", he's " + age + " years old and he lives in " + address;}

    @Override public int hashCode() {
        int asciocodischio = 26;
        asciocodischio *= 3 + name.hashCode();
        asciocodischio*= 3 + Integer.hashCode(age);
        asciocodischio*= 3 + address.hashCode();
        return asciocodischio;}
}
