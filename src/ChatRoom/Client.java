package ChatRoom;
import java.io.*;
import java.net.*;

public class Client  {
	DataOutputStream dos;
	DataInputStream dis;
	Socket s;
	BufferedReader br; 
	public Client (String host, int port) throws Exception
	{
		s = new Socket(host, port);
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	public String receiveMess() throws IOException
	{
		dis = new DataInputStream(s.getInputStream());
		return dis.readUTF();
	}
	public void sendMess() throws IOException
	{
		dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF(br.readLine());
		dos.flush();
	}
	public void close() throws IOException
	{
		dos.close();
		dis.close();
		s.close();
	}

}
