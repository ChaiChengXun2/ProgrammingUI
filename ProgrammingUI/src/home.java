import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class home
{
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
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton ("4");
		JButton five = new JButton("5");
		one.setBounds(200, 200, 35, 35);
		two.setBounds(200, 200, 35, 35);
		three.setBounds(200, 200, 35, 35);
		four.setBounds(200, 200, 35, 35);
		five.setBounds(200, 200, 35, 35);
		
		// adding buttons into button panels
		btnPanel.add(one); 
		btnPanel.add(two); 
		btnPanel.add(three); 
		btnPanel.add(four);
		btnPanel.add(five);
		
		// creating the messages
		JLabel msg = new JLabel("Hotel? Trivago."); 
		labelPanel.add(msg);
		msg.setHorizontalAlignment(JLabel.CENTER);
		msg.setFont(new Font("Verdana", Font.BOLD, 25));
		msg.setPreferredSize(new Dimension(1050, 25));
		
		// creating messages part 2
		JLabel msg2 = new JLabel("Donation? <title here>."); 
		labelPanel.add(msg2);
		msg2.setHorizontalAlignment(JLabel.CENTER);
		msg2.setFont(new Font("Verdana", Font.BOLD, 25));
		msg2.setPreferredSize(new Dimension(1050, 25));
		
		// event handling
		one.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				myLayout.show(slidePanel, "1");
				msg.setText("Hotel? Trivago.");
				msg2.setText("Donation? <title here>.");
			}
		});
		
		two.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				myLayout.show(slidePanel, "2");
				msg.setText("Hong Aik Slogan");
				msg2.setText("Hong Aik Slogan");
			}
		});

		three.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				myLayout.show(slidePanel, "3");
				msg.setText("Zi Jie Slogan");
				msg2.setText("Zi Jie Slogan");
			}
		});
		
		four.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				myLayout.show(slidePanel, "4");
				msg.setText("Hunger Relief Now.");
				msg2.setText("Resilience Tomorrow.");
			}
		});
		
		five.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				myLayout.show(slidePanel, "5");
				msg.setText("Your Trash Might Be Someone Else's Treasure!");
				msg2.setText("Donate to people in need now!!");
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
