package ChatRoom;
import java.awt.*;
import java.awt.event.*;
import ChatRoom.ChatClientForm;

import javax.swing.*;


public class LoginForm extends JFrame implements ActionListener{
	private TextField id = new TextField(20);
	private TextField pass = new TextField(10);
	private static Button loginButton = new Button("Login");
	private static Label a = new Label();

	public LoginForm()
	{
		//Create Frame
		super();
//		Frame f = new Frame();
		this.setSize(500,100);
		setLayout(new FlowLayout());
		this.setTitle("Login");
		this.setVisible(true);
		
		//Add Component
		
		//ID
		this.add(new Label("ID:"));
		this.add(id);
		id.setEditable(true);
		
		//Password
		this.add(new Label("Password:"));
		this.add(pass);
		pass.setEditable(true);
		
		//Button login
		this.add(loginButton);
		loginButton.addActionListener(this);
		
		this.add(a);	
	}

	public static void main(String[] args) {
	LoginForm lg = new LoginForm();

	}

	@Override//Handle Action
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loginButton)
		{
			a.setText("Da Nhan");
		}
	}

}
