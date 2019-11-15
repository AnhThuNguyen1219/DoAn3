package ChatRoom;
import java.io.*;
import java.net.*;

public class Client extends Thread {
	DataOutputStream dos;
	DataInputStream dis;
	InputStreamReader isr; 
	BufferedReader br ;
	public Client (String host, int port) throws Exception
	{
		Socket s = new Socket(host, port);
		dos=new DataOutputStream(s.getOutputStream());
		dis=new DataInputStream(s.getInputStream());
		isr = new InputStreamReader(System.in);
		br= new BufferedReader(isr);
	}
	
	public void send(String send) throws IOException
	{
		dos.writeUTF(send);
	}
	
	public String recieve() throws IOException
	{
		String rec = dis.readUTF();
		return rec;
	}
	
	public void run()
	{
		String outp="";
		String inp="";
		try {
			outp=br.readLine();
			while(outp!="/0")
			{
				send(outp);
				outp=br.readLine();
			}
			
			inp=recieve();
			while(inp!="/0")
			{
				System.out.println(inp);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) throws Exception 
	{
		Client client = new Client("localhost", 1024);
		client.start();		
	}

}
