package com;

import java.net.*;
import java.io.*;

public class BlockingClient {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("localhost", 5000);

        PrintWriter out =new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in =
            new BufferedReader(
                new InputStreamReader(socket.getInputStream()));

        out.println("Hello Server");
        System.out.println(in.readLine());

        socket.close();
    }
}

