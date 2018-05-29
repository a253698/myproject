package com.java2.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;

public class Tester extends JFrame {
	public Tester() {
		setSize(300, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			Socket socket = new Socket("ppt.cc", 23);
			InputStream is = socket.getInputStream();
			int data = 0;
			for (int i = 0; i < 5000; i++) {
				data = is.read();
				System.out.println((char) data);
			}
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
