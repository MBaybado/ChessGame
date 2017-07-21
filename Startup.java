import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Startup extends JFrame{
	
	private JTextField nameField;
	public String playerName = "";
	public boolean playing;
	
////////////////////////////////////////////////////////////////////

	public Startup (){
		super("Here We Go");
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		
		nameField = new JTextField("Enter Name");
		add(nameField);
		
		NameListener listener = new NameListener();
		nameField.addActionListener(listener);
		
		this.playing = false;
		
	}
	
//////////////////////////////////////////////////////////////////////
	//		EXECUTED WHEN BUTTON PRESSED
	public void setPlayerName(String name){
		
		this.playerName = name;
		this.playing = true;
	}
	
///////////////////////////////////////////////////////////////////////

	private class NameListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){ //black box
			
			setPlayerName(event.getActionCommand()); 
							// ^^ gets the string from the JTextFeild
		}
		
	}
	
///////////////////////////////////////////////////////////////////////

}