import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class HTTP2 {

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            System.out.println("New thread: " + (thread.isDaemon() ? "Daemon" : "") + "\n Thread Group: " + thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) {
        connectAndPrintURLJavaOracle();
    }

    public static void connectAndPrintURLJavaOracle() {
        connectAkamaiHTTPClient();
    }

    public static void connectAkamaiHTTPClient() {
        System.out.println("Running HTTP/1.1 example...");
        try{
            HttpClient client = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();
            HttpResponse<String> response = client.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code: " + response.statusCode() + "\nHeaders: " + response.headers() + "\nBody:"+ response.body());
            String responseBody = response.body();
            List<Future<?>> future = new ArrayList<>();

            responseBody.lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src=") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com" + image))
                                    .build();

                            try {
                                HttpResponse<String> imgResponse = client.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Image loaded: " + image + "\nStatus Code: " + imgResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Future images submitted.");
                    });

            future.forEach(f -> {
                try{
                    f.get();
                }
                catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Request time: " + (end - start));
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
