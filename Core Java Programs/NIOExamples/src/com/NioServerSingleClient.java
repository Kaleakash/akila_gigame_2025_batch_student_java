package com;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NioServerSingleClient {
    public static void main(String[] args) throws Exception {

        ServerSocketChannel server =ServerSocketChannel.open();
        server.bind(new InetSocketAddress(6000));

        System.out.println("NIO Server waiting...");

        SocketChannel client = server.accept(); // BLOCKING
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        client.read(buffer);
        buffer.flip();

        System.out.println("Received: "+ new String(buffer.array(), 0, buffer.limit()));

        buffer.clear();
        buffer.put("Hello Client".getBytes());
        buffer.flip();
        client.write(buffer);

        client.close();
        server.close();
    }
}

