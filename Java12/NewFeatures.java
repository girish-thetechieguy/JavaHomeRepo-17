package Java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFeatures {

    public static void main(String[] args) {

        // 1: String Indent and Transform
        String original = "Hello\nWorld";
        String indented = original.indent(4);
        System.out.println(indented);
        // Output:
        // Hello
        // World

        // 2: String enhancer
        String original1 = "Hello";
        String transformed = original1.transform(s -> s.toUpperCase());
        System.out.println(transformed); // Output: HELLO

        // 3: Files Mismatch
        Path filePath1;
        try {
            filePath1 = Files.createTempFile("file1", ".txt");
            Path filePath2 = Files.createTempFile("file2", ".txt");
            Files.writeString(filePath1, "I love Java");
            Files.writeString(filePath2, "I love Technology");
            long mismatch = Files.mismatch(filePath1, filePath2); // It returns 7
            System.out.println("File mismatch index place: "+mismatch);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
