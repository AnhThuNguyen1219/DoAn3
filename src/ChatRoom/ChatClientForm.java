package ChatRoom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ChatClientForm extends JFrame implements ActionListener {

	private TextArea chatArea = new TextArea();
	
	public ChatClientForm()
	{
		super();
		this.add(chatArea);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new ChatClientForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
