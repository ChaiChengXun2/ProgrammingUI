import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class chengxun 
{
	public static JPanel newPanel()
	{ 
		// creation of main panel
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 665));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new BorderLayout(0, 0));
		
		//write your code below 
		
		// creation of top panel 
		JPanel contentPanel = new JPanel(); 
		contentPanel.setBackground(main.grey);
		contentPanel.setPreferredSize(new Dimension(1050, 300));
		
		// creation of panels to put cards
		JPanel picturePanel = new JPanel(); 
		picturePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
		picturePanel.setBackground(main.lightgreen);
		picturePanel.setPreferredSize(new Dimension(1050, 200));
		
		
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
		
		clothesCard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				
				JFrame procedureFrame = new JFrame(); 
				procedureFrame.setTitle("Donation Procedure");
				
				JPanel mainPanel = new JPanel(); 
				mainPanel.setPreferredSize(new Dimension(700, 375));
				mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				JPanel picturePanel = new JPanel(); 
				picturePanel.add(new JLabel(new ImageIcon("ProgrammingUI/src/No Poverty Icon.png")));
				picturePanel.setPreferredSize(new Dimension(250, 250));
				
				JLabel thankYou = new JLabel("Thank you for choosing NoPoverty");
				thankYou.setFont(new Font("Verdana", Font.PLAIN, 20));
				thankYou.setHorizontalAlignment(JLabel.CENTER);
				thankYou.setPreferredSize(new Dimension(350, 35));
				mainPanel.add(picturePanel);
				mainPanel.add(thankYou);
				
				if (!(login.isLogin))
				{
					JLabel registerAcc = new JLabel("Please login to donate");
					JLabel note = new JLabel("You can still choose to donate anonymously after registering");
					
					registerAcc.setFont(new Font("Verdana", Font.PLAIN, 20));
					note.setFont(new Font("Verdana", Font.PLAIN, 20));
					registerAcc.setHorizontalAlignment(JLabel.CENTER);
					note.setHorizontalAlignment(JLabel.CENTER);
					registerAcc.setPreferredSize(new Dimension(700, 35));
					note.setPreferredSize(new Dimension(700, 35));
					registerAcc.setForeground(Color.red);
					note.setForeground(Color.red);
					
					mainPanel.add(note);
					mainPanel.add(registerAcc);
				}
				else
				{
					JLabel procedure = new JLabel("Set Up Procedure...");
					procedure.setFont(new Font("Verdana", Font.PLAIN, 20));
					procedure.setHorizontalAlignment(JLabel.CENTER);
					procedure.setPreferredSize(new Dimension(700, 35));
					mainPanel.add(procedure);
				}
				
				procedureFrame.setSize(700, 375);
				procedureFrame.add(mainPanel);
				procedureFrame.setLocationRelativeTo(null);
				procedureFrame.setVisible(true);
			}
		});
		
		phoneCard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				
				JFrame procedureFrame = new JFrame(); 
				procedureFrame.setTitle("Donation Procedure");
				
				JPanel mainPanel = new JPanel(); 
				mainPanel.setPreferredSize(new Dimension(700, 375));
				mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				JPanel picturePanel = new JPanel(); 
				picturePanel.add(new JLabel(new ImageIcon("ProgrammingUI/src/No Poverty Icon.png")));
				picturePanel.setPreferredSize(new Dimension(250, 250));
				
				JLabel thankYou = new JLabel("Thank you for choosing NoPoverty");
				thankYou.setFont(new Font("Verdana", Font.PLAIN, 20));
				thankYou.setHorizontalAlignment(JLabel.CENTER);
				thankYou.setPreferredSize(new Dimension(350, 35));
				mainPanel.add(picturePanel);
				mainPanel.add(thankYou);
				
				if (!(login.isLogin))
				{
					JLabel registerAcc = new JLabel("Please login to donate");
					JLabel note = new JLabel("You can still choose to donate anonymously after registering");
					
					registerAcc.setFont(new Font("Verdana", Font.PLAIN, 20));
					note.setFont(new Font("Verdana", Font.PLAIN, 20));
					registerAcc.setHorizontalAlignment(JLabel.CENTER);
					note.setHorizontalAlignment(JLabel.CENTER);
					registerAcc.setPreferredSize(new Dimension(700, 35));
					note.setPreferredSize(new Dimension(700, 35));
					registerAcc.setForeground(Color.red);
					note.setForeground(Color.red);
					
					mainPanel.add(note);
					mainPanel.add(registerAcc);
				}
				else
				{
					JLabel procedure = new JLabel("Set Up Procedure...");
					procedure.setFont(new Font("Verdana", Font.PLAIN, 20));
					procedure.setHorizontalAlignment(JLabel.CENTER);
					procedure.setPreferredSize(new Dimension(700, 35));
					mainPanel.add(procedure);
				}
				
				procedureFrame.setSize(700, 375);
				procedureFrame.add(mainPanel);
				procedureFrame.setLocationRelativeTo(null);
				procedureFrame.setVisible(true);
			}
		});
		
		bottleCard.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				
				JFrame procedureFrame = new JFrame(); 
				procedureFrame.setTitle("Donation Procedure");
				
				JPanel mainPanel = new JPanel(); 
				mainPanel.setPreferredSize(new Dimension(700, 375));
				mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
				
				JPanel picturePanel = new JPanel(); 
				picturePanel.add(new JLabel(new ImageIcon("ProgrammingUI/src/No Poverty Icon.png")));
				picturePanel.setPreferredSize(new Dimension(250, 250));
				
				JLabel thankYou = new JLabel("Thank you for choosing NoPoverty");
				thankYou.setFont(new Font("Verdana", Font.PLAIN, 20));
				thankYou.setHorizontalAlignment(JLabel.CENTER);
				thankYou.setPreferredSize(new Dimension(350, 35));
				mainPanel.add(picturePanel);
				mainPanel.add(thankYou);
				
				if (!(login.isLogin))
				{
					JLabel registerAcc = new JLabel("Please login to donate");
					JLabel note = new JLabel("You can still choose to donate anonymously after registering");
					
					registerAcc.setFont(new Font("Verdana", Font.PLAIN, 20));
					note.setFont(new Font("Verdana", Font.PLAIN, 20));
					registerAcc.setHorizontalAlignment(JLabel.CENTER);
					note.setHorizontalAlignment(JLabel.CENTER);
					registerAcc.setPreferredSize(new Dimension(700, 35));
					note.setPreferredSize(new Dimension(700, 35));
					registerAcc.setForeground(Color.red);
					note.setForeground(Color.red);
					
					mainPanel.add(note);
					mainPanel.add(registerAcc);
				}
				else
				{
					JLabel procedure = new JLabel("Set Up Procedure...");
					procedure.setFont(new Font("Verdana", Font.PLAIN, 20));
					procedure.setHorizontalAlignment(JLabel.CENTER);
					procedure.setPreferredSize(new Dimension(700, 35));
					mainPanel.add(procedure);
				}
				
				procedureFrame.setSize(700, 375);
				procedureFrame.add(mainPanel);
				procedureFrame.setLocationRelativeTo(null);
				procedureFrame.setVisible(true);
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
		
		// adding everything into main panel and return the panel
		textPanel.add(text, BorderLayout.CENTER);
		mainPanel.add(picturePanel, BorderLayout.NORTH);
		mainPanel.add(textPanel, BorderLayout.SOUTH);
		
		mainPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) 
			{ 
				text.setFont(new Font("Verdana", Font.BOLD, 12));
				picturePanel.setBackground(main.darkgreen);
			}
			public void mouseExited(MouseEvent e) 
			{ 
				text.setFont(new Font("Verdana", Font.PLAIN, 12));
				picturePanel.setBackground(main.grey);
			}
		});
		
		return mainPanel;
	}
}
