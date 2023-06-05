import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws SocketException {
        for(var netint:Collections.list(NetworkInterface.getNetworkInterfaces())) {
            out.printf("Display name: %s\n", netint.getDisplayName());
            out.printf("Name: %s\n", netint.getName());
            Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
            for (InetAddress inetAddress : Collections.list(inetAddresses)) {
                out.printf("InetAddress: %s\n", inetAddress);
            }
            out.println();
        }

        ServerSocket socket;
        Socket socketaccept;
        InputStream inputStream;
        try {
            socket = new ServerSocket(5920);
            socketaccept = socket.accept();
            inputStream = socketaccept.getInputStream();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        while(true){
            //read is not complete
            if(true) {
                try {
                    System.out.print((char) inputStream.read());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                break;
            }
        }
    }
}