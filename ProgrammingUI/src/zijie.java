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
		
		// Creation of a new panel for better organisation
		JPanel southernPanel = new JPanel();
		southernPanel.setPreferredSize(new Dimension(950, 410));
		southernPanel.setBackground(Color.decode("#ddefe3"));
		
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
						   + "<br/>carbon from the atmosphere."
						   + "<br/><br/>With only as little as $1, you can plant your<br/>very own tree. "
						   + "Contribute to the effort today!</html>"));
		information.setFont(new Font("Verdana", Font.PLAIN, 16));
		infoPanel.setBackground(Color.decode("#ddefe3"));
		infoPanel.add(Reason, BorderLayout.NORTH);
		infoPanel.add(information);
		
		// Creation of DonationPanel
		JPanel DonationPanel = new JPanel();
		DonationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 0));
		DonationPanel.setBackground(Color.decode("#ddefe3"));
		DonationPanel.setPreferredSize(new Dimension(260, 700));
		
		// Creation of panel for donation
		JPanel plantingTrees = zijie.plantTree("Plant your tree today!", "ProgrammingUI/src/PlantingTree.jpg");
		
		DonationPanel.add(plantingTrees);
		
		// Creation of panel for Donor List
		JPanel Donors = new JPanel();
		Donors.setPreferredSize(new Dimension(380, 618));
		Donors.setBackground(main.darkgreen);
		FlowLayout layout = (FlowLayout)Donors.getLayout();
		layout.setVgap(0);
		
		JPanel DonorList = new JPanel();
		DonorList.setPreferredSize(new Dimension(380, 75));
		DonorList.setBackground(Color.decode("#a8d8cd"));
		
		JLabel list = new JLabel();
		list.setText("<html><br/><br/>Donor List<html/>");
		list.setFont(new Font("Verdana", Font.BOLD, 16));
		list.setForeground(main.darkgreen);
		
		DonorList.add(list);
		
		JPanel names = new JPanel();
		names.setPreferredSize(new Dimension(380, 600));
		names.setBackground(main.darkgreen);
		
		JPanel DonorList1 = new JPanel();
		DonorList1.setPreferredSize(new Dimension(370, 75));
		DonorList1.setBackground(Color.decode("#e0fdff"));
		
		JPanel DonorList2 = new JPanel();
		DonorList2.setPreferredSize(new Dimension(370, 75));
		DonorList2.setBackground(Color.decode("#e0fdff"));
		
		JPanel DonorList3 = new JPanel();
		DonorList3.setPreferredSize(new Dimension(370, 75));
		DonorList3.setBackground(Color.decode("#e0fdff"));
		
		JPanel DonorList4 = new JPanel();
		DonorList4.setPreferredSize(new Dimension(380, 85));
		DonorList4.setBackground(Color.decode("#ddefe3"));
		
		names.add(DonorList1);
		names.add(DonorList2);
		names.add(DonorList3);
		names.add(DonorList4);
		
		Donors.add(DonorList);
		Donors.add(names);
		
		// Adding the panels into the Main Panel
		southernPanel.add(infoPanel, BorderLayout.WEST);
		southernPanel.add(DonationPanel);
		southernPanel.add(Donors, BorderLayout.EAST);
		panel.add(zjBanner, BorderLayout.NORTH);
		panel.add(southernPanel, BorderLayout.SOUTH);
		
		// Adding the functionality to the donation button
		plantingTrees.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				JFrame DonationFrame = new JFrame();
				DonationFrame.setTitle("Donate to Plant Your Tree");
				
				JPanel donationMain = new JPanel();
				donationMain.setPreferredSize(new Dimension(700, 380));
				donationMain.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				if (!(login.isLogin)) {
					
					JLabel unregistered = new JLabel("Please login to make a donation");
					unregistered.setFont(new Font("Verdana", Font.PLAIN, 16));
					unregistered.setHorizontalAlignment(JLabel.CENTER);
					unregistered.setPreferredSize(new Dimension(400, 50));
					unregistered.setForeground(Color.red);
				
					donationMain.add(unregistered);
				
					DonationFrame.setSize(300,100);
					
				} else {
					
				JPanel donationImage = new JPanel();
				donationImage.add(new JLabel(new ImageIcon("ProgrammingUI/src/Planting.jpg")));
				donationImage.setPreferredSize(new Dimension(350, 250));
				
				JLabel appreciation = new JLabel("<html>We would like to express our gratitude to you for supporting<br/>the effort.</html>");
				appreciation.setFont(new Font("Verdana", Font.PLAIN, 18));
				appreciation.setHorizontalAlignment(JLabel.CENTER);
				appreciation.setPreferredSize(new Dimension(350,75));
				
				donationMain.add(donationImage);
				donationMain.add(appreciation);
				
				DonationFrame.setSize(800,500);
				
				}
				
			DonationFrame.add(donationMain);
			DonationFrame.setLocationRelativeTo(null);
			DonationFrame.setVisible(true);
				
			}
			
		});
		
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
		
		// For button's reaction when hovering through it
		donationPanel.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e) {
				
				donationmsg.setFont(new Font("Verdana", Font.BOLD, 12));
				
			}
			public void mouseExited(MouseEvent e) { 
				
				donationmsg.setFont(new Font("Verdana", Font.PLAIN, 12));
				
			}
			
		});
		
		return donationPanel;
	
	}

}