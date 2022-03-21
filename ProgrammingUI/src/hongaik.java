import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.text.NumberFormat;
import java.awt.image.BufferedImage;
import java.io.File;

public class hongaik {
	public static JPanel newPanel() { 
		
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new BorderLayout());
		
		//write your code below 
		//Creation of Top and Bottom Panel
		JPanel Top = new JPanel(new BorderLayout());
		Top.setBackground(Color.CYAN);
		JPanel Bottom = new JPanel(new BorderLayout());
		Bottom.setBackground(Color.decode("#FFB35C"));
		Bottom.setPreferredSize(new Dimension(1050,425));
		
		//Re-scaling the top image
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("ProgrammingUI/src/Banner.jpg"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(1050, 200, Image.SCALE_SMOOTH);
		JLabel Banner = new JLabel();
		
		//Creation of Top Banner
		ImageIcon Intro = new ImageIcon(dimg);
		Banner.setIcon(Intro);
		Banner.setPreferredSize(new Dimension(1050, 200));
		Top.add(Banner);
		panel.add(Top, BorderLayout.NORTH);
		
		//Creation of Bottom Left Panel
		JPanel BotLeft = new JPanel();
		JLabel information = new JLabel();
		 information.setText(("<html><br/>The world’s oceans – their temperature, chemistry, currents and life – "
	                + "<br/>drive global systems that make the Earth habitable for humankind. How "
	                + "<br/>we manage this vital resource is essential for humanity as a whole, and "
	                + "<br/>to counterbalance the effects of climate change."
	                + "<html><br/>Over three billion people depend on marine and coastal biodiversity for "
	                + "<br/>their livelihoods. However, today we are seeing 30 percent of the world’s "
	                + "<br/>fish stocks overexploited, reaching below the level at which they can "
	                + "<br/>produce sustainable yields."
	                + "<html><br/>Oceans also absorb about 30 percent of the carbon dioxide produced by "
	                + "<br/>humans, and we are seeing a 26 percent rise in ocean acidification since "
	                + "<br/>the beginning of the industrial revolution. Marine pollution, an "
	                + "<br/>overwhelming majority of which comes from land-based sources, is "
	                + "<br/>reaching alarming levels, with an average of 13,000 pieces of plastic "
	                + "<br/>litter to be found on every square kilometre of ocean."
	                + "<html><br/>The SDGs aim to sustainably manage and protect marine and coastal "
	                + "<br/>ecosystems from pollution, as well as address the impacts of ocean "
	                + "<br/>acidification. Enhancing conservation and the sustainable use of ocean-"
	                + "<br/>based resources through international law will also help mitigate some "
	                + "<br/>of the challenges facing our oceans.<html>"));
        information.setFont(new Font("Alice", Font.PLAIN, 10));
        BotLeft.setPreferredSize(new Dimension(350, 400));
        BotLeft.setBackground(Color.decode("#1DA2D8"));
        BotLeft.add(information, BorderLayout.NORTH);
        Bottom.add(information, BorderLayout.WEST);
        panel.add(Bottom, BorderLayout.WEST);
        
        //Re-scaling bottom image 
		JPanel BotCen = new JPanel();
        BufferedImage img2 = null;
		try {
			img2 = ImageIO.read(new File("ProgrammingUI/src/trash.jpg"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Image trash = img2.getScaledInstance(350, 300, Image.SCALE_SMOOTH);
		
		//Creation of Bottom Center Panel
		JLabel OceanPic = new JLabel();
		ImageIcon Trash = new ImageIcon(trash);
		OceanPic.setIcon(Trash);
		OceanPic.setFont(new Font("Open Sans ExtraBold", Font.PLAIN, 12));
		OceanPic.setPreferredSize(new Dimension(1050, 200));
		OceanPic.setText("Remove Oceanic Trash!");
		BotCen.add(OceanPic);
		Bottom.add(OceanPic, BorderLayout.CENTER);
		
		//Creation of Bottom Right Panel
		JPanel BotRight = new JPanel();
		JLabel Donation = new JLabel();
		//Creation of Button
		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("$1", true);
		JRadioButton rb2 = new JRadioButton("$10", false);
		JRadioButton rb3 = new JRadioButton("$50", false);
		JRadioButton rb4 = new JRadioButton("$100", false);
		JRadioButton rb5 = new JRadioButton("Others", false);
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		bg.add(rb5);
		
		//Organization of Bottom Right
		Donation.add(rb1);
		Donation.add(rb2);
		Donation.add(rb3);
		Donation.add(rb4);
		Donation.add(rb5);
		BotRight.add(Donation);
		Bottom.add(BotRight, BorderLayout.EAST);
		
		//Put together Bottom Panel
		panel.add(Bottom,BorderLayout.CENTER);
		
		//write your code above
		
		return panel;
	}
}
