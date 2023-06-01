import java.io.*;
import java.net.*;
public class socketClient {
    public static void main(String[] args) {
        String serverHostname="localhost";
        int serverPort=134;
        try{
            Socket clientSocket= new Socket(serverHostname,serverPort);
            BufferedReader in =new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            //Send a message to the server
            String message="Hello server!";
            System.out.println(message);
            System.out.flush();
            System.out.println("sent mesaage to server"+message);
            //Read the server's response
            String response=in.readLine();
            System.out.println("Received response from server "+response);
            //Close the connection
            clientSocket.close();
            System.out.println("Connection closed");


        }catch(IOException e){
            System.err.println("Exception caught:"+e);
        }
    }
}
