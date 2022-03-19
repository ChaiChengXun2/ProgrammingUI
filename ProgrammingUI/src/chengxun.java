import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chengxun 
{
	// html elemnets to flex 
	static String ty = "<html>"
							+ "<body>"
								+ "<p style=\"font-weight: plain; text-align: center; font-size:17px;\">Thank you for choosing NoPoverty</p>"
							+ "</body>"
						+ "</html>";
	static String registerAccount =  "<html>"
										+ "<body>"
											+ "<p style=\"font-weight: plain; text-align: center; font-size:17px;\">Please login to donate</p>"
										+ "</body>"
									+ "</html>";
	static String donateNote =  "<html>"
								+ "<body>"
									+ "<p style=\"font-weight: plain; text-align: center; font-size:17px;\">You can still donate anonymously after registering</p>"
								+ "</body>"
							+ "</html>";
	static String procedureTxt =  "<html>"
									+ "<body>"
										+ "<p style=\"font-weight: plain; text-align: center; font-size:17px;\">Set up procedure...</p>"
									+ "</body>"
								+ "</html>";
	
	// function for event handling
	static void donationRegistration(MouseEvent e)
	{ 
		// creation of another frame
		JFrame mainFrame = new JFrame(); 
		mainFrame.setTitle("Donation Procedure");
		
		// creation of main panel inside the frame
		JPanel mainPanel = new JPanel(); 
		mainPanel.setPreferredSize(new Dimension(700, 450));
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		mainPanel.setBackground(main.lightgreen);
		
		// adding icon into the frame
		JPanel picturePanel = new JPanel(); 
		picturePanel.add(new JLabel(new ImageIcon("ProgrammingUI/src/No Poverty Icon.png")));
		picturePanel.setPreferredSize(new Dimension(250, 250));
		picturePanel.setBackground(main.lightgreen);
		
		// adding a thank you message
		JLabel thankYou = new JLabel(ty);
		thankYou.setHorizontalAlignment(JLabel.CENTER);
		thankYou.setPreferredSize(new Dimension(400, 50));
		mainPanel.add(picturePanel);
		mainPanel.add(thankYou);
		
		// checks if user is logged in
		if (!(login.isLogin))
		{
			// telling users to create an account or log in before donation 
			JLabel registerAcc = new JLabel(registerAccount);
			JLabel note = new JLabel(donateNote);
			
			JPanel loginPnl = new JPanel(); 
			JPanel registerPnl = new JPanel(); 
			
			JLabel login = new JLabel("Login"); 
			JLabel register = new JLabel("Register"); 
			
			login.setFont(new Font("Verdana", Font.PLAIN, 12));
			register.setFont(new Font("Verdana", Font.PLAIN, 12));
			
			registerAcc.setHorizontalAlignment(JLabel.CENTER);
			registerAcc.setPreferredSize(new Dimension(700, 50));
			registerAcc.setForeground(Color.red);
			
			note.setHorizontalAlignment(JLabel.CENTER);
			note.setForeground(Color.red);
			note.setPreferredSize(new Dimension(700, 50));
			
			loginPnl.setBackground(main.darkgreen); 
			loginPnl.setPreferredSize(new Dimension(300, 30));
			registerPnl.setBackground(main.darkgreen);
			registerPnl.setPreferredSize(new Dimension(300, 30));
			
			login.setForeground(Color.white);
			register.setForeground(Color.white);
			
			loginPnl.add(login); 
			registerPnl.add(register);
			
			mainPanel.add(note);
			mainPanel.add(registerAcc);
			
			mainPanel.add(loginPnl); 
			mainPanel.add(registerPnl);
			
			loginPnl.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{ 
					main.slidePanel.show(main.contentPanel, "9");
					mainFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));
				}
				public void mouseEntered(MouseEvent e) 
				{ 
					login.setFont(new Font("Verdana", Font.BOLD, 12));
					loginPnl.setBackground(main.grey);
					login.setForeground(Color.black);
				}
				public void mouseExited(MouseEvent e) 
				{ 
					login.setFont(new Font("Verdana", Font.PLAIN, 12));
					loginPnl.setBackground(main.darkgreen);
					login.setForeground(Color.white);
				}
			});
			
			registerPnl.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{ 
					main.slidePanel.show(main.contentPanel, "8");
					mainFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));
				}
				public void mouseEntered(MouseEvent e) 
				{ 
					register.setFont(new Font("Verdana", Font.BOLD, 12));
					registerPnl.setBackground(main.grey);
					register.setForeground(Color.black);
				}
				public void mouseExited(MouseEvent e) 
				{ 
					register.setFont(new Font("Verdana", Font.PLAIN, 12));
					registerPnl.setBackground(main.darkgreen);
					register.setForeground(Color.white);
				}
			});
		}
		else
		{
			// if they are logged in, proceed to set up procedure
			JLabel procedure = new JLabel(procedureTxt);
			procedure.setHorizontalAlignment(JLabel.CENTER);
			
			JPanel donatePnl = new JPanel(); 
			JLabel donate = new JLabel("Donate now"); 
			
			donate.setFont(new Font("Verdana", Font.PLAIN, 12));
			donate.setForeground(Color.white);
			
			donatePnl.setBackground(main.darkgreen);
			donatePnl.add(donate);
			donatePnl.setPreferredSize(new Dimension(600, 30));
					
			mainPanel.add(procedure);
			mainPanel.add(donatePnl);
			
			donatePnl.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e)
				{ 
					mainFrame.dispatchEvent(new WindowEvent(mainFrame, WindowEvent.WINDOW_CLOSING));
				}
				public void mouseEntered(MouseEvent e) 
				{ 
					donate.setFont(new Font("Verdana", Font.BOLD, 12));
					donatePnl.setBackground(main.grey);
					donate.setForeground(Color.black);
				}
				public void mouseExited(MouseEvent e) 
				{ 
					donate.setFont(new Font("Verdana", Font.PLAIN, 12));
					donatePnl.setBackground(main.darkgreen);
					donate.setForeground(Color.white);
				}
			});
		}
		
		// configuration of main frame 
		mainFrame.setSize(700, 450);
		mainFrame.add(mainPanel);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	public static JPanel newPanel()
	{ 
		// creation of main panel
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 665));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new BorderLayout(0, 0));
		
		// image
		ImageIcon banner = new ImageIcon("ProgrammingUI/src/cxBanner.png");
		
		// creation of content panel
		JPanel contentPanel = new JPanel(); 
		contentPanel.setBackground(main.lightgreen);
		contentPanel.setPreferredSize(new Dimension(1050, 315));
		
		// creation of a label to place image
		JLabel cxBanner = new JLabel(banner);
		contentPanel.add(cxBanner);
		
		// creation of panels to put cards
		JPanel picturePanel = new JPanel(); 
		picturePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
		picturePanel.setBackground(main.lightgreen);
		picturePanel.setPreferredSize(new Dimension(1050, 300));
		
		
		// creation of panels for my cards
		JPanel clothesCard = chengxun.createCard("Donate Unwanted Clothes Here", "ProgrammingUI/src/Donate Clothes.png");
		JPanel phoneCard = chengxun.createCard("Donate Mobile Phones Here", "ProgrammingUI/src/Donate Mobile Device.png");
		JPanel bottleCard = chengxun.createCard("Donate Unwanted Items Here", "ProgrammingUI/src/Donate Water Bottle.png");
		
		// add the things into main panel
		picturePanel.add(clothesCard);
		picturePanel.add(phoneCard); 
		picturePanel.add(bottleCard);
		panel.add(contentPanel, BorderLayout.NORTH);
		panel.add(picturePanel, BorderLayout.CENTER);
		
		// event handlers
		clothesCard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				donationRegistration(e); 
			}
		});
		
		phoneCard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				donationRegistration(e); 
			}
		});
		
		bottleCard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				donationRegistration(e); 
			}
		});
	
		return panel;
	}
	
	public static JPanel createCard(String description, String imgSrc)
	{ 
		ImageIcon userImg = new ImageIcon(imgSrc);
		
		// created the entire card
		JPanel mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(225, 300));
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		// created a panel to place images		
		JPanel picturePanel = new JPanel(); 
		picturePanel.setBackground(main.grey);
		picturePanel.setPreferredSize(new Dimension(225, 225));
		picturePanel.setLayout(new BorderLayout(0, 0));
		
		JLabel picture = new JLabel(new ImageIcon(imgSrc)); 
		picturePanel.add(picture);
		
		// created a panel to place text
		JPanel textPanel = new JPanel(); 
		textPanel.setPreferredSize(new Dimension(225, 75)); 
		textPanel.setBackground(main.darkgreen);
		textPanel.setLayout(new BorderLayout());
		
		//creation of text
		JLabel text = new JLabel(description, SwingConstants.HORIZONTAL);
		text.setFont(new Font("Verdana", Font.PLAIN, 12));
		text.setForeground(main.lightgreen);
		//text.setForeground(Color.decode("#caebd7"));
		
		// adding everything into main panel and return the panel
		textPanel.add(text, BorderLayout.CENTER);
		mainPanel.add(picturePanel, BorderLayout.NORTH);
		mainPanel.add(textPanel, BorderLayout.SOUTH);
		
		// event handlers
		mainPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) 
			{ 
				text.setFont(new Font("Verdana", Font.BOLD, 12));
				picturePanel.setBackground(main.darkgreen);
			}
			public void mouseExited(MouseEvent e) 
			{ 
				text.setFont(new Font("Verdana", Font.PLAIN, 13));
				picturePanel.setBackground(main.grey);
			}
		});
		
		return mainPanel;
	}
}
