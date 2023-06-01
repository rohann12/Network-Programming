import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Downloadwebpage {
    public static void main(String[] args) {
        try{
        String webPageUrl="https://www.google.com";
        //Replace with the URl of the we page you want to replace
        URL url=new URL(webPageUrl);
        BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer=new BufferedWriter(new FileWriter("webpage.html"));
        //REplace with the name and extension of the file you want to save the web page to
        String line;
        while((line=reader.readLine())!=null){
            writer.write(line);
            writer.newLine();
        }
            reader.close();
            writer.close();
            System.out.println("web page downloaded succesfully");
        
    }catch(IOException e){
        System.out.println(e);
    }
}
}

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.net.URL;

// public class Downloadwebpage {
// public static void main(String args[]) throws IOException {
// String urlString = "http://www.google.com&quot";
// URL url = new URL(urlString);
// try(
// BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
// BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));
// ) {
// String line;
// while ((line = reader.readLine()) != null) {
// writer.write(line);
// }
// System.out.println("Page downloaded.");
// }
// }

// }
