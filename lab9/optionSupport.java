package lab9;

import java.io.IOException;
import java.net.*;
import java.nio.channels.*;

public class optionSupport {
    public static void main(String[] args) throws IOException {
        PrintOptions(SocketChannel.open());
        PrintOptions(ServerSocketChannel.open());
        PrintOptions(AsynchronousSocketChannel.open());
        PrintOptions(AsynchronousServerSocketChannel.open());
        PrintOptions(DatagramChannel.open());               
    }
    private static void PrintOptions(NetworkChannel channel) throws IOException{
        System.out.println(channel.getClass().getSimpleName()+"supposts:"); 
        for(SocketOption<?>option:channel.supportedOptions()){
            System.out.println(option.name()+":"+channel.getOption(option));
        }
        System.out.println();
        channel.close();
    }
    
}
