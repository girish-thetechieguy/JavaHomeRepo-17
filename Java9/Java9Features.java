package Java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class Java9Features {

    public static void main(String[] args) {
        // 3: Try-with-resources Improvements:
        Path path = Paths.get("/Users/user/Documents/NewTransformation/CodingPractice/JavaPractice/Java9/example.txt");
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4: Process API Improvements:
        ProcessBuilder builder = new ProcessBuilder("ls", "-l");
        Process process;
        try {
            process = builder.start();
            int exitCode = process.waitFor();
            System.out.println("Exit code: " + exitCode);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 5: HTTP/2 Client:
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.google.com/"))
                .build();
        HttpResponse<String> response;
        try {
            response = client.send(request, BodyHandlers.ofString());
            System.out.println(response.statusCode());
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // 6: Reactive Streams: No lib found
        // Publisher<String> publisher = Flowable.just("Hello", "World");
        // Subscriber<String> subscriber = new BaseSubscriber<String>() {
        //     @Override
        //     protected void hookOnNext(String value) {
        //         System.out.println(value);
        //     }
        // };
        // publisher.subscribe(subscriber);

    }

}
