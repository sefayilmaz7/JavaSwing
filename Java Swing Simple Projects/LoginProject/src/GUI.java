import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	
		private static JLabel userLabel;
		private static JTextField userText;
		private static JLabel passwordLabel;
		private static JPasswordField passwordText;
		private static JButton button;
		private static JLabel succes;
	
	

	public static void main(String[] args) {
		
		
		JFrame frame = new JFrame("Login");
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new GUI());
		panel.add(button);
		
		
		succes = new JLabel("");
		succes.setBounds(10,110,300,25);
		panel.add(succes);
		
		
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
			
		

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String user = userText.getText();
		String password = passwordText.getText();
		
		
		if(user.equals("Sefa") && password.equals("12345")) {
			
			succes.setText("Login Succesful!");
			

			
		}
		else {
			succes.setText("Wrong username or password!");
		}
		
	}

}
