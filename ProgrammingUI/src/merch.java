import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class merch {
	public static JPanel createMerchPanel()
	{ 
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new BorderLayout(0, 0));
		
		//write your code below 
		JPanel leftPanel = new JPanel(); 
		JPanel rightPanel = new JPanel(); 
		JPanel picturePanel = new JPanel(); 
		
		picturePanel.setPreferredSize(new Dimension(250, 250));
		picturePanel.setBackground(main.grey);
		leftPanel.setPreferredSize(new Dimension(250, 625));
		rightPanel.setPreferredSize(new Dimension(800, 625));
		
		JLabel msg = new JLabel(); 
		msg.setSize(250, 250);
		msg.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JPanel nonsubItem1 = chengxun.createCard("item 1", "ProgrammingUI/src/logo.png");
		JPanel nonsubItem2 = chengxun.createCard("item 2", "ProgrammingUI/src/logo.png");
		JPanel nonsubItem3 = chengxun.createCard("item 3", "ProgrammingUI/src/logo.png");
		
		JPanel subItem1 = chengxun.createCard("item 4", "ProgrammingUI/src/logo.png");
		JPanel subItem2 = chengxun.createCard("item 5", "ProgrammingUI/src/logo.png");
		JPanel subItem3 = chengxun.createCard("item 6", "ProgrammingUI/src/logo.png");
		
		JButton press = new JButton("Refresh Subscribe status");
		
		//write your code above
		
		press.addMouseListener(new MouseAdapter() 
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
		});
		
		rightPanel.add(nonsubItem1);
		rightPanel.add(nonsubItem2);
		rightPanel.add(nonsubItem3);
		
		leftPanel.add(picturePanel);
		leftPanel.add(press);
		leftPanel.add(msg);
		panel.add(rightPanel, BorderLayout.EAST);
		panel.add(leftPanel, BorderLayout.WEST);
		
		return panel;
	}

}
