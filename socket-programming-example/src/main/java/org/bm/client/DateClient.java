package org.bm.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;

public class DateClient {
	public static void main(final String[] args) throws IOException {
		final String serverAddress = JOptionPane
				.showInputDialog("Enter IP Address of a machine that is\n" + "running the date service on port 9090:");
		final Socket s = new Socket(serverAddress, 9090);
		final BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
		final String answer = input.readLine();
		JOptionPane.showMessageDialog(null, answer);
		System.exit(0);
	}
}
