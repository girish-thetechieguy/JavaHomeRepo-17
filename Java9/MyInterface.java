package Java9;

interface MyInterface {

    void doSomething();
    default void doSomethingElse() {
        helper();
    }
    private void helper() {
        System.out.println("Helping...");
    }
    
}
