package lab5;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class downloadwebpage {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			InputStream input = connection.getInputStream();
			FileOutputStream output = new FileOutputStream("home.html");
			
			byte[] buffer = new byte[1024];
			int bytesRead;
			while((bytesRead = input.read(buffer))!=-1) {
				output.write(buffer,0,bytesRead);
			}
			input.close();
			output.close();
			System.out.println("Webpage downloaded Successfully");
		}
		catch (IOException e) {
			System.out.println("Error downloading webpage: "+e.getMessage());
		}
	}
}
