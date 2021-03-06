import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class zijie extends JPanel
{
	
	JRadioButton jRadioButton;
	JTextField jTextField;
	
		zijie(String radioButtonName) {
	    jRadioButton = new JRadioButton(radioButtonName);
	    jTextField = new JTextField(10);
	    jRadioButton.setBackground(Color.decode("#ddefe3"));
	    this.setLayout(new FlowLayout());
	    this.add(jRadioButton);
	    this.add(jTextField);
		}
	
	public static JPanel newPanel()
	{ 
		// Main Panel
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 665));
		panel.setBackground(Color.decode("#ddefe3"));
		panel.setLayout(new BorderLayout());
				
		// Creation of a new panel for better organisation
		JPanel southernPanel = new JPanel();
		southernPanel.setPreferredSize(new Dimension(950, 410));
		southernPanel.setBackground(Color.decode("#ddefe3"));
		
		// Image for Banner
		ImageIcon image = new ImageIcon("ProgrammingUI/src/TreesEDITED.jpg");
		
		// Inserting image into banner
		JLabel zjBanner = new JLabel(image);
		zjBanner.setPreferredSize(new Dimension(900, 250));
		
		// Creation of Information Panel
		JPanel infoPanel = new JPanel();
		infoPanel.setPreferredSize(new Dimension(340, 700));
		
		// Creation of Reason panel
		JPanel Reason = new JPanel();
		Reason.setPreferredSize(new Dimension(340, 100));
		
		// Inserting text to Reason panel
		JLabel ReasonText = new JLabel();
		ReasonText.setText(("<html><br><br>Why Plant Trees?</html>"));
		ReasonText.setFont(new Font("Open Sans", Font.BOLD, 24));
		Reason.setBackground(Color.decode("#ddefe3"));
		Reason.add(ReasonText);
		
		// Inserting text into Information Panel
		JLabel information = new JLabel();
		information.setText(("<html><br>Trees contribute to clean the air we breathe,<br>filter the water we drink, and support over<br>"
						   + "80% of the world's terrestrial biodiversity.<br>Over 1.6 billion people rely on forests for<br>employment, and forests absorb dangerous" 
						   + "<br>carbon from the atmosphere."
						   + "<br><br>With only as little as $1, you can plant your<br>very own tree. "
						   + "Contribute to the effort today!</html>"));
		information.setFont(new Font("Open Sauce SemiBold", Font.PLAIN, 16));
		infoPanel.setBackground(Color.decode("#ddefe3"));
		infoPanel.add(Reason, BorderLayout.NORTH);
		infoPanel.add(information);
		
		// Creation of DonationPanel
		JPanel DonationPanel = new JPanel();
		DonationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 0));
		DonationPanel.setBackground(Color.decode("#ddefe3"));
		DonationPanel.setPreferredSize(new Dimension(300, 700));
		
		// Creation of panel for donation
		JPanel plantingTrees = zijie.plantTree("Plant your tree today!", "ProgrammingUI/src/PlantingTree.jpg");
		
		DonationPanel.add(plantingTrees);
		
		// Creation of panel for Donor List
		JPanel Donors = new JPanel();
		Donors.setPreferredSize(new Dimension(380, 618));
		Donors.setBackground(main.darkgreen);
		FlowLayout layout = (FlowLayout)Donors.getLayout();
		layout.setVgap(0);
		
		// Panel for Donor List label
		JPanel DonorList = new JPanel();
		DonorList.setPreferredSize(new Dimension(380, 75));
		DonorList.setBackground(Color.decode("#a8d8cd"));
		
		// Label for Donor List
		JLabel list = new JLabel();
		list.setText("<html><br>Donor List</html>");
		list.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 20));
		list.setForeground(main.darkgreen);
		
		// Adding text into the DonorList panel
		DonorList.add(list);
		
		// Setting the Vertical and Horizontal gap of the DonorList panel
		FlowLayout listLayout = (FlowLayout)DonorList.getLayout();
		listLayout.setVgap(0);
		listLayout.setHgap(0);
		
		// Creation of panel for the list of donors
		JPanel names = new JPanel();
		names.setPreferredSize(new Dimension(380, 600));
		names.setBackground(main.darkgreen);
		
		// First donor
		JPanel DonorList1 = new JPanel();
		DonorList1.setPreferredSize(new Dimension(370, 75));
		DonorList1.setBackground(Color.decode("#e0fdff"));
		DonorList1.setLayout(listLayout);
		
		JLabel user1 = new JLabel(new ImageIcon("ProgrammingUI/src/UserIcon1.png"));
		
		// First donor's name
		JLabel name1 = new JLabel("<html><br>John Smith</html>");
		name1.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 16));
		name1.setForeground(main.darkgreen);
		
		// First donor's donation amount
		JLabel donation1 = new JLabel("<html><br>$15</html>");
		donation1.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 16));
		donation1.setForeground(main.darkgreen);
		
		// Panel for first donor's icon
		JPanel icon1 = new JPanel();
		icon1.setPreferredSize(new Dimension(75, 75));
		icon1.setBackground(Color.decode("#ddefe3"));
		icon1.add(user1);
		
		// Panel for first donor's name
		JPanel namepnl1 = new JPanel();
		namepnl1.setPreferredSize(new Dimension(220, 75));
		namepnl1.setBackground(Color.decode("#e0fdff"));
		namepnl1.add(name1);
		
		// Panel for first donor's donation amount
		JPanel donationpnl1 = new JPanel();
		donationpnl1.setPreferredSize(new Dimension(75, 75));
		donationpnl1.setBackground(Color.decode("#c2fbff"));
		donationpnl1.add(donation1);
		
		// Adding everything to the DonorList1 panel
		DonorList1.add(icon1);
		DonorList1.add(namepnl1);
		DonorList1.add(donationpnl1);
		
		// Second donor
		JPanel DonorList2 = new JPanel();
		DonorList2.setPreferredSize(new Dimension(370, 75));
		DonorList2.setBackground(Color.decode("#e0fdff"));
		DonorList2.setLayout(listLayout);
		
		// Second donor's icon
		JLabel user2 = new JLabel(new ImageIcon("ProgrammingUI/src/UserIcon1.png"));
		
		// Second donor's name
		JLabel name2 = new JLabel("<html><br>Denis Zalutskiy</html>");
		name2.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 16));
		name2.setForeground(main.darkgreen);
		
		// Second donor's donation amount
		JLabel donation2 = new JLabel("<html><br>$5</html>");
		donation2.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 16));
		donation2.setForeground(main.darkgreen);
		
		// Panel for second donor's icon
		JPanel icon2 = new JPanel();
		icon2.setPreferredSize(new Dimension(75, 75));
		icon2.setBackground(Color.decode("#ddefe3"));
		icon2.add(user2);
		
		// Panel for second donor's name
		JPanel namepnl2 = new JPanel();
		namepnl2.setPreferredSize(new Dimension(220, 75));
		namepnl2.setBackground(Color.decode("#e0fdff"));
		namepnl2.add(name2);
		
		// Panel for second donor's donation amount
		JPanel donationpnl2 = new JPanel();
		donationpnl2.setPreferredSize(new Dimension(75, 75));
		donationpnl2.setBackground(Color.decode("#c2fbff"));
		donationpnl2.add(donation2);
		
		// Adding all the panels to DonorList2
		DonorList2.add(icon2);
		DonorList2.add(namepnl2);
		DonorList2.add(donationpnl2);
		
		// Third donor
		JPanel DonorList3 = new JPanel();
		DonorList3.setPreferredSize(new Dimension(370, 75));
		DonorList3.setBackground(Color.decode("#e0fdff"));
		DonorList3.setLayout(listLayout);
		
		// Third donor's icon
		JLabel user3 = new JLabel(new ImageIcon("ProgrammingUI/src/UserIcon1.png"));
		
		// Third donor's name
		JLabel name3 = new JLabel("<html><br>Charlotte Williams</html>");
		name3.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 16));
		name3.setForeground(main.darkgreen);
		
		// Third donor's donation amount
		JLabel donation3 = new JLabel("<html><br>$100</html>");
		donation3.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 16));
		donation3.setForeground(main.darkgreen);
		
		// Panel for third donor's icon
		JPanel icon3 = new JPanel();
		icon3.setPreferredSize(new Dimension(75, 75));
		icon3.setBackground(Color.decode("#ddefe3"));
		icon3.add(user3);
		
		// Panel for third donor's name
		JPanel namepnl3 = new JPanel();
		namepnl3.setPreferredSize(new Dimension(220, 75));
		namepnl3.setBackground(Color.decode("#e0fdff"));
		namepnl3.add(name3);
		
		// Panel for third donor's donation amount
		JPanel donationpnl3 = new JPanel();
		donationpnl3.setPreferredSize(new Dimension(75, 75));
		donationpnl3.setBackground(Color.decode("#c2fbff"));
		donationpnl3.add(donation3);
		
		// Adding all panels to DonorList3
		DonorList3.add(icon3);
		DonorList3.add(namepnl3);
		DonorList3.add(donationpnl3);
		
		// Filler panel to cover the rest of the main panel
		JPanel DonorList4 = new JPanel();
		DonorList4.setPreferredSize(new Dimension(380, 85));
		DonorList4.setBackground(Color.decode("#ddefe3"));
		
		// Adding the panels to the names panel
		names.add(DonorList1);
		names.add(DonorList2);
		names.add(DonorList3);
		names.add(DonorList4);
		
		// Adding the donors to the list
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
				donationMain.setBackground(Color.decode("#ddefe3"));
				
				if (!(login.isLogin)) {
					
					
					// Pop-up window in the case that the user is not registered
					JLabel unregistered = new JLabel("Please login to make a donation");
					unregistered.setFont(new Font("Verdana", Font.PLAIN, 16));
					unregistered.setHorizontalAlignment(JLabel.CENTER);
					unregistered.setPreferredSize(new Dimension(400, 50));
					unregistered.setForeground(Color.red);
					
					JLabel login = new JLabel("<html><br>Login</html>");
					login.setForeground(Color.decode("#a8d8cd"));
					login.setFont(new Font("Verdana", Font.PLAIN, 12));
					
					// Login button that redirects users to the login page.
					JPanel loginButton = new JPanel();
					loginButton.setBackground(main.darkgreen);
					loginButton.setPreferredSize(new Dimension(125, 60));
					loginButton.add(login);
					
					// Visual feedback for button
					loginButton.addMouseListener(new MouseAdapter() {
						
						public void mouseEntered(MouseEvent e) {
							
							login.setFont(new Font("Verdana", Font.BOLD, 12));
							
						}
						
						public void mouseExited(MouseEvent e) {
							
							login.setFont(new Font("Verdana", Font.PLAIN, 12));
							
						}
						
						
						public void mouseClicked(MouseEvent e) {
							
							main.slidePanel.show(main.contentPanel, "9");
							DonationFrame.dispatchEvent(new WindowEvent(DonationFrame, WindowEvent.WINDOW_CLOSING));
							
						}
						
					});
					
					donationMain.add(unregistered);
					donationMain.add(loginButton);
					
					DonationFrame.setSize(400, 175);
					
				} else {
					
				// This block of code runs if the user is logged in
					
				// Image
				JLabel donationImage = new JLabel(new ImageIcon("ProgrammingUI/src/Planting.jpg"));
				donationImage.setPreferredSize(new Dimension(300, 200));
				
				// Thank you message
				JLabel appreciation = new JLabel("<html>We would like to express our gratitude to you for supporting the effort.</html>");
				appreciation.setFont(new Font("Open Sauce SemiBold", Font.PLAIN, 18));
				appreciation.setHorizontalAlignment(JLabel.CENTER);
				appreciation.setPreferredSize(new Dimension(350,75));
				
				// Panel for the top half of the frame
				JPanel topPanel = new JPanel();
				topPanel.add(donationImage);
				topPanel.add(appreciation);
				topPanel.setBackground(Color.decode("#ddefe3"));
				topPanel.setPreferredSize(new Dimension(800, 200));
				
				// Panel for donation amount
				JPanel donationAMT = new JPanel();
				donationAMT.setPreferredSize(new Dimension(350, 250));
				donationAMT.setBackground(Color.decode("#ddefe3"));
				
					// ButtonGroup for users to select the amount they want to donate
					ButtonGroup amountGroup1 = new ButtonGroup();
					JRadioButton amount1 = new JRadioButton("5 Trees", false);
					amount1.setBackground(Color.decode("#ddefe3"));
					
					JRadioButton amount2 = new JRadioButton("20 Trees", false);
					amount2.setBackground(Color.decode("#ddefe3"));
					
					JRadioButton amount3 = new JRadioButton("50 Trees", false);
					amount3.setBackground(Color.decode("#ddefe3"));
					
					JRadioButton amount4 = new JRadioButton("100 Trees", false);
					amount4.setBackground(Color.decode("#ddefe3"));
					
					zijie Others = new zijie("Other");		
					Others.setBackground(Color.decode("#ddefe3"));
					
					amountGroup1.add(amount1);
					amountGroup1.add(amount2);
					amountGroup1.add(amount3);
					amountGroup1.add(amount4);
					amountGroup1.add(Others.jRadioButton);
					
					donationAMT.add(amount1);
					donationAMT.add(amount2);
					donationAMT.add(amount3);
					donationAMT.add(amount4);
					donationAMT.add(Others);
					
					// Panel for the center part of the frame, donationAMT is added into this panel
					JPanel centerPanel = new JPanel();
					centerPanel.add(donationAMT, BorderLayout.CENTER);
					centerPanel.setBackground(Color.decode("#ddefe3"));
					centerPanel.setPreferredSize(new Dimension(800, 100));
					
					// Message for donation button
					JLabel donoM = new JLabel("<html><br>Donate now!</html>");
					donoM.setForeground(Color.decode("#a8d8cd"));
					
					// Panel for donation button
					JPanel dono = new JPanel();
					dono.setPreferredSize(new Dimension(200, 65));
					dono.setBackground(main.darkgreen);
					dono.add(donoM);
					
					// Panel for the bottom part of the frame, dono is added into this panel
					JPanel bottomPanel = new JPanel();
					bottomPanel.add(dono, BorderLayout.NORTH);
					bottomPanel.setBackground(Color.decode("#ddefe3"));
					bottomPanel.setPreferredSize(new Dimension(800, 200));
					
					// Visual feedback for button
					dono.addMouseListener(new MouseAdapter() {
					
					public void mouseEntered(MouseEvent e) {
						
						donoM.setFont(new Font("Verdana", Font.BOLD, 12));
						
						}
					
					public void mouseExited(MouseEvent e) {
						
						donoM.setFont(new Font("Verdana", Font.PLAIN, 12));
						
						}
					
					// For button's functionality
					public void mouseClicked(MouseEvent e) {
						
						DonationFrame.dispatchEvent(new WindowEvent(DonationFrame, WindowEvent.WINDOW_CLOSING));
						
					}
				
				});
				
				donationMain.add(topPanel);
				donationMain.add(centerPanel, BorderLayout.CENTER);
				donationMain.add(bottomPanel, BorderLayout.SOUTH);
				
				DonationFrame.setSize(800,600);
				
				}
				
			DonationFrame.add(donationMain);
			DonationFrame.setLocationRelativeTo(null);
			DonationFrame.setVisible(true);
				
			}
			
		});
		
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
		donationmsg.setFont(new Font("Open Sauce SemiBold", Font.PLAIN, 15));
		donationmsg.setForeground(main.lightgreen);
		
		// Adding Image and Donation Message panels to the main Donation Panel
		msgPanel.add(donationmsg, BorderLayout.CENTER);
		donationPanel.add(imagePanel, BorderLayout.NORTH);
		donationPanel.add(msgPanel, BorderLayout.SOUTH);
		
		// For button's reaction when hovering through it
		donationPanel.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e) {
				
				donationmsg.setFont(new Font("Open Sauce SemiBold", Font.BOLD, 15));
				
			}
			public void mouseExited(MouseEvent e) { 
				
				donationmsg.setFont(new Font("Open Sauce SemiBold", Font.PLAIN, 15));
				
			}
			
		});
		
		return donationPanel;
	
	}

}