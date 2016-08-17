package org.bm.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {

	public static void main(final String[] args) throws IOException {
		final ServerSocket listner = new ServerSocket(9090);
		try {
			while (true) {
				final Socket socket = listner.accept();
				try {
					final PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println(new Date().toString());
				} finally {
					socket.close();
				}
			}

		} finally {
			listner.close();
		}
	}

}
