package Java8;
class Person implements GreetingDefaultInterface {
    // No need to override the default greet() method
}

public class DefaultImplementsClass {

    public static void main(String[] args) {
        GreetingDefaultInterface person = new Person();
        person.greet(); // Will use the default method implementation
       }
    
}
