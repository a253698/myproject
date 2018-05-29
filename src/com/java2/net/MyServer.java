package com.java2.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9958);
			Socket socket = server.accept();
			System.out.println("connected");
			InputStream is = socket.getInputStream(is);
			InputStreamReader isr = new InputStreamReader(isr);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			System.out.println(line);
			String tokens[] = line.split(":");
			String command = tokens[0];
			String option = tokens[1];
			System.out.println(command + "/" + option);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
