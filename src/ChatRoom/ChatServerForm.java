package ChatRoom;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ChatRoom.Server;

public class ChatServerForm extends JFrame implements ActionListener{
	private TextField ip = new TextField(20);
	private TextField port = new TextField(20);
	private Button conn = new Button("Connect");
	private Font font1 = new Font("SansSerif", Font.LAYOUT_LEFT_TO_RIGHT, 20);
	
	public ChatServerForm()
	{
		super();
		//set Form
		
		this.setSize(192*5, 108*5);
		this.setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//Ip 
		this.add(new Label("IP")).setFont(font1);
		this.add(ip).setFont(font1);
		
		//Port
		this.add(new Label("Port")).setFont(font1);
		this.add(port).setFont(font1);
		
		//Start Server button
		this.add(conn).setFont(font1);
		
		//Connect area
		this.add(new TextArea(192*3, 108*3));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatServerForm().setVisible(true);
		Server sv = new Server(1024);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==conn)
		{
			
		}
	}

}
