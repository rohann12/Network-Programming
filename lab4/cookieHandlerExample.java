package lab4;

import java.net.*;
import java.util.*;

public class cookieHandlerExample {
    public static void main(String[] args){
        try{
        //set the default cookie manager
        CookieManager cookieManager= new CookieManager();
        CookieHandler.setDefault(cookieManager);
        //create a URl object for the desired page
        URL url= new URL("https://www.oracle.com");
        //open a connection to the url
        HttpURLConnection connection =(HttpURLConnection)url.openConnection();
        //send a request to the server
        connection.setRequestMethod("GET");
        connection.connect();
        //Print the cookie  received from the sever
        Map<String,List<String>>headerFields=connection.getHeaderFields();
        List<String>cookieheader=headerFields.get("Set-Cookie");
        if(cookieheader !=null){
            for(String cookie:cookieheader){
                cookieManager.getCookieStore().add(null,HttpCookie.parse(cookie).get(0));
            }
            System.out.println("Cookies:"+cookieManager.getCookieStore().getCookies());
            //Disconnect the connection
            connection.disconnect();
        }
    }catch(Exception e){
        System.out.println(e);
    }



        
    }
    
}
