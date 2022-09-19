package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class CustomWebApp {

    private final int port;

    private static final Logger logger = LoggerFactory.getLogger(CustomWebApp.class);

    public CustomWebApp(int port) {
        this.port = port;
    }

    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            logger.info("[CustomWebApp] started {} port.", port);

            Socket clientSocket;
            logger.info("[CustomWebApp] waiting for client.");

            while ((clientSocket = serverSocket.accept()) != null) {
                logger.info("[CustomWebApp] client connection");


            }
        }
    }
}
