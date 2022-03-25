import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.io.File;

public class hongaik {
	public static JPanel newPanel() { 
		
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(Color.decode("#FFB35C"));
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
	                + "<br/>to counterbalance the effects of climate change.<html>"
	                + "<html><br/>Oceans also absorb about 30% of the carbon dioxide produced by "
	                + "<br/>humans, and we are seeing a 26% rise in ocean acidification since "
	                + "<br/>the beginning of the industrial revolution. Marine pollution, an "
	                + "<br/>overwhelming major city of which comes from land-based sources, is "
	                + "<br/>reaching alarming levels, with an average of 13,000 pieces of plastic "
	                + "<br/>litter to be found on every square kilometre of ocean.<html>"));           
        information.setFont(new Font("Alice", Font.PLAIN, 13));
        BotLeft.setPreferredSize(new Dimension(350, 400));
        BotLeft.setBackground(Color.decode("#1DA2D8"));
        BotLeft.add(information, BorderLayout.NORTH);
        
   
        
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
		
		//Button Creation
		JButton Donate = new JButton("Click Here To Donate");
		BotCen.add(Donate);
		BotCen.setBackground(Color.decode("#FFB35C"));
		BotCen.add(OceanPic,BorderLayout.NORTH);
		
		
		//Creation of Bottom Right Panel
		JPanel BotRight = new JPanel();
		JLabel Slogan = new JLabel();
		Slogan.setText(("<html><br/>Save the Sea,"
				         + "<br/>See the Future."));
				        
		Slogan.setFont(new Font("Alice", Font.PLAIN, 20));
		BotRight.setBackground(Color.decode("#FFB35C"));
		BotRight.add(Slogan, BorderLayout.NORTH);
        
		//Organization of Bottom Panel
        Bottom.add(information, BorderLayout.WEST);
        Bottom.add(BotCen, BorderLayout.SOUTH);
        Bottom.add(OceanPic, BorderLayout.CENTER);
        Bottom.add(Slogan, BorderLayout.EAST);
        
        panel.add(Bottom, BorderLayout.CENTER);
        
		//Button functionality
		Donate.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent ae) {
				
				JFrame DonationSea = new JFrame();
				DonationSea.setTitle("Donate to save the ocean");
				
				JPanel donoSelection = new JPanel();
				donoSelection.setPreferredSize(new Dimension(700, 380));
				donoSelection.setBackground(Color.decode("#FFB35C"));
				donoSelection.setLayout(new FlowLayout());
				
				JTextField Others = new JTextField(10);
				
				//Image for donation panel
				BufferedImage img2 = null;
				try {
					
					img2 = ImageIO.read(new File("ProgrammingUI/src/underwater.jpg"));
				}
				
				catch (IOException e) {
					
					e.printStackTrace();
				}
				
				Image underwater = img2.getScaledInstance(1050, 200, Image.SCALE_SMOOTH);
				
				//Login setup
				if (!(login.isLogin)) { //Did not Login
					
					DonationSea.setResizable(false);
					DonationSea.setSize(400, 150);
					DonationSea.setVisible(true);
		
					JLabel unregistered = new JLabel("Please login to make a donation");
					unregistered.setFont(new Font("Verdana", Font.PLAIN, 16));
					unregistered.setHorizontalAlignment(JLabel.CENTER);
					unregistered.setPreferredSize(new Dimension(400, 50));
					unregistered.setForeground(Color.red);
					
					JButton loginB = new JButton("Login");
					JButton Cancel = new JButton("Cancel");
					
					donoSelection.add(unregistered, BorderLayout.NORTH);
					donoSelection.add(loginB, BorderLayout.SOUTH);
					donoSelection.add(Cancel, BorderLayout.SOUTH);
					DonationSea.add(donoSelection);
					
					loginB.addActionListener(new ActionListener() { 
						public void actionPerformed(ActionEvent e) {
							main.slidePanel.show(main.contentPanel, "9");
							DonationSea.dispatchEvent(new WindowEvent(DonationSea, WindowEvent.WINDOW_CLOSING));
						}
						
					});
					Cancel.addActionListener(new ActionListener(){
			    		public void actionPerformed(ActionEvent e) {
			    			DonationSea.dispose();
			    		}
			    	});
				}
				
				else { //Login successfully
				
					DonationSea.setResizable(false);
					DonationSea.setSize(800, 500);
					DonationSea.setVisible(true);
					
					JPanel donationImage = new JPanel();
					donationImage.add(new JLabel(new ImageIcon(underwater)));
					donationImage.setPreferredSize(new Dimension(400, 200));
				
				    JLabel appreciation = new JLabel("<html>Please choose donation amount.");
				    appreciation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				    appreciation.setHorizontalAlignment(JLabel.LEFT);
				    appreciation.setPreferredSize(new Dimension(350,75));
				
				    JPanel Selection = new JPanel();
				    Selection.setPreferredSize(new Dimension(350, 350));
				    Selection.setBackground(Color.decode("#FFB35C"));
				    
				    JLabel ThankYou = new JLabel();
				
			    	//RadioButton selection for donation
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
		     		
		     		//Confirmation button
		     		JButton ConfirmC = new JButton("Confirm");
		     		JButton CancelC = new JButton("Cancel");
		     		Selection.add(ConfirmC);
		     		Selection.add(CancelC);
			
		     		ConfirmC.addActionListener(new ActionListener() { 
		    			public void actionPerformed(ActionEvent ae) {
		    				ThankYou.setText("Your contribution to save the ocean is much appreciated!");
		    				ThankYou.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		    			}
		    			
		     		});
		     		
		     		CancelC.addActionListener(new ActionListener(){
			    		public void actionPerformed(ActionEvent e) {
			    			DonationSea.dispose();
			    		}
			    		
			    	});
		     		
	        		donoSelection.add(donationImage, BorderLayout.EAST);
		        	donoSelection.add(appreciation, BorderLayout.WEST);
		        	donoSelection.add(Selection, BorderLayout.SOUTH);
		        	donoSelection.add(ThankYou,BorderLayout.SOUTH);

	         		DonationSea.add(donoSelection);
	         		}
				
				}
			
			});
		
		//write your code above
		
		return panel;
	}
		
}