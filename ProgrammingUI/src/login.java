import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login 
{
	public static boolean isLogin = false;
	
	public static JPanel newPanel()
	{ 
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 665));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//write your code below 
		
		//creation and configuration of the dark green panel in the middle
		JPanel largePanel = new JPanel();
		largePanel.setBackground(main.grey);
		largePanel.setLayout(new BorderLayout(0, 0));
		largePanel.setPreferredSize(new Dimension(550, 575));
		
		// creation of two sub panels 
		JPanel picturePanel = new JPanel(); 
		JPanel contentPanel = new JPanel();
		
		// configuration of two sub panels
		picturePanel.setPreferredSize(new Dimension(550, 225));
		picturePanel.setBackground(main.darkgreen);
		picturePanel.setLayout(new BorderLayout());
		contentPanel.setPreferredSize(new Dimension(550, 350));
		contentPanel.setBackground(main.darkgreen);
		
		// adding image to the first sub panel
		JLabel picture = new JLabel(new ImageIcon("ProgrammingUI/src/UserIcon.png"));
		picture.setPreferredSize(new Dimension(191, 191));
		picturePanel.add(picture, BorderLayout.CENTER);
		
		// creating a secondary sub panel inside contentPanel
		JPanel inputPanel = new JPanel(); 
		inputPanel.setPreferredSize(new Dimension(400, 350)); 
		inputPanel.setBackground(main.darkgreen);
		contentPanel.setLayout(new FlowLayout());
		
		// Creation of text fields 
		JTextField nameInput = new JTextField(); 
		JTextField passwordInput = new JTextField();
		
		// creation of labels on the UI
		JLabel title = new JLabel("User Login Page");
		JLabel nameLabel = new JLabel("Username: "); 
		JLabel passwordLabel = new JLabel("Password: ");
		JLabel empty = new JLabel("");
		JLabel empty2 = new JLabel("");
		JLabel errorMsg = new JLabel("");
		
		// configuration of input fields
		nameInput.setPreferredSize(new Dimension(400, 25));
		passwordInput.setPreferredSize(new Dimension(400, 25));
		
		// configuration of title label
		title.setForeground(main.lightgreen);
		title.setPreferredSize(new Dimension(400, 35));
		title.setFont(new Font("Verdana", Font.BOLD, 25));
		title.setHorizontalAlignment(JLabel.CENTER);
		
		// configuration of empty label
		empty.setPreferredSize(new Dimension(400, 15));
		empty2.setPreferredSize(new Dimension(400, 15));
		
		// configuration of name label
		nameLabel.setForeground(main.lightgreen);
		nameLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		// configuration of password label
		passwordLabel.setForeground(main.lightgreen);
		passwordLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		//configuration of error msg label
		errorMsg.setForeground(Color.red);
		errorMsg.setPreferredSize(new Dimension(400, 25));
		errorMsg.setFont(new Font("Verdana", Font.PLAIN, 15));
		errorMsg.setHorizontalAlignment(JLabel.CENTER);
		
		// creation of register button
		JButton loginBtn = new JButton("Register");
		
		// adding everything into the main panel
		inputPanel.add(title);
		inputPanel.add(empty);
		inputPanel.add(nameLabel);
		inputPanel.add(nameInput); 
		inputPanel.add(passwordLabel);
		inputPanel.add(passwordInput);
		inputPanel.add(empty2);
		inputPanel.add(loginBtn);
		inputPanel.add(errorMsg);
		contentPanel.add(inputPanel);
		largePanel.add(picturePanel, BorderLayout.NORTH);
		largePanel.add(contentPanel, BorderLayout.CENTER);
		
		
		//event handling for login button
		loginBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if (nameInput.getText().isEmpty() || passwordInput.getText().isEmpty())
				{ 
					if (nameInput.getText().isEmpty())
					{
						errorMsg.setText("Username cannot be empty");
						JOptionPane.showMessageDialog(null, "Username field cannot be empty", "Username Error", JOptionPane.ERROR_MESSAGE);
					}
					else if (passwordInput.getText().isEmpty())
					{
						errorMsg.setText("Password cannot be empty");
						JOptionPane.showMessageDialog(null, "Password field cannot be empty", "Password Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
				{ 
					if (nameInput.getText().equals(register.username) && passwordInput.getText().equals(register.password))
					{
						login.isLogin = true;
						errorMsg.setText("Login Successfully");
						errorMsg.setForeground(Color.green);
					}
					if (!(nameInput.getText().equals(register.username)) || !(passwordInput.getText().equals(register.password)))
					{
						errorMsg.setText("Login error");
						errorMsg.setForeground(Color.red);
						JOptionPane.showMessageDialog(null, "Login Error \nMaybe account is not created?");
					}
				}
			}
		});
		
		panel.add(largePanel);
		//write your code above
		
		return panel;
	}
}
