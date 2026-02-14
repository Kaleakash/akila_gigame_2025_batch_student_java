package com;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelRead {
    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("data.txt", "r");
        FileChannel channel = file.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(16);
        while (channel.read(buffer) > 0) {
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
        }
        channel.close();
        file.close();
    }
}

