
import java.net.Inet4Address;
import java.net.InetAddress;

public class TestingReachability {
    public static void main(String[] args) {
        try{
            InetAddress net= Inet4Address.getByName("172.16.0.1");
            if (net.isReachable(100)) {
                System.out.println("Success");
            } else {
                System.out.println("Failed");
            }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

