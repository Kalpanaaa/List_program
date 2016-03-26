package com.aop.couple;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInput_Stream {

	public static void main(String args[]) throws IOException {

		// writing string to a file encoded as modified UTF-8
		@SuppressWarnings("resource")
		DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(
				"/home/kalpana/Desktop/kalpana.txt"));
		dataOut.writeUTF("Khilar" );
		dataOut.writeUTF("Kalpana");

		// Reading data from the same file
		@SuppressWarnings("resource")
		DataInputStream dataIn = new DataInputStream(new FileInputStream(
				"/home/kalpana/Desktop/kalpana.txt"));

		while (dataIn.available() > 0) {

			String k = dataIn.readUTF();
			System.out.print(k + " ");
		}
	}
}
