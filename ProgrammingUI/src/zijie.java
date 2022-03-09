import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zijie
{
	public static JPanel newPanel()
	{ 
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new FlowLayout());
		
		JLabel myLabel = new JLabel("Write your code  here, Zi Jie");
		panel.add(myLabel);
		
		//write your code below 
		
		//write your code above
		
		return panel;
	}
}
