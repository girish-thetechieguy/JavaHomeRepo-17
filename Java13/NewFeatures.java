package Java13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFeatures {

    public static void main(String[] args) {

        // 1:Switch Expression (Standard)
        String status = "SUBSCRIBER";

        boolean result = switch (status) {
            case "SUBSCRIBER" -> true;
            case "FREE_TRIAL" -> false;
            default -> throw new IllegalArgumentException("something is murky!");
        };
        System.out.println(result);

        // 2: Multiline Strings (Preview)
        String htmlBeforeJava13 = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";

        String htmlWithJava13 = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;

        System.out.println("htmlBeforeJava13: "+ htmlBeforeJava13);
        System.out.println("htmlWithJava13"+ htmlWithJava13);

    }

}
