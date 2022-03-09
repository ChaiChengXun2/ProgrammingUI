import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class yueming
{
	public static JPanel newPanel()
	{ 
		ImageIcon FBing = new ImageIcon("src/Global-FoodBanking.png");
		
		JPanel panel = new JPanel(); 
		panel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4,Color.decode("#69a2ff")));
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(Color.decode("#caebd7")); //hex color codes require Color.decode to work
		panel.setLayout(new GridLayout(4,1,1,1));
		
		JLabel FBPic = new JLabel();
		FBPic.setIcon(FBing);
		FBPic.setText("POWERING COMMUNITIES FOR ZERO HUNGER");
		FBPic.setVerticalAlignment(JLabel.TOP);
		FBPic.setHorizontalAlignment(JLabel.CENTER);

		
		
		//panel.add(myLabel, BorderLayout.CENTER); // i am not sure how to center the message still
		
		//write your code below 
		JPanel pain1 = new JPanel();
		JPanel pain2 = new JPanel();
		
		pain1.setBackground(Color.YELLOW);
		pain1.setBounds(0,0,300,300);
		pain1.setLayout(new FlowLayout());
		pain1.add(FBPic);
		panel.add(pain1);
		
		pain2.setBackground(Color.LIGHT_GRAY);
		pain2.setBounds(0,300,300,300);
		pain2.setLayout(new FlowLayout());
		panel.add(pain2);
		
		
		//write your code above
		
		
		return panel;
	}
}
//overall,i still dont know what the hell i am doing
