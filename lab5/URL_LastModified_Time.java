package lab5;

import java.util.Date;
import java.net.*;

public class URL_LastModified_Time {
    public static void main(String[] args) throws Exception {
        URL url=new URL("http://example.com");
        URLConnection con=url.openConnection();
        long lastModified=con.getLastModified();
        Date date=new Date(lastModified);
        System.out.println("Last modified time "+date);
    }
}
