import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class merch {
	
	// functiont to handle event
	static void purchaseEvent(MouseEvent e, String imageSource)
	{ 
		// creation of another frame 
		JFrame mainFrame = new JFrame(); 
		mainFrame.setTitle("Donation Procedure");
		
		// creation of main panel
		JPanel mainPanel = new JPanel(); 
		mainPanel.setPreferredSize(new Dimension(700, 375));
		mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		// creation of label to place image
		JPanel imgPnl = new JPanel(); 
		JLabel imgLbl = new JLabel(new ImageIcon(imageSource));
		
		// creation of confirmation and cancel panel
		JPanel confirmPanel = new JPanel(); 
		JPanel cancelPanel = new JPanel(); 
		
		// confirmation and cancel images 
		JLabel cross = new JLabel(new ImageIcon("ProgrammingUI/src/cross.png"));
		JLabel tick = new JLabel(new ImageIcon("ProgrammingUI/src/tick.png"));
		
		// confirmation and cancel text
		JLabel confirm = new JLabel("Confirm your purchase"); 
		JLabel cancel = new JLabel("Cancel your purchase");
		
		// configuration of confirm and cancel text
		confirm.setFont(new Font("Verdana", Font.PLAIN, 12));
		cancel.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		// configuration of panels
		imgPnl.setPreferredSize(new Dimension(700, 225));
		confirmPanel.setPreferredSize(new Dimension(250, 100));
		cancelPanel.setPreferredSize(new Dimension(250, 100));
		
		// more configuration of panels
		imgPnl.setBackground(main.lightgreen);
		confirmPanel.setBackground(main.lightgreen); 
		cancelPanel.setBackground(main.lightgreen);
		mainPanel.setBackground(main.lightgreen);
		
		// adding everything into frame
		confirmPanel.add(confirm); 
		confirmPanel.add(tick);
		cancelPanel.add(cross);
		cancelPanel.add(cancel); 
		imgPnl.add(imgLbl);
		
		mainPanel.add(imgPnl); 
		mainPanel.add(confirmPanel); 
		mainPanel.add(cancelPanel);
		
		// configuration for main frame
		mainFrame.setSize(700, 385);
		mainFrame.add(mainPanel);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		// event handling
		confirmPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) 
			{ 
				confirm.setFont(new Font("Verdana", Font.BOLD, 12));
				confirmPanel.setBackground(main.grey);
			}
			public void mouseExited(MouseEvent e) 
			{ 
				confirm.setFont(new Font("Verdana", Font.PLAIN, 12));
				confirmPanel.setBackground(main.lightgreen);
			}
		});
		cancelPanel.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) 
			{ 
				cancel.setFont(new Font("Verdana", Font.BOLD, 12));
				cancelPanel.setBackground(main.grey);
			}
			public void mouseExited(MouseEvent e) 
			{ 
				cancel.setFont(new Font("Verdana", Font.PLAIN, 12));
				cancelPanel.setBackground(main.lightgreen);
			}
		});
	}
	
	public static JPanel createMerchPanel()
	{ 
		// create main panel
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new BorderLayout(0, 0));
		
		// creation of panels
		JPanel leftPanel = new JPanel(); 
		JPanel rightPanel = new JPanel(); 
		JPanel picturePanel = new JPanel(); 
		JPanel middlePanel = new JPanel(); 
		
		// colour configuration of panelts 
		leftPanel.setBackground(main.lightgreen);
		rightPanel.setBackground(main.lightgreen);
		picturePanel.setBackground(main.lightgreen);
		middlePanel.setBackground(main.lightgreen);
		
		// layout configuration of panels 
		leftPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 125));
		
		// size configuration of panels
		picturePanel.setPreferredSize(new Dimension(250, 250));
		leftPanel.setPreferredSize(new Dimension(250, 625));
		rightPanel.setPreferredSize(new Dimension(800, 625));
		middlePanel.setPreferredSize(new Dimension(250, 350)); // this is within the leftPanel
		
		// creation of "status" label 
		JLabel msg = new JLabel(); 
		msg.setSize(250, 15);
		msg.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		// creation of the button panel 
		JPanel pressPnl = new JPanel(); 
		pressPnl.setPreferredSize(new Dimension(200, 48)); 
		pressPnl.setBackground(main.lightgreen);
		
		// configuration of button panel
		String html = "<html>"
						+ "<body>"
							+ "<p style=\"font-weight: plain; text-align: center; font-size:10px;\">Refresh</p>"
							+ "<p style=\"font-weight: plain; text-align: center; font-size:10px;\">Subscribe Status</p>"
						+ "</body>"
					+ "</html>";
		JLabel press = new JLabel(html); 
		press.setHorizontalAlignment(JLabel.CENTER);
		press.setVerticalAlignment(JLabel.CENTER);
		
		// creation of merch items 
		String imgSrc1 = "ProgrammingUI/src/orange-shirt.png"; 
		JPanel nonsubItem1 = chengxun.createCard("Item 1", imgSrc1);
		
		String imgSrc2 = "ProgrammingUI/src/pink-shirt.png"; 
		JPanel nonsubItem2 = chengxun.createCard("Item 2", imgSrc2);
		
		String imgSrc3 = "ProgrammingUI/src/purple-shirt.png"; 
		JPanel nonsubItem3 = chengxun.createCard("Item 3", imgSrc3);
		
		String imgSrc4 = "ProgrammingUI/src/blue-longsleeve.png"; 
		JPanel subItem1 = chengxun.createCard("Subscriber Item 1", imgSrc4);
		
		String imgSrc5 = "ProgrammingUI/src/darkblue-longsleeve.png"; 
		JPanel subItem2 = chengxun.createCard("Subscriber Item 2", imgSrc5);
		
		String imgSrc6 = "ProgrammingUI/src/white-longsleeve.png"; 
		JPanel subItem3 = chengxun.createCard("Subscriber Item 3", imgSrc6);
		
		// event handling 
		nonsubItem1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				purchaseEvent(e, imgSrc1);
			}
		});
		
		nonsubItem2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				purchaseEvent(e, imgSrc2);
			}
		});
		
		nonsubItem3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				purchaseEvent(e, imgSrc3);
			}
		});
		
		subItem1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				purchaseEvent(e, imgSrc4);
			}
		});
		
		subItem2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				purchaseEvent(e, imgSrc5);
			}
		});
		
		subItem3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{ 
				purchaseEvent(e, imgSrc6);
			}
		});
		
		pressPnl.addMouseListener(new MouseAdapter() 
		{ 
			public void mouseClicked(MouseEvent e)
			{ 
				if (subscription.isSub)
				{
					msg.setText("You are subscribed"); 
					msg.setForeground(main.darkgreen);
					rightPanel.add(subItem1);
					rightPanel.add(subItem2);
					rightPanel.add(subItem3);
				}
				else
				{
					msg.setText("You are not yet subscribed"); 
					msg.setForeground(Color.red);
				}
			}
			public void mouseEntered(MouseEvent e)
			{ 
				pressPnl.setBackground(main.grey);
				press.setFont(new Font("Verdana", Font.BOLD, 12));
			}
			public void mouseExited(MouseEvent e)
			{ 
				pressPnl.setBackground(main.lightgreen);
				press.setFont(new Font("Verdana", Font.PLAIN, 12));
			}
		});
		
		// placing things into main panel
		picturePanel.add(new JLabel(new ImageIcon("ProgrammingUI/src/logo250.png")));
		pressPnl.add(press);
		
		rightPanel.add(nonsubItem1);
		rightPanel.add(nonsubItem2);
		rightPanel.add(nonsubItem3);
		
		leftPanel.add(middlePanel);
		middlePanel.add(picturePanel);
		middlePanel.add(pressPnl);
		middlePanel.add(msg);
		
		panel.add(rightPanel, BorderLayout.EAST);
		panel.add(leftPanel, BorderLayout.WEST);
		
		return panel;
	}

}
