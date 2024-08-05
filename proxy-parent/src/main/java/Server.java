import configuration.ServerProperties;
import lombok.extern.java.Log;

import java.io.IOException;
import java.net.ServerSocket;

//TODO add slf4j
@Log
public class Server {
    public static void main(String[] args) {
        log.info("Starting server...");
        try {
            ServerSocket serverSocket = new ServerSocket(ServerProperties.SERVER_PORT);
            log.info(String.format("Server started at %s:%s", serverSocket.getInetAddress().getHostAddress(), serverSocket.getLocalPort()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
