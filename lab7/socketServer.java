package lab7;

import java.io.*;
import java.net.*;

public class socketServer {
	public static void main(String[] args) {
		int serverPort = 134;
		try {
			ServerSocket serverSocket = new ServerSocket(serverPort);
			System.out.println("Server is listening on port " + serverPort);
			
			while(true) {
				Socket clientSocket = serverSocket.accept();
				System.out.println("Accepted connection from client "+ clientSocket.getInetAddress());
				
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
				
				//Read the client's message
				String message = in.readLine();
				System.out.println("Received message from client: "+ message);
				
				//Send a response to the client
				String response = "Hello, client!";
				out.println(response);
				out.flush();
				System.out.println("Sent resposer to client: "+response);
				//Close the connection
				clientSocket.close();
				System.out.println("Connection close");
			}
		}catch(IOException e) {
			System.err.println("Exception caught: "+e);
		}
	}
}