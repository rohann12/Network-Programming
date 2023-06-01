package lab8;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class secureSocket {
    public static void main(String[] args) {
        try {
            //Create SSL socket factory
            SSLSocketFactory factory=(SSLSocketFactory)SSLSocketFactory.getDefault();
            //Create socket 
            SSLSocket socket =(SSLSocket)factory.createSocket("google.com",443);
            //set up input and output streams
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output =new PrintWriter(socket.getOutputStream(),true);
            //Send a request to the server
            output.println("GET/HTTP/1.1");
            output.println("Host:google.com");
            output.println("aef");
            //REad and print the response
            String line;
            while((line=input.readLine())!=null){
                System.out.println(line);
            }
            //close the stream and socket
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
}
