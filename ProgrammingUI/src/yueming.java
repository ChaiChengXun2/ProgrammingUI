import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class yueming
{
	public static JPanel newPanel()
	{ 
		ImageIcon FBimg = new ImageIcon("ProgrammingUI\\src\\Global-Foodbanking.png");
		//ImageIcon Givemeal = new ImageIcon("ProgrammingUI\\src\\GiveAmeal.jfif");
		ImageIcon Whydonate = new ImageIcon("ProgrammingUI\\\\src\\\\howFoodBankingWorks.jpg");
		ImageIcon noHungerpic = new ImageIcon("ProgrammingUI\\src\\no-Hunger.png");
		JPanel panel = new JPanel(); 
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(Color.decode("#caebd7"));
		//hex color codes require Color.decode to work
		panel.setLayout(new BorderLayout());
	
		

		
		
		//panel.add(myLabel, BorderLayout.CENTER); // i am not sure how to center the message still
		
		//write your code below 
		
		
		JLabel sloganTextmain= new JLabel();
		sloganTextmain.setText("<html><br/>POWERING <br/>COMMUNITIES"
				+ "<br/>FOR ZERO<br/>HUNGER </html>");
		sloganTextmain.setFont(new Font("League Spartan",Font.BOLD,30));
		sloganTextmain.setForeground(Color.decode("#009c1f"));
		
		JLabel DonationR = new JLabel();
		DonationR.setText("<html><br/>COVID-19 has increased food <br/>insecurity to its highest levels in"
				+ "<br/>decades. The Global FoodBanking<br/>Network (GFN) helps frontline food"
				+ "<br/> banks respond to immediate needs <br/>while powering a community-driven"
				+ "<br/>response that builds resilience for <br/> the future.</html>");//paragraph text for donation reason
		DonationR.setFont(new Font("Alice",Font.PLAIN, 20));
		DonationR.setForeground(Color.decode("#00871b"));
				     
		
		
		//JLabel Gmeal = new JLabel(Givemeal);
		JLabel WDonate = new JLabel(Whydonate);
		JLabel NHunger = new JLabel(noHungerpic);
		
		JPanel DmealNow = chengxun.createCard("GIVE SOMEONE A MEAL","ProgrammingUI\\src\\GiveAmeal.jfif");
		//card created so that i can display image while have the fuction of a button
		DmealNow.setBackground(Color.decode("#caebd7"));
		
		
		JLabel FBPic = new JLabel(FBimg);
	    FBPic.setForeground(Color.decode("#009c1f"));
	    
		
		JPanel Cen = new JPanel(); //center panel created
		JPanel mealNowPanel = new JPanel(); // to make the card button smaller, another panel is created to exclusively put the button ine
		Cen.setBackground(Color.decode("#caebd7"));
		Cen.setLayout(new BorderLayout());
		//Cen.add(Gmeal,BorderLayout.CENTER);
		Cen.add(sloganTextmain,BorderLayout.WEST);
		Cen.add(DonationR,BorderLayout.EAST);
		Cen.add(mealNowPanel,BorderLayout.CENTER);
		
		mealNowPanel.add(DmealNow); // add the button into its standalone panel
		mealNowPanel.setBackground(Color.decode("#caebd7"));
		
		
		panel.add(Cen,BorderLayout.CENTER);
		
		JPanel Nor = new JPanel();
	    Nor.setLayout(new BorderLayout());//north panel
		
		Nor.setBackground(Color.decode("#68f785"));
		Nor.add(FBPic,BorderLayout.WEST);
		Nor.add(NHunger,BorderLayout.CENTER);
		Nor.add(WDonate,BorderLayout.EAST);
		panel.add(Nor,BorderLayout.NORTH); //Nor panel becomes the top part of main panel
		
		DmealNow.addMouseListener(new MouseAdapter() { //giving the button funcationality
			public void mouseClicked(MouseEvent e) {	
	
				JFrame DonationFrameFood = new JFrame();
				DonationFrameFood.setTitle("Donate to help end world hunger today");
				
				JButton donoButt = new JButton();
				donoButt.setText("DONATE");
				donoButt.setSize(200, 250);
				donoButt.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e)
					{
						DonationFrameFood.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				});
				
				
				
				JPanel donoMain = new JPanel();
				donoMain.setPreferredSize(new Dimension(700, 380));
				donoMain.setBackground(Color.decode("#caebd7"));
				
				donoMain.setLayout(new FlowLayout());
				
				JTextField CSTMdono = new JTextField(10);  //text field to enter custom donation amont
				
				if (!(login.isLogin)) {
					
					JLabel pleaseregister = new JLabel("Please login to make a donation");
					
					pleaseregister.setFont(new Font("Alice", Font.BOLD, 16));
					pleaseregister.setHorizontalAlignment(JLabel.CENTER);
					pleaseregister.setPreferredSize(new Dimension(400, 50));
					pleaseregister.setForeground(Color.red);
				
					
				
					DonationFrameFood.setSize(300,100);
					donoMain.add(pleaseregister);
					
				} 
				
				else {
					
				JPanel donationImage = new JPanel();
				donationImage.add(new JLabel(new ImageIcon("ProgrammingUI\\src\\whydonate.png")));
				donationImage.setPreferredSize(new Dimension(350, 250));
				
				JLabel appreciation = new JLabel("<html>Thank you for your contribution to end world hunger.<br>Please choose your donation amount.</html>");
				appreciation.setFont(new Font("Times New Roman", Font.PLAIN, 18));
				appreciation.setHorizontalAlignment(JLabel.LEFT);
				appreciation.setPreferredSize(new Dimension(350,75));
				
				JPanel donoAmou = new JPanel();
				donoAmou.setPreferredSize(new Dimension(350, 250));
				donoAmou.setBackground(Color.decode("#caebd7"));
				
				
				
					ButtonGroup amountGroup1 = new ButtonGroup();
					JRadioButton amount1 = new JRadioButton("20 Dollars", true);
					JRadioButton amount2 = new JRadioButton("50 Dollars", false);
					JRadioButton amount3 = new JRadioButton("100 Dollars", false);
					JRadioButton amount4 = new JRadioButton("200 Dollars", false);
					JRadioButton CSTMamount = new JRadioButton("Custom", false);
				
					amountGroup1.add(amount1);
					amountGroup1.add(amount2);
					amountGroup1.add(amount3);
					amountGroup1.add(amount4);
					amountGroup1.add(CSTMamount);
					donoAmou.add(amount1);
					donoAmou.add(amount2);
					donoAmou.add(amount3);
					donoAmou.add(amount4);
					donoAmou.add(CSTMamount);
					donoAmou.add(CSTMdono);
				
				
				
				DonationFrameFood.setSize(800,500);
				
				donoMain.add(donationImage, BorderLayout.NORTH);
				donoMain.add(appreciation, BorderLayout.WEST);
				donoMain.add(donoAmou, BorderLayout.CENTER);
				donoMain.add(donoButt,BorderLayout.SOUTH);
				
				}
		
		DonationFrameFood.add(donoMain);
		DonationFrameFood.setLocationRelativeTo(null);
		DonationFrameFood.setVisible(true);
				}	
		    });
		
			
		
		JPanel Rig = new JPanel(); //dummy right panel for centering
		Rig.setBackground(Color.decode("#caebd7"));
		
		
		panel.add(Rig,BorderLayout.EAST);
		
		return panel;
	
			

		
		//write your code above
		
		
		}
	}


