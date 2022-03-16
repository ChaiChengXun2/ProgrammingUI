import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zijie
{
	public static JPanel newPanel()
	{ 
		// Main Panel
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 665));
		panel.setBackground(Color.decode("#ddefe3"));
		panel.setLayout(new BorderLayout());
				
		//write your code below
		
		// Image for Banner
		ImageIcon image = new ImageIcon("ProgrammingUI/src/zjBanner.jpg");
		
		// Inserting image into banner
		JLabel zjBanner = new JLabel(image);
		
		// Creation of Information Panel
		JPanel infoPanel = new JPanel();
		infoPanel.setPreferredSize(new Dimension(380, 700));
		
		// Creation of Reason panel
		JPanel Reason = new JPanel();
		Reason.setPreferredSize(new Dimension(380, 100));
		
		// Inserting text to Reason panel
		JLabel ReasonText = new JLabel();
		ReasonText.setText(("<html><br/><br/><br/>Why Plant Trees?</html>"));
		ReasonText.setFont(new Font("Verdana", Font.BOLD, 18));
		Reason.setBackground(Color.decode("#ddefe3"));
		Reason.add(ReasonText);
		
		// Inserting text into Information Panel
		JLabel information = new JLabel();
		information.setText(("<html><br/>Trees contribute to clean the air we breathe,<br/>filter the water we drink, and support over<br/>"
						   + "80% of the world's terrestrial biodiversity.<br/>Over 1.6 billion people rely on forests for<br/>employment, and forests absorb dangerous" 
						   + "<br/>carbon from the atmosphere.</html>"));
		information.setFont(new Font("Verdana", Font.PLAIN, 16));
		infoPanel.setBackground(Color.decode("#ddefe3"));
		infoPanel.add(Reason, BorderLayout.NORTH);
		infoPanel.add(information);
		
		// Creation of DonationPanel
		JPanel DonationPanel = new JPanel();
		DonationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 0));
		DonationPanel.setBackground(Color.decode("#ddefe3"));
		DonationPanel.setPreferredSize(new Dimension(1000, 300));
		
		// Creation of panel for donation
		JPanel plantingTrees = zijie.plantTree("Plant your tree today!", "ProgrammingUI/src/PlantingTree.jpg");
		
		DonationPanel.add(plantingTrees);
		
		// Creation of panel for Donor List
		JPanel Donors = new JPanel();
		Donors.setPreferredSize(new Dimension(300, 300));
		Donors.setBackground(Color.decode("#ddefe3"));
		
		JLabel DonorList = new JLabel();
		
		Donors.add(DonorList, BorderLayout.CENTER);
		
		// Adding the panels into the Main Panel
		panel.add(zjBanner, BorderLayout.NORTH);
		panel.add(infoPanel, BorderLayout.WEST);
		panel.add(DonationPanel);
		panel.add(Donors, BorderLayout.EAST);
		
		//write your code above
		
		return panel;
	}
	
	public static JPanel plantTree(String desc, String imgSrc) 
	{
		
		// Creation of the main Donation Panel
		JPanel donationPanel = new JPanel();
		donationPanel.setPreferredSize(new Dimension(225, 300));
		donationPanel.setLayout(new BorderLayout(0, 0));
		
		// Creation of panel for Image		
		JPanel imagePanel = new JPanel(); 
		imagePanel.setBackground(Color.decode("#ddefe3"));
		imagePanel.setPreferredSize(new Dimension(225, 225));
		imagePanel.setLayout(new BorderLayout(0, 0));
		
		JLabel image = new JLabel(new ImageIcon(imgSrc)); 
		imagePanel.add(image, BorderLayout.SOUTH);
		
		// Creation of panel for Donation Message
		JPanel msgPanel = new JPanel(); 
		msgPanel.setPreferredSize(new Dimension(225, 75)); 
		msgPanel.setBackground(main.darkgreen);
		msgPanel.setLayout(new BorderLayout());
		
		// Inserting Text to msgPanel
		JLabel donationmsg = new JLabel(desc, SwingConstants.HORIZONTAL);
		donationmsg.setFont(new Font("Verdana", Font.PLAIN, 12));
		donationmsg.setForeground(main.lightgreen);
		
		// Adding Image and Donation Message panels to the main Donation Panel
		msgPanel.add(donationmsg, BorderLayout.CENTER);
		donationPanel.add(imagePanel, BorderLayout.NORTH);
		donationPanel.add(msgPanel, BorderLayout.SOUTH);
		
		// For function of Button
		donationPanel.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e) 
			{ 
				donationmsg.setFont(new Font("Verdana", Font.BOLD, 12));
				imagePanel.setBackground(Color.decode("#ddefe3"));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				donationmsg.setFont(new Font("Verdana", Font.PLAIN, 12));
				imagePanel.setBackground(Color.decode("#ddefe3"));
			}
		});
		
		return donationPanel;
	
	}

}