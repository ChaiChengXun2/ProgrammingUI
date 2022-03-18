import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class yueming
{
	public static JPanel newPanel()
	{ 
		ImageIcon FBimg = new ImageIcon("ProgrammingUI/src/Global-FoodBanking.png");
		ImageIcon Givemeal = new ImageIcon("ProgrammingUI\\src\\GiveAmeal.jfif");
		ImageIcon Whydonate = new ImageIcon("ProgrammingUI\\src\\whydonate.png");
		
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(Color.decode("#caebd7"));
		//hex color codes require Color.decode to work
		panel.setLayout(new FlowLayout());
		
		

		
		
		//panel.add(myLabel, BorderLayout.CENTER); // i am not sure how to center the message still
		
		//write your code below 
		JLabel sloganTextmain = new JLabel(); // this is for the second half of the slogan text so that it can have a diffrennt font
		
		
		JLabel FBPic = new JLabel(FBimg);
		FBPic.setHorizontalTextPosition(JLabel.CENTER);
		FBPic.setVerticalTextPosition(JLabel.BOTTOM);
		FBPic.setText("<html>POWERING <br/>COMMUNITIES </html>"); //TOP HALF OF THE SLOGAN,meant to be diffrent font
		FBPic.setFont(new Font("League Spartan",Font.BOLD, 36));
	    FBPic.setForeground(Color.green);
	    FBPic.setBounds(0,0,350,150);
		
		
		
		JPanel NW = new JPanel();
		//northwest panel creation
		
		panel.add(FBPic,0,0);
				

		
		
		//write your code above
		
		
		return panel;
	}
}
//overall,i still dont know what the hell i am doing
