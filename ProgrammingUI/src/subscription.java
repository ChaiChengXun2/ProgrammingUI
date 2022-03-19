import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class subscription {
	
	public static boolean isSub = false;
	
	public static JPanel createSubscriptionPanel()
	{ 
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(Color.decode("#ddefe3"));
		panel.setLayout(new FlowLayout());
		
		//write your code below 
		
		// Panel to move the table downwards
		JPanel fillerPanel = new JPanel();
		fillerPanel.setPreferredSize(new Dimension(1050, 50));
		fillerPanel.setBackground(Color.decode("#ddefe3"));
		
			// Table
			JPanel table = new JPanel();
			table.setPreferredSize(new Dimension(942, 486));
			table.setBackground(Color.decode("#ffd699"));
		
			FlowLayout tableLayout = (FlowLayout)table.getLayout();
			tableLayout.setVgap(0);
			tableLayout.setHgap(3);
			
			
			// First column of table
			JPanel column1 = new JPanel();
			column1.setPreferredSize(new Dimension(310, 486));
			column1.setBackground(Color.decode("#ffd699"));
			
			FlowLayout c1Layout = (FlowLayout)column1.getLayout();
			c1Layout.setVgap(3);
			c1Layout.setHgap(0);
			
				JPanel c1row1 = new JPanel();
				c1row1.setPreferredSize(new Dimension(310, 66));
				c1row1.setBackground(Color.decode("#ffde59"));
					
					JLabel c1r1 = new JLabel("<html><br>Features</html>");
					
				c1row1.add(c1r1);
			
				JPanel c1row2 = new JPanel();
				c1row2.setPreferredSize(new Dimension(310, 66));
				c1row2.setBackground(Color.decode("#ffebcd"));
				
					JLabel c1r2 = new JLabel("<html><br>Ads</html>");
					
				c1row2.add(c1r2);
				
				JPanel c1row3 = new JPanel();
				c1row3.setPreferredSize(new Dimension(310, 66));
				c1row3.setBackground(Color.decode("#ffebcd"));
				
					JLabel c1r3 = new JLabel("<html><br>Daily free points</html>");
				
				c1row3.add(c1r3);
			
				JPanel c1row4 = new JPanel();
				c1row4.setPreferredSize(new Dimension(310, 66));
				c1row4.setBackground(Color.decode("#ffebcd"));
						
					JLabel c1r4 = new JLabel("<html><br>Exclusive store merchandise</html>");
				
				c1row4.add(c1r4);
				
				JPanel c1row5 = new JPanel();
				c1row5.setPreferredSize(new Dimension(310, 66));
				c1row5.setBackground(Color.decode("#ffebcd"));
				
					JLabel c1r5 = new JLabel("<html><br>15% off in point store</html>");
				
				c1row5.add(c1r5);
					
				JPanel c1row6 = new JPanel();
				c1row6.setPreferredSize(new Dimension(310, 66));
				c1row6.setBackground(Color.decode("#ffebcd"));
				
					JLabel c1r6 = new JLabel("<html><br>Price</html>");
				
				c1row6.add(c1r6);
				
				JPanel c1row7 = new JPanel();
				c1row7.setPreferredSize(new Dimension(350, 100));
				c1row7.setBackground(Color.decode("#ffd699"));

			// Adding every row to the first column	
			column1.add(c1row1);
			column1.add(c1row2);
			column1.add(c1row3);
			column1.add(c1row4);
			column1.add(c1row5);
			column1.add(c1row6);
			column1.add(c1row7);
		
			
			// Second column of table
			JPanel column2 = new JPanel();
			column2.setBounds(50, 50, 100, 200);
			column2.setPreferredSize(new Dimension(310, 486));
			column2.setBackground(Color.decode("#ffd699"));
			
			FlowLayout c2Layout = (FlowLayout)column2.getLayout();
			c2Layout.setVgap(3);
			
				JPanel c2row1 = new JPanel();
				c2row1.setPreferredSize(new Dimension(310, 66));
				c2row1.setBackground(Color.decode("#ffde59"));
				
					JLabel c2r1 = new JLabel("<html><br>Basic</html>");
				
				c2row1.add(c2r1);
			
				JPanel c2row2 = new JPanel();
				c2row2.setPreferredSize(new Dimension(310, 66));
				c2row2.setBackground(Color.decode("#ffebcd"));
				
					JLabel c2r2 = new JLabel(new ImageIcon("ProgrammingUI/src/tickRESIZED.png"));
					
				c2row2.add(c2r2);
					
				
				JPanel c2row3 = new JPanel();
				c2row3.setPreferredSize(new Dimension(310, 66));
				c2row3.setBackground(Color.decode("#ffebcd"));
			
					JLabel c2r3 = new JLabel(new ImageIcon("ProgrammingUI/src/tickRESIZED.png"));
				
				c2row3.add(c2r3);
				
				JPanel c2row4 = new JPanel();
				c2row4.setPreferredSize(new Dimension(310, 66));
				c2row4.setBackground(Color.decode("#ffebcd"));
				
					JLabel c2r4 = new JLabel(new ImageIcon("ProgrammingUI/src/crossRESIZED.png"));
				
				c2row4.add(c2r4);
			
				JPanel c2row5 = new JPanel();
				c2row5.setPreferredSize(new Dimension(310, 66));
				c2row5.setBackground(Color.decode("#ffebcd"));
				
					JLabel c2r5 = new JLabel(new ImageIcon("ProgrammingUI/src/crossRESIZED.png"));
				
				c2row5.add(c2r5);
			
				JPanel c2row6 = new JPanel();
				c2row6.setPreferredSize(new Dimension(310, 66));
				c2row6.setBackground(Color.decode("#ffebcd"));
				
				JLabel c2r6 = new JLabel("<html><br>Default</html>");
				
				c2row6.add(c2r6);
				
				JPanel c2row7 = new JPanel();
				c2row7.setPreferredSize(new Dimension(350, 100));
				c2row7.setBackground(Color.decode("#ffd699"));
			
			// Adding everything to the second column
			column2.add(c2row1);
			column2.add(c2row2);
			column2.add(c2row3);
			column2.add(c2row4);
			column2.add(c2row5);
			column2.add(c2row6);
			column2.add(c2row7);
			
			// Third column of table
			JPanel column3 = new JPanel();
			column3.setBounds(100, 100, 100, 200);
			column3.setPreferredSize(new Dimension(310, 486));
			column3.setBackground(Color.decode("#ffd699"));
			
			FlowLayout c3Layout = (FlowLayout)column3.getLayout();
			c3Layout.setVgap(3);
			
				JPanel c3row1 = new JPanel();
				c3row1.setPreferredSize(new Dimension(310, 66));
				c3row1.setBackground(Color.decode("#ffde59"));
				
					JLabel c3r1 = new JLabel("<html><br>Premium</html>");
				
				c3row1.add(c3r1);
			
				JPanel c3row2 = new JPanel();
				c3row2.setPreferredSize(new Dimension(310, 66));
				c3row2.setBackground(Color.decode("#ffebcd"));
				
					JLabel c3r2 = new JLabel(new ImageIcon("ProgrammingUI/src/crossRESIZED.png"));
				
				c3row2.add(c3r2);
				
				JPanel c3row3 = new JPanel();
				c3row3.setPreferredSize(new Dimension(310, 66));
				c3row3.setBackground(Color.decode("#ffebcd"));
				
					JLabel c3r3 = new JLabel(new ImageIcon("ProgrammingUI/src/tickRESIZED.png"));
				
				c3row3.add(c3r3);
			
				JPanel c3row4 = new JPanel();
				c3row4.setPreferredSize(new Dimension(310, 66));
				c3row4.setBackground(Color.decode("#ffebcd"));
				
					JLabel c3r4 = new JLabel(new ImageIcon("ProgrammingUI/src/tickRESIZED.png"));
				
				c3row4.add(c3r4);
				
				JPanel c3row5 = new JPanel();
				c3row5.setPreferredSize(new Dimension(310, 66));
				c3row5.setBackground(Color.decode("#ffebcd"));
				
					JLabel c3r5 = new JLabel(new ImageIcon("ProgrammingUI/src/tickRESIZED.png"));
				
				c3row5.add(c3r5);
			
				JPanel c3row6 = new JPanel();
				c3row6.setPreferredSize(new Dimension(310, 66));
				c3row6.setBackground(Color.decode("#ffebcd"));

				JLabel c3r6 = new JLabel("<html><br>$4 per month</html>");
				
				c3row6.add(c3r6);
				
				JPanel c3row7 = subscription.subscribe("<html><br>Buy Subscription</html>");
			
			// Adding everything to the third column
			column3.add(c3row1);
			column3.add(c3row2);
			column3.add(c3row3);
			column3.add(c3row4);
			column3.add(c3row5);
			column3.add(c3row6);
			column3.add(c3row7);
			
			// Adding all columns into the table
			table.add(column1);
			table.add(column2);
			table.add(column3);
		
		// Adding the fillerPanel and table to the main panel
		panel.add(fillerPanel, BorderLayout.NORTH);
		panel.add(table, BorderLayout.CENTER);
		
		// Adding the functionality to the subscription button
		c3row7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				subscriptionClick(e);
				
			}
		});
		
		//write your code above		
		
		return panel;
	}

	public static JPanel subscribe(String desc) 
	{
		
		JPanel subscribeButton = new JPanel();
		subscribeButton.setPreferredSize(new Dimension(310, 66));
		subscribeButton.setBackground(Color.decode("#ffebcd"));
		
		// Inserting Text to subscribeButton
		JLabel subscribe = new JLabel(desc, SwingConstants.HORIZONTAL);
		subscribe.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		subscribeButton.add(subscribe);
		
		// For button's reaction when hovering through it
		subscribeButton.addMouseListener(new MouseAdapter() 
		{
			public void mouseEntered(MouseEvent e) {
				
				subscribe.setFont(new Font("Verdana", Font.BOLD, 12));
				
			}
			public void mouseExited(MouseEvent e) { 
				
				subscribe.setFont(new Font("Verdana", Font.PLAIN, 12));
				
			}
			
		});
		
		return subscribeButton;
	
	}
	
	static void subscriptionClick(MouseEvent e)
	{ 
		// New frame for subscription
		JFrame subscriptionFrame = new JFrame(); 
		subscriptionFrame.setTitle("Subscription");
		
		// Main panel for subscription
		JPanel subscriptionMain = new JPanel(); 
		subscriptionMain.setPreferredSize(new Dimension(700, 400));
		subscriptionMain.setLayout(new FlowLayout(FlowLayout.CENTER));	
		subscriptionMain.setBackground(Color.decode("#ddefe3"));
		
		JLabel subscribe = new JLabel("<html><br>Would you like to subscribe for $4 a month?</html>");
		
		JPanel subscribePanel = new JPanel();
		subscribePanel.setPreferredSize(new Dimension(1920, 100));
		subscribePanel.setBackground(Color.decode("#ddefe3"));
		subscribePanel.add(subscribe);
		
		JPanel confirmationPanel = new JPanel(); 
		confirmationPanel.setPreferredSize(new Dimension(250, 50));
		confirmationPanel.setBackground(main.lightgreen); 
		
		
		JPanel cancellationPanel = new JPanel(); 
		cancellationPanel.setPreferredSize(new Dimension(250, 50));
		cancellationPanel.setBackground(main.lightgreen);
		
		// Text for confirmation and cancellation buttons
		JLabel yes = new JLabel("<html><br>Yes</html>"); 
		yes.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		JLabel no = new JLabel("<html><br>No</html>");
		no.setFont(new Font("Verdana", Font.PLAIN, 12));
		
		confirmationPanel.add(yes); 
		cancellationPanel.add(no); 
		
		// Adding all components into main panel
		subscriptionMain.add(subscribePanel, BorderLayout.NORTH);
		subscriptionMain.add(confirmationPanel);
		subscriptionMain.add(cancellationPanel);
		
		// Adding everything to the frame
		subscriptionFrame.add(subscriptionMain);
		subscriptionFrame.setSize(800, 400);
		subscriptionFrame.setLocationRelativeTo(null);
		subscriptionFrame.setVisible(true);
		
		
		confirmationPanel.addMouseListener(new MouseAdapter() {
			
			// Closes window when confirmationPanel is clicked
			public void mouseClicked(MouseEvent e) {
				
				subscriptionFrame.dispatchEvent(new WindowEvent(subscriptionFrame, WindowEvent.WINDOW_CLOSING));
				subscription.isSub = true;  	
			}
			
			// Bolds the font when cursor enters the button
			public void mouseEntered(MouseEvent e) {
				
				yes.setFont(new Font("Verdana", Font.BOLD, 12));
				
			}
			
			// The font goes back to normal upon the cursor's exit from the button
			public void mouseExited(MouseEvent e) 
			{ 
				
				yes.setFont(new Font("Verdana", Font.PLAIN, 12));
				
			}
			
		});
		
		
		cancellationPanel.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) { 
				
				// Closes window when cancellationPanel is clicked
				subscriptionFrame.dispatchEvent(new WindowEvent(subscriptionFrame, WindowEvent.WINDOW_CLOSING));
				
			}
			
			// Bolds the font when cursor enters the button
			public void mouseEntered(MouseEvent e) 
			
			{ 
				
				no.setFont(new Font("Verdana", Font.BOLD, 12));
				
			}
			
			// The font goes back to normal upon the cursor's exit from the button
			public void mouseExited(MouseEvent e) 
			{ 
				
				no.setFont(new Font("Verdana", Font.PLAIN, 12));
				
			}
			
		});
		
	}
	
}