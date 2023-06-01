package lab4;
import java.io.*;
import java.net.*;


public class httpclient {
    public static void main(String[] args)throws Exception{
        //Create a URL object for the desired page
        URL url= new URL("http://google.com");
        //Open a connection to the URL
        HttpURLConnection connection=(HttpURLConnection)url.openConnection();
        //set request method to GET
        connection.setRequestMethod("GET");
        //Send the request and receive the response
        BufferedReader reader= new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while((line=reader.readLine())!=null){
            System.out.println(line);
        }
        reader.close();
        //Disconnect the connection
        connection.disconnect();
    }


        
 }
    

