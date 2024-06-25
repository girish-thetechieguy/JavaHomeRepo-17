package Java10;

import java.util.List;
import java.util.stream.Collectors;

public class NewFeatures {

    public static void main(String[] args) {

        //1: var
        var name = "John Doe"; // Infers String type
        var age = 30; // Infers int type
        var salary = 50000.0; // Infers double type
        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
        // Compile-time error: var must be initialized
        // var uninitializedVar;

        List<Integer> list = List.of(10,15,20,24);
        //java 9
        List<Integer> newList = list.stream().filter(i->i%3==0).collect(Collectors.toList());
        System.out.println("JAVA 9 implementation");
        for (int object : newList) {
            System.out.println(object);
        }
        System.out.println("JAVA 10 implementation");
        //2: toUnmodifiableList()
        List<Integer> newList10 =  list.stream().filter(i -> i % 3==0).collect(Collectors.toUnmodifiableList());
        for (int object : newList10) {
            System.out.println(object);
        }
        //Here, we cannot do any modification such as add or remove items from the newList.
     }
    
}
