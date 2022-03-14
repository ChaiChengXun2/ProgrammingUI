import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home
{
	public static int curr = 1;
	public static String arrayOfSlogans[] = {
			"", 
			"Hotel? Trivago.",
			"Hong Aik Slogan 1st Line",
			"Zi Jie Slogan 1st Line", 
			"Hunger Relief Now", 
			"Your Trash Might Be Someone Else's Treasure"
	};
	public static String arrayOfSlogans2[] = {
			"",
			"Donation? <title here>",
			"Hong Aik Slogan 2nd Line",
			"Zi Jie Slogan 2nd Line",
			"Resilience Tomorrow",
			"Donate to People in Need Now"
	};
	
	public static JPanel newPanel()
	{ 
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 665));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new BorderLayout(0, 0));
		
		//write your code below 
		
		//created structure panels
		JPanel slidePanel = new JPanel();
		JPanel contentPanel = new JPanel();
		JPanel btnPanel = new JPanel(); 
		JPanel labelPanel = new JPanel();
		
		// configuration of structure panels
		slidePanel.setPreferredSize(new Dimension(1050, 450));
		contentPanel.setPreferredSize(new Dimension(1050, 215));
		contentPanel.setLayout(new BorderLayout(0, 0));
		btnPanel.setPreferredSize(new Dimension(1050, 35));
		labelPanel.setPreferredSize(new Dimension(1050, 180));
		
		// configuration of structure panels part 2
		slidePanel.setBackground(main.lightgreen);
		contentPanel.setBackground(main.lightgreen);
		btnPanel.setBackground(main.lightgreen);
		labelPanel.setBackground(main.lightgreen);
		
		// create a card layout
		CardLayout myLayout = new CardLayout(); 
		slidePanel.setLayout(myLayout);
		
		// added pictures
		JLabel introduction = new JLabel(new ImageIcon("ProgrammingUI/src/introduction.png"));
		JLabel water = new JLabel(new ImageIcon("ProgrammingUI/src/LifeBelowWater.png"));
		JLabel land = new JLabel(new ImageIcon("ProgrammingUI/src/LifeOnLand.png"));
		JLabel hunger = new JLabel(new ImageIcon("ProgrammingUI/src/NoHunger.png"));
		JLabel poverty = new JLabel(new ImageIcon("ProgrammingUI/src/NoPoverty.png"));
		
		// created panels to put pictures
		JPanel introductionPanel = new JPanel(); 
		JPanel waterPanel = new JPanel(); 
		JPanel landPanel = new JPanel(); 
		JPanel hungerPanel = new JPanel(); 
		JPanel povertyPanel = new JPanel(); 
		
		// configuration of picture panels
		introductionPanel.setBackground(main.lightgreen);
		waterPanel.setBackground(main.lightgreen); 
		landPanel.setBackground(main.lightgreen); 
		hungerPanel.setBackground(main.lightgreen); 
		povertyPanel.setBackground(main.lightgreen); 

		// configuration of picture panel part 2
		introductionPanel.setPreferredSize(new Dimension(1050, 450));
		waterPanel.setPreferredSize(new Dimension(1050, 450));
		landPanel.setPreferredSize(new Dimension(1050, 450));
		hungerPanel.setPreferredSize(new Dimension(1050, 450));
		povertyPanel.setPreferredSize(new Dimension(1050, 450));
		
		// adding pictures into picture panel
		introductionPanel.add(introduction);
		waterPanel.add(water);
		landPanel.add(land);
		hungerPanel.add(hunger);
		povertyPanel.add(poverty);
		
		// adding picture panels into card layout
		slidePanel.add(introductionPanel, "1");
		slidePanel.add(waterPanel, "2"); 
		slidePanel.add(landPanel, "3"); 
		slidePanel.add(hungerPanel, "4"); 
		slidePanel.add(povertyPanel, "5"); 
		
		// creation and configuration of buttons
		JPanel nextPanel = new JPanel(); 
		JPanel prevPanel = new JPanel();
		
		nextPanel.setPreferredSize(new Dimension(500, 450));
		prevPanel.setPreferredSize(new Dimension(500, 450));
		nextPanel.setBackground(main.transparent);
		prevPanel.setBackground(main.transparent);
		
		JLabel next = new JLabel(">");
		JLabel prev = new JLabel("<");
		
		next.setFont(new Font("Verdana", Font.PLAIN, 20));
		prev.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		// adding buttons into button panels
		nextPanel.add(next);
		prevPanel.add(prev);
		btnPanel.add(prevPanel);
		btnPanel.add(nextPanel);
		
		// creating the messages
		JLabel msg = new JLabel("Hotel? Trivago."); 
		labelPanel.add(msg);
		msg.setHorizontalAlignment(JLabel.CENTER);
		msg.setFont(new Font("Verdana", Font.BOLD, 20));
		msg.setPreferredSize(new Dimension(1050, 25));
		
		// creating messages part 2
		JLabel msg2 = new JLabel("Donation? <title here>."); 
		labelPanel.add(msg2);
		msg2.setHorizontalAlignment(JLabel.CENTER);
		msg2.setFont(new Font("Verdana", Font.BOLD, 20));
		msg2.setPreferredSize(new Dimension(1050, 25));
		
		// event handling
		nextPanel.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				if (curr < 6 && curr > 0)
				{
					if (curr >= 5)
					{
						curr += 0;
					}
					else
					{
						curr++;
						String value = String.valueOf(curr);
						myLayout.show(slidePanel, value);
						msg.setText(arrayOfSlogans[curr]);
						msg2.setText(arrayOfSlogans2[curr]);
					}
				}
			}
			
			public void mouseEntered(MouseEvent e)
			{
				nextPanel.setBackground(main.grey);
			}
			
			public void mouseExited(MouseEvent e)
			{
				nextPanel.setBackground(main.lightgreen);
			}
		});
		
		prevPanel.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				if (curr > 0)
				{
					if (curr == 1)
					{
						curr -= 0;
					}
					else
					{
						curr--;
						String value = String.valueOf(curr);
						myLayout.show(slidePanel, value);
						msg.setText(arrayOfSlogans[curr]);
						msg2.setText(arrayOfSlogans2[curr]);	
					}
				}
			}
			
			public void mouseEntered(MouseEvent e)
			{
				prevPanel.setBackground(main.grey);
			}
			
			public void mouseExited(MouseEvent e)
			{
				prevPanel.setBackground(main.lightgreen);
			}
		});
		
		contentPanel.add(btnPanel, BorderLayout.NORTH);
		contentPanel.add(labelPanel, BorderLayout.CENTER);
		panel.add(slidePanel, BorderLayout.NORTH);
		panel.add(contentPanel,BorderLayout.CENTER);
		
		//write your code above
		
		return panel;
	}
}
