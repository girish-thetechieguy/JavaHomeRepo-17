package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewFeatures {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        //1: for loop is enhanced more
        names.forEach((var name) -> {
            System.out.println("Hello, " + name);
        });

        //2: new String inspectionf methods introduced
        String str = "I\nam\nthe\ncreator of this Blog";
        System.out.println("String lines: "+str.lines().collect(Collectors.toList()));
        System.out.println("String is blank: "+str.isBlank());
        System.out.println("String strip: "+str.strip());

        //3: Read files
        try {
            Path path = Files.writeString(Files.createTempFile("helloworld", ".txt"), "Hi, my name is!");
            System.out.println("File Content is: "+Files.readString(path));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
