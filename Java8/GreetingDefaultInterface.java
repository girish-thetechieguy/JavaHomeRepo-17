package Java8;
public interface GreetingDefaultInterface {
    default void greet() {
        System.out.println("Hello, from the interface!");
       }
}
