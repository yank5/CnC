import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request= HttpRequest.newBuilder()
                .uri(URI.create("https://raw.githubusercontent.com/yank5/requestip/main/README.md"))
                .build();
        var c=client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        //System.out.println(c);
        //System.out.println(c.complete());
    }
}