package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseOperationExamples {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File ff = new File("image.jpg");
		FileInputStream fis = new FileInputStream(ff);
			BufferedInputStream bis = new BufferedInputStream(fis, 1024);
		FileOutputStream fos = new FileOutputStream("image4.jpg");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		while((ch=bis.read()) != -1) {
			bos.write(ch);
		}
		bos.flush();
		fos.close();
		fis.close();

		System.out.println("image created");
	}

}
