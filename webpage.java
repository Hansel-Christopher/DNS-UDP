import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress;

public class webpage {
    public static void main(String[] args) throws IOException{
				String inp;
  			DatagramSocket ds = new DatagramSocket(); 
  
        InetAddress ip = InetAddress.getLocalHost(); 
        byte buf[] = null; 
  						Scanner s = new Scanner(System.in);

        // loop while user not enters "bye" 
        while (true) 
        {
						System.out.println("Enter url: ");
						inp = s.nextLine(); 
  
            buf = inp.getBytes(); 
  
            // Step 2 : Create the datagramPacket for sending 
            // the data. 
            DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234); 
  
            ds.send(DpSend); 
  					if (inp.equals("c")) 
                break; 
				}
			  
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(inp));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("xdg-open " + inp);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
			            // break the loop if user enters "bye" 
            
		
				}
			} 
