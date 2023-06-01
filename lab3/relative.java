import java.net.URL;
import java.net.URI;
public class relative {
    public static void main(String[] args) throws Exception{
        String baseUrlString="https://www.facebook.com";
        String relativeUriString="/watch/?ref=tab";
        URL baseUrl=new URL(baseUrlString);
        URI relativeUri=new URI(relativeUriString);

        URI resolvedUri=baseUrl.toURI().resolve(relativeUri);
        String resolvedUriString= resolvedUri.toString();
        System.out.println("Resolved URi:"+resolvedUriString);


    }
    
}
