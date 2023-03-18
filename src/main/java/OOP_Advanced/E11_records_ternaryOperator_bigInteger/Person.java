package OOP_Advanced.E11_records_ternaryOperator_bigInteger;

public record Person(String name, int age, String address) {
    @Override
    public String toString() {return "This is " + name + ". Age " + age + " years old. Address is "
                + address;}
    }
