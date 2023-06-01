import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressTests {
    public static void main(String args[]) {
        try {
            InetAddress ia=InetAddress.getByName("2404::2004"); //:: represents left hex as 0
            byte[] address=ia.getAddress();
            if (address.length==4) {
                System.out.println("IPV4");
            } else 
                System.out.println("IPV6");
            
        } catch (UnknownHostException ex) {
            System.out.println("I don't know my address");
        }
    
    }
}
