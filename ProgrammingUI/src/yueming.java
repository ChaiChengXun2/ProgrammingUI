import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class yueming
{
	public static JPanel newPanel()
	{ 
		ImageIcon FBimg = new ImageIcon("ProgrammingUI/src/Global-FoodBanking.png");
		//ImageIcon Givemeal = new ImageIcon("ProgrammingUI\\src\\GiveAmeal.jfif");
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
		sloganTextmain.setFont(new Font("League Spartan",Font.BOLD,30));
		sloganTextmain.setForeground(Color.decode("#009c1f"));
		
		JLabel DonationR = new JLabel();
		DonationR.setText("<html><br/>COVID-19 has increased food <br/>insecurity to its highest levels in"
				+ "<br/>decades. The Global FoodBanking<br/>Network (GFN) helps frontline food"
				+ "<br/> banks respond to immediate needs <br/>while powering a community-driven"
				+ "<br/>response that builds resilience for <br/> the future.</html>");//paragraph text for donation reason
		DonationR.setFont(new Font("Alice",Font.PLAIN, 20));
		DonationR.setForeground(Color.decode("#00871b"));
				     
		
		
		//JLabel Gmeal = new JLabel(Givemeal);
		JLabel WDonate = new JLabel(Whydonate);
		JLabel NHunger = new JLabel(noHungerpic);
		
		JPanel DmealNow = chengxun.createCard("GIVE SOMEONE A MEAL","ProgrammingUI\\src\\GiveAmeal.jfif");
		//card created so that i can display image while have the fuction of a button
		DmealNow.setBackground(Color.decode("#caebd7"));
		
		
		JLabel FBPic = new JLabel(FBimg);
	    FBPic.setForeground(Color.decode("#009c1f"));
	    
		
		JPanel Cen = new JPanel(); //center panel created
		Cen.setBackground(Color.decode("#caebd7"));
		Cen.setLayout(new BorderLayout());
		//Cen.add(Gmeal,BorderLayout.CENTER);
		Cen.add(sloganTextmain,BorderLayout.WEST);
		Cen.add(DonationR,BorderLayout.EAST);
		Cen.add(DmealNow,BorderLayout.CENTER);
		
		panel.add(Cen,BorderLayout.CENTER);
		
		JPanel Nor = new JPanel();
	    Nor.setLayout(new BorderLayout());//north panel
		
		Nor.setBackground(Color.decode("#68f785"));
		Nor.add(FBPic,BorderLayout.WEST);
		Nor.add(NHunger,BorderLayout.CENTER);
		Nor.add(WDonate,BorderLayout.EAST);
		panel.add(Nor,BorderLayout.NORTH); //Nor panel becomes the top part of main panel
		
		JPanel Rig = new JPanel(); //dummy right panel for centerring?
		Rig.setBackground(Color.decode("#caebd7"));
		
		
		panel.add(Rig,BorderLayout.EAST);
		
		return panel;
	
			

		
		//write your code above
		
		
		
	}
}

