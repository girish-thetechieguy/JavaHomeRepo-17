package Java8;

public interface DefaultStaticInterface {
    void doSomething();
    default void doSomethingElse() {
        System.out.println("Doing something else...");
    }
    static void doAnotherThing() {
        System.out.println("Doing another thing...");
    }
}
