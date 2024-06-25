package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LambdaFunction
 */
public class Java8FeaturesList {

    public static void main(String[] args) {
        // 1. Lambda function
        Runnable lambdaRunnable = () -> {
            System.out.println("Welcome to Java versions comparison!!");
        };
        System.out.println(lambdaRunnable.toString());
        // 2. Streams Feature
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        List<String> result = fruits.stream()
                .filter(fruit -> fruit.length() > 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result); // Output: [BANANA, ORANGE]

        // 3. Method Reference
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        Arrays.sort(words, String::compareToIgnoreCase);
        System.out.println(words);

    }
}