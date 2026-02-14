package com;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NioClientSingle {
    public static void main(String[] args) throws Exception {

        SocketChannel client =
            SocketChannel.open(
                new InetSocketAddress("localhost", 6000));

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        buffer.put("Hello Server".getBytes());
        buffer.flip();
        client.write(buffer);

        buffer.clear();
        client.read(buffer);
        buffer.flip();

        System.out.println("Server says: "
            + new String(buffer.array(), 0, buffer.limit()));

        client.close();
    }
}

