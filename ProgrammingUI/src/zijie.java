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

		// Creation of Banner
		//JPanel banner = new JPanel();
		//banner.setBackground(Color.decode("#022902"));
		//banner.setPreferredSize(new Dimension(1050, 225));
		
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
		
		JLabel information = new JLabel();
		information.setText(("<html><br/>Trees contribute to clean the air we breathe,<br/>filter the water we drink, and support over<br/>"
						   + "80% of the world's terrestrial biodiversity.<br/>Over 1.6 billion people rely on forests for<br/>employment, and forests absorb dangerous" 
						   + "<br/>carbon from the atmosphere.</html>"));
		information.setFont(new Font("Verdana", Font.PLAIN, 16));
		infoPanel.setBackground(Color.decode("#ddefe3"));
		
		infoPanel.add(Reason, BorderLayout.NORTH);
		infoPanel.add(information);
		
		// Inserting image into banner
		JLabel zjBanner = new JLabel(image);
		
		//banner.add(zjBanner, BorderLayout.NORTH);
		
		// Adding the banner into the Main Panel
		panel.add(zjBanner, BorderLayout.NORTH);
		panel.add(infoPanel, BorderLayout.WEST);
		
		//write your code above
		
		return panel;
	}
}
