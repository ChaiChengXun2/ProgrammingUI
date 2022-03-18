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
		ImageIcon noHungerpic = new ImageIcon("ProgrammingUI\\src\\no-Hunger.png");
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(Color.decode("#caebd7"));
		//hex color codes require Color.decode to work
		panel.setLayout(new BorderLayout());
		
		

		
		
		//panel.add(myLabel, BorderLayout.CENTER); // i am not sure how to center the message still
		
		//write your code below 
		
		
		JLabel sloganTextmain= new JLabel();
		sloganTextmain.setText("<html><br/>POWERING <br/>COMMUNITIES"
				+ "<br/>FOR ZERO<br/>HUNGER </html>");
		sloganTextmain.setFont(new Font("League Spartan",Font.BOLD,32));
		sloganTextmain.setForeground(Color.decode("#009c1f"));
				     
		
		panel.add(sloganTextmain,BorderLayout.WEST);
		JLabel Gmeal = new JLabel(Givemeal);
		JLabel WDonate = new JLabel(Whydonate);
		JLabel NHunger = new JLabel(noHungerpic);
		
		
		
		
		
		JLabel FBPic = new JLabel(FBimg);
	    FBPic.setForeground(Color.decode("#009c1f"));
	    
		
		JPanel Cen = new JPanel(); //center panel created
		Cen.setBackground(Color.decode("#caebd7"));
		Cen.add(Gmeal,BorderLayout.NORTH);
		
		panel.add(Cen,BorderLayout.CENTER);
		
		JPanel Nor = new JPanel();
	    Nor.setLayout(new BorderLayout());//north panel
		
		Nor.setBackground(Color.decode("#68f785"));
		Nor.add(FBPic,BorderLayout.WEST);
		Nor.add(NHunger,BorderLayout.CENTER);
		Nor.add(WDonate,BorderLayout.EAST);
		panel.add(Nor,BorderLayout.NORTH);
		
		JPanel Rig = new JPanel(); //dummy right panel for centerring?
		Rig.setBackground(Color.decode("#caebd7"));
		
		panel.add(Rig,BorderLayout.EAST);
				

		
		
		//write your code above
		
		
		return panel;
	}
}

