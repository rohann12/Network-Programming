import java.net.URL;


public class URLsplitter{
    public static void main(String[] args) {
        try 
    {
        URL url=new URL("https://www.google.com");
      

        System.out.println("Scheme:"+url.getProtocol());
        System.out.println("Authority:"+url.getAuthority());
        System.out.println("Host"+url.getHost());
        System.out.println("Port"+url.getPort());
        System.out.println("Path"+url.getPath());
        System.out.println("Query"+url.getQuery());
        System.out.println("Fragment"+url.getRef());
    }catch(Exception e){
        System.out.println("Error"+e.getMessage());
    }
    }
    
}