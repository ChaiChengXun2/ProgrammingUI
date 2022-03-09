import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class hongaik {
	public static JPanel newPanel() { 
		
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(Color.decode("#004F8A"));
		panel.setLayout(new FlowLayout());
		
		JLabel myLabel = new JLabel("Write your code  here, Hong Aik");
		panel.add(myLabel);
		//write your code below 
		
		//write your code above
		
		return panel;
	}
}
