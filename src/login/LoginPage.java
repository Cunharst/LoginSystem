package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("login");
	JButton resetButton = new JButton("Reset");
	JTextField UserIdField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIdLabel = new JLabel("User: ");
	JLabel userPasswordLabel = new JLabel("Password: ");
	JLabel messageLabel = new JLabel("");
	
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
	 LoginPage(HashMap<String, String> LogInForOriginal) {
		loginInfo = LogInForOriginal;
		
		userIdLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null, Font.ITALIC,25));
		UserIdField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(225,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(125,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIdLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(UserIdField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == resetButton) {
			UserIdField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()== loginButton) {
			
			String userId = UserIdField.getText();
			String Password = String.valueOf(userPasswordField.getPassword());
			
			if(loginInfo.containsKey(userId)) {
				if(loginInfo.get(userId).equals(Password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Parabéns, você é um bruxo!");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userId);
				}
				
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Você não é um bruxo!");
				}
				
			}
			
			else{
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Nome não encontrado");
			}
			
		}
		
	}
	
}
