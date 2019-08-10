import java.util.*;
import java.io.PrintWriter;
import java.io.File;

public class generate{
	public static void main(String args[]) throws Exception{
		int i;
		String[] ipadd= new String[10];
		String[] domains= new String[10];
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		File f = new File("ipadd.text");
		File e = new File("domain.text");
		PrintWriter fw = new PrintWriter(f);
		PrintWriter fe = new PrintWriter(e);
		System.out.println("Please enter domain name:\n");
		for(i=0;i<3;i++){
			int a = rand.nextInt(255);
			int b = rand.nextInt(255);
			int c = rand.nextInt(255);
			int d = rand.nextInt(255);
			String ip = a + "." + b + "." + c + "." + d;
            String domain = s.nextLine();
            ipadd[i] = ip;
            domains[i] = domain;
            System.out.println(ipadd[i]);
        }
        
		System.out.println("\n\nList of Domain names\n");
        for(i=0;i<3;i++){
            System.out.println(domains[i]);
            fw.println(ipadd[i]+"\n");
            fe.println(domains[i]+"\n");
        }
        
        
        fw.close();
        fe.close();
        
	}
}