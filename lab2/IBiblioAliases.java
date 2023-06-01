import java.net.InetAddress;
import java.net.UnknownHostException;

public class IBiblioAliases{
    public static void main(String args[]){
        try{
        InetAddress ibiblio=InetAddress.getByName("www.facebook.com");
        InetAddress helios=InetAddress.getByName("www.google.com");
        if(ibiblio.equals(helios)){
            System.out.println("1st website is same as second website");
        }
        else{
            System.out.println("not same");
        }
        }catch(UnknownHostException ex){
            System.out.println(11);
        }
    }
}
