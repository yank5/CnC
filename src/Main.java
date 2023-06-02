import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
//        HttpClient client=HttpClient.newHttpClient();
//        HttpRequest request= HttpRequest.newBuilder()
//                .uri(URI.create("https://raw.githubusercontent.com/yank5/requestip/main/README.md"))
//                .build();
//        var c=client.send(request, HttpResponse.BodyHandlers.ofString()).body();
//        System.out.println(c);
        ServerSocket socket;
        Socket socketaccept;
        InputStream inputStream;
        try {
            socket = new ServerSocket(0);
            socketaccept = socket.accept();
            socketaccept.setKeepAlive(true);
            inputStream = socketaccept.getInputStream();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        while(true){
            //read is not complete
        }
    }
}