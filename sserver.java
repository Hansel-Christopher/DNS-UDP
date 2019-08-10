import java.io.IOException; 
import java.net.DatagramPacket; 
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.net.SocketException; 
  
public class sserver 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // Step 1 : Create a socket to listen at port 1234 
			
        InetAddress ip = InetAddress.getLocalHost(); 
        DatagramSocket ds = new DatagramSocket(1234); 
        byte[] receive = new byte[65535]; 
  			BufferedReader abc = new BufferedReader(new FileReader("ipadd.text"));
				List<String> domains = new ArrayList<String>();

				while((String domain = abc.readLine()) != null) {
						domains.add(domain);
				}
				abc.close();
        DatagramPacket DpReceive = null; 
				DpReceive = new DatagramPacket(receive, receive.length); 
				ds.receive(DpReceive); 
				System.out.println("Client:-" + data(receive));
				for (int i=0;i<domains.size();i++){
					if(data(receive)==domains.get(i)){
							val = domains.get(i);
							buf = val.getBytes();
							DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234); 
            	ds.send(DpSend);
						
						}
				}

        }
	 public static StringBuilder data(byte[] a) 
    { 
        if (a == null) 
            return null; 
        StringBuilder ret = new StringBuilder(); 
        int i = 0; 
        while (a[i] != 0) 
        { 
            ret.append((char) a[i]); 
            i++; 
        } 
        return ret; 
    } 
    } 
  