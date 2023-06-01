import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class DownloadObject {
    public static void main(String[] args) {
        try{
            URL u=new URL("http://www.google.com");
            Object o=u.getContent();
            System.out.println("I got a "+o.getClass().getName());
        }catch(MalformedURLException ex){
            System.err.println("Is not parsalble URL");
        }
        catch(IOException ex){
            System.err.println(ex);
        }
    }
}
