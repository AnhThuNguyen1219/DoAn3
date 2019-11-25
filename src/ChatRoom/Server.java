package ChatRoom;

import java.io.*;
import java.net.*;


public class Server extends Thread{
	DataInputStream dis;
	DataOutputStream dos;
	ServerSocket ss;

	public Server(int port) 
	{
		try {
			ss = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Socket accept()
	{
		try {
			return ss.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void sendMess(String text) throws IOException
	{
		dos=new DataOutputStream(accept().getOutputStream());
		dos.writeUTF(text);
	}
	public String receiveMess() throws IOException 
	{
		dis = new DataInputStream(accept().getInputStream());
		return dis.readUTF();
	}
	
}
