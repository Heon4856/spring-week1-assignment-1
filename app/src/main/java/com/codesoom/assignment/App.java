package com.codesoom.assignment;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        try {
            final int port = 8000;

            InetSocketAddress address = new InetSocketAddress(port);
            HttpServer httpServer = HttpServer.create(address, 0);
            HttpHandler httpHandler =new AppHttpHandler();
            httpServer.createContext("/",httpHandler);
            httpServer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
