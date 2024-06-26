package Java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * LambdaFunction
 * Out put:
 * 1: OUTPUT  -->
Welcome to Java versions comparison!!
2: OUTPUT  -->
Alice
Bob
Charlie
3: OUTPUT  -->
Sum of even numbers: 6
4: OUTPUT  -->
Doing something else...
5: OUTPUT  -->
Alice
6: OUTPUT  -->
Age: 34
7: OUTPUT  -->
8: OUTPUT  -->
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "javax.script.ScriptEngine.eval(String)" because "engine" is null
        at Java8.Java8FeaturesList.main(Java8FeaturesList.java:66)
 */
public class Java8FeaturesList implements DefaultStaticInterface {

    public static void main(String[] args) {
        // 1. Lambda Expressions:
        Runnable lambdaRunnable = () -> {
            System.out.println("Welcome to Java versions comparison!!");
        };
        System.out.println("1: OUTPUT  -->");
        lambdaRunnable.run();
        // 2. Method References:
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("2: OUTPUT  -->");
        names.forEach(System.out::println);

        // 3. Streams API:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("3: OUTPUT  -->");     
        System.out.println("Sum of even numbers: " + sum);

        // 4: Default and Static Methods in Interfaces:
        Java8FeaturesList java8FeaturesList = new Java8FeaturesList();
        System.out.println("4: OUTPUT  -->");
        java8FeaturesList.doSomething();

        // 5: Optional Class:
        Optional<String> optionalName = Optional.of("Alice");
        System.out.println("5: OUTPUT  -->");
        System.out.println(optionalName.orElse("Unknown"));

        // 6: Date and Time API (java.time package):
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
        Period period = Period.between(birthday, today);
        System.out.println("6: OUTPUT  -->");
        System.out.println("Age: " + period.getYears());

        // 7: Parallel Array Sorting:
        int[] randomNumbers = {5, 2, 8, 1, 9};
        System.out.println("7: OUTPUT  -->");
        Arrays.parallelSort(randomNumbers);

        //8: Nashorn JavaScript Engine
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        try {
            System.out.println("8: OUTPUT  -->");
            engine.eval("print('Hello, Nashorn!');");
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void doSomething() {
        System.out.println("Doing something else...");
        //throw new UnsupportedOperationException("Unimplemented method 'doSomething'");
    }
}