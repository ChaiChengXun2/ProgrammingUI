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
		
		//Creation of Button
		JButton Donate = new JButton("Click Here To Donate");
		BotRight.add(Donate);
		BotRight.setBackground(Color.decode("#FFB35C"));
		Bottom.add(BotRight, BorderLayout.EAST);
		
		//Put together Bottom Panel
		panel.add(Bottom,BorderLayout.CENTER);
		
		//Button functionality
		Donate.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent ae) {
				
				JFrame DonationSea = new JFrame();
				DonationSea.setTitle("Donate to save the ocean");
				DonationSea.setResizable(false);
				DonationSea.setSize(500, 400);
				DonationSea.setVisible(true);
				
				JPanel donoSelection = new JPanel();
				donoSelection.setPreferredSize(new Dimension(700, 380));
				donoSelection.setBackground(Color.decode("#caebd7"));
				donoSelection.setLayout(new FlowLayout());
				
				JTextField Others = new JTextField(10);
				
				BufferedImage img2 = null;
				try {
					img2 = ImageIO.read(new File("ProgrammingUI/src/underwater.jpg"));
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				Image underwater = img2.getScaledInstance(1050, 200, Image.SCALE_SMOOTH);

				if (!(login.isLogin)) {
		
					JLabel Register = new JLabel("Please login to make a donation");
					
					Register.setFont(new Font("Alice", Font.BOLD, 16));
					Register.setHorizontalAlignment(JLabel.CENTER);
					Register.setPreferredSize(new Dimension(400, 50));
					Register.setForeground(Color.red);
				
					DonationSea.setSize(300,100);
					donoSelection.add(Register);
					
				} 
				
				else {
					
				JPanel donationImage = new JPanel();
				donationImage.add(new JLabel(new ImageIcon(underwater)));
				donationImage.setPreferredSize(new Dimension(400, 200));
				
				JLabel appreciation = new JLabel("<html>Your contribution to save the ocean is much appreciated."
						                        +"<br>Please choose donation amount.</html>");
				appreciation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				appreciation.setHorizontalAlignment(JLabel.LEFT);
				appreciation.setPreferredSize(new Dimension(350,75));
				
				JPanel Selection = new JPanel();
				Selection.setPreferredSize(new Dimension(350, 250));
				Selection.setBackground(Color.decode("#caebd7"));
				
				ButtonGroup amountGroup1 = new ButtonGroup();
				JRadioButton amount1 = new JRadioButton("5 Dollars", true);
				JRadioButton amount2 = new JRadioButton("10 Dollars", false);
				JRadioButton amount3 = new JRadioButton("50 Dollars", false);
				JRadioButton amount4 = new JRadioButton("100 Dollars", false);
				JRadioButton amount5 = new JRadioButton("Others", false);
			
				amountGroup1.add(amount1);
				amountGroup1.add(amount2);
				amountGroup1.add(amount3);
				amountGroup1.add(amount4);
				amountGroup1.add(amount5);
				Selection.add(amount1);
				Selection.add(amount2);
				Selection.add(amount3);
				Selection.add(amount4);
				Selection.add(amount5);
				Selection.add(Others);
			
			donoSelection.add(donationImage, BorderLayout.EAST);
			donoSelection.add(appreciation, BorderLayout.WEST);
			donoSelection.add(Selection, BorderLayout.SOUTH);
			
			DonationSea.add(donoSelection);
			
			}
			}
		});
		//write your code above
		
		return panel;
	}
		
}