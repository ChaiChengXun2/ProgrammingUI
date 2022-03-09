import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class register 
{
	public static String username, password;
	
	public static JPanel newPanel()
	{ 
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 665));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//write your code below 
		
		// creation and configuration of the dark green panel in the middle
		JPanel largePanel = new JPanel();
		largePanel.setBackground(main.grey);
		largePanel.setLayout(new BorderLayout(0, 0));
		largePanel.setPreferredSize(new Dimension(550, 575));
		
		// creation of two sub panels 
		JPanel picturePanel = new JPanel(); 
		JPanel contentPanel = new JPanel();
		
		//configurations of two sub panels
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
		JTextField confirmationInput = new JTextField();
		
		// creation of labels on the UI
		JLabel title = new JLabel("Register your accout now!!");
		JLabel nameLabel = new JLabel("Username: "); 
		JLabel passwordLabel = new JLabel("Password: ");
		JLabel confirmationLabel = new JLabel("Confirmation Password: ");
		JLabel empty = new JLabel("");
		JLabel errorMsg = new JLabel("");
		
		// configuration of input fields 
		nameInput.setPreferredSize(new Dimension(400, 25));
		passwordInput.setPreferredSize(new Dimension(400, 25));
		confirmationInput.setPreferredSize(new Dimension(400, 25));
		
		// configuration of title label
		title.setForeground(main.lightgreen);
		title.setPreferredSize(new Dimension(400, 35));
		title.setFont(new Font("Verdana", Font.BOLD, 25));
		title.setHorizontalAlignment(JLabel.CENTER);
		
		// configuration of empty label
		empty.setPreferredSize(new Dimension(400, 15));
		
		// configuration of name label
		nameLabel.setForeground(main.lightgreen);
		nameLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		// configuration of password label
		passwordLabel.setForeground(main.lightgreen);
		passwordLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		// configuration of confirmation label
		confirmationLabel.setForeground(main.lightgreen);
		confirmationLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		// configuration of error msg label
		errorMsg.setPreferredSize(new Dimension(400, 25));
		errorMsg.setFont(new Font("Verdana", Font.PLAIN, 15));
		errorMsg.setHorizontalAlignment(JLabel.CENTER);
		
		// creation of register button
		JButton registerBtn = new JButton("Register");
		
		// adding everything into the main panel
		inputPanel.add(title);
		inputPanel.add(empty);
		inputPanel.add(nameLabel);
		inputPanel.add(nameInput); 
		inputPanel.add(passwordLabel);
		inputPanel.add(passwordInput);
		inputPanel.add(confirmationLabel);
		inputPanel.add(confirmationInput);
		inputPanel.add(registerBtn);
		inputPanel.add(errorMsg);
		contentPanel.add(inputPanel);
		largePanel.add(picturePanel, BorderLayout.NORTH);
		largePanel.add(contentPanel, BorderLayout.CENTER);
		
		// event handling for register button
		registerBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				if (nameInput.getText().isEmpty() || passwordInput.getText().isEmpty() || confirmationInput.getText().isEmpty())
				{ 
					if (nameInput.getText().isEmpty())
					{
						errorMsg.setText("Username cannot be empty");
						errorMsg.setForeground(Color.red);
						JOptionPane.showMessageDialog(null, "Username field cannot be empty", "Username Error", JOptionPane.ERROR_MESSAGE);
					}
					else if (passwordInput.getText().isEmpty())
					{
						errorMsg.setText("Password cannot be empty");
						errorMsg.setForeground(Color.red);
						JOptionPane.showMessageDialog(null, "Password field cannot be empty", "Password Error", JOptionPane.ERROR_MESSAGE);
					}
					else if (confirmationInput.getText().isEmpty())
					{
						errorMsg.setText("Confirmation Password cannot be empty");
						errorMsg.setForeground(Color.red);
						JOptionPane.showMessageDialog(null, "Password field cannot be empty", "Password Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if (!(confirmationInput.getText().equals(passwordInput.getText())))
				{
					errorMsg.setText("Confirmation Password does not match Passowrd");
					JOptionPane.showMessageDialog(null, "Confirmation Password does not match Passowrd", "Password Error", JOptionPane.ERROR_MESSAGE);
				}
				else
				{ 
					errorMsg.setForeground(Color.green);
					errorMsg.setText("Account Succesfully Created");
					register.username = nameInput.getText(); 
					register.password = passwordInput.getText();
				}
			}
		});
		
		panel.add(largePanel);
		
		//write your code above
		
		return panel;
	}
}
