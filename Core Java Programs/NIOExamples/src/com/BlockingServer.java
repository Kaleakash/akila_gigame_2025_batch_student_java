package com;

import java.net.*;
import java.io.*;

public class BlockingServer {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started...");

        while (true) {
            Socket socket = serverSocket.accept(); // BLOCKS
            new Thread(() -> handleClient(socket)).start();
        }
    }

    static void handleClient(Socket socket) {
        try {
            BufferedReader in =
                new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out =
                new PrintWriter(socket.getOutputStream(), true);

            String msg = in.readLine(); // BLOCKS
            out.println("Echo: " + msg);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

