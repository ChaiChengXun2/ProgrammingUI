import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zijie
{
	public static JPanel newPanel()
	{ 
		// Main Panel
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new FlowLayout());
				
		//write your code below
		
		JPanel banner = new JPanel();
		banner.setBackground(main.grey);
		banner.setPreferredSize(new Dimension(1050, 300));
		
		panel.add(banner);
		
		//write your code above
		
		return panel;
	}
}
