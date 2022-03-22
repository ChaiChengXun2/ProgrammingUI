import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;  
  
public class main
{    
	// declaration of commonly used colours
	public static Color darkgreen = new Color(40, 72, 77);
	public static Color lightgreen = new Color(168, 200, 208);
	public static Color grey = new Color(199, 208, 216);
	public static Color transparent = new Color(0, 0, 0, 0);
	
	public static JPanel contentPanel = new JPanel();
	public static CardLayout slidePanel = new CardLayout();
	   
	public static void main(String args[])  
	{  
		// our logo
		ImageIcon logo = new ImageIcon("ProgrammingUI/src/logo.png");
		
		// creation of main frame
		JFrame mainFrame = new JFrame(); 
		  
		// creation of panels  
		JPanel btnPanel = new JPanel();   
		
		// configurations of top and bottom panels
		contentPanel.setLayout(slidePanel);  
		btnPanel.setPreferredSize(new Dimension(1050, 60));
		contentPanel.setPreferredSize(new Dimension(1050, 665));
		btnPanel.setBackground(main.darkgreen);
		btnPanel.setLayout(new FlowLayout());
		
		// creation of panels from each file
		JPanel homePanel = home.newPanel();     
		JPanel cxPanel = chengxun.newPanel(); 
		JPanel registerPanel = register.newPanel();
		JPanel loginPanel = login.newPanel(); 
		JPanel haPanel = hongaik.newPanel(); 
		JPanel ymPanel = yueming.newPanel(); 
		JPanel zjPanel = zijie.newPanel();
		JPanel merchPanel = merch.createMerchPanel(); 
		JPanel subscriptionPanel = subscription.createSubscriptionPanel();
		
		// added the panels from each file into the main panel
		contentPanel.add(homePanel, "1");  
		contentPanel.add(cxPanel, "2");   
		contentPanel.add(haPanel, "3");
		contentPanel.add(ymPanel, "4");
		contentPanel.add(zjPanel, "5");
		contentPanel.add(merchPanel, "6"); 
		contentPanel.add(subscriptionPanel, "7");
		contentPanel.add(registerPanel, "8");  
		contentPanel.add(loginPanel, "9");
		
		// creation of buttons for each "view"
		JLabel homeLbl = new JLabel(logo); 
		JLabel cxLbl = new JLabel("NoPoverty");
		JLabel haLbl = new JLabel("Under The Sea");
		JLabel ymLbl = new JLabel("Global FoodBanking Network");
		JLabel zjLbl = new JLabel("Zi Jie's Section");
		JLabel merchLbl = new JLabel("Merch"); 
		JLabel subLbl = new JLabel("Subscription");
		JLabel registerLbl = new JLabel("Register");
		JLabel loginLbl = new JLabel("Login");
		
		// configuration for each button
		homeLbl.setForeground(main.lightgreen);
		cxLbl.setForeground(main.lightgreen);
		haLbl.setForeground(main.lightgreen);
		ymLbl.setForeground(main.lightgreen);
		zjLbl.setForeground(main.lightgreen);
		merchLbl.setForeground(main.lightgreen);
		subLbl.setForeground(main.lightgreen);
		registerLbl.setForeground(main.lightgreen);
		loginLbl.setForeground(main.lightgreen);
		
		// more configuration for each button
		cxLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		haLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		ymLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		zjLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		merchLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		subLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		registerLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		loginLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
		
		// creation of panels to place labels
		JPanel home = new JPanel();
		JPanel cx = new JPanel();
		JPanel ha = new JPanel();
		JPanel ym = new JPanel();
		JPanel zj = new JPanel();
		JPanel merch = new JPanel();
		JPanel sub = new JPanel();
		JPanel register = new JPanel();
		JPanel login = new JPanel();
		
		// configuration of home logo
		home.setPreferredSize(new Dimension(60, 60));
		
		// configuration of panels 
		home.setBackground(main.transparent);
		cx.setBackground(main.transparent);
		ha.setBackground(main.transparent);
		ym.setBackground(main.transparent);
		zj.setBackground(main.transparent);
		sub.setBackground(main.transparent);
		register.setBackground(main.transparent);
		merch.setBackground(main.transparent);
		login.setBackground(main.transparent);
		home.setBackground(main.transparent);
		
		// placing buttons into top panel
		home.add(homeLbl);
		cx.add(cxLbl);
		ha.add(haLbl);
		ym.add(ymLbl);
		zj.add(zjLbl);
		merch.add(merchLbl);
		sub.add(subLbl);
		register.add(registerLbl);
		login.add(loginLbl);
		
		btnPanel.add(home);
		btnPanel.add(cx);
		btnPanel.add(ha);
		btnPanel.add(ym);
		btnPanel.add(zj);
		btnPanel.add(merch);
		btnPanel.add(sub);
		btnPanel.add(register);
		btnPanel.add(login);
		  
		// added event handling for each button 
		homeLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "1");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				home.setBackground(main.grey);
			}
			public void mouseExited(MouseEvent e) 
			{ 
				home.setBackground(main.darkgreen);
			}
		});
	
		cxLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "2");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				cxLbl.setForeground(main.grey);
				cxLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				cxLbl.setForeground(main.lightgreen);
				cxLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		haLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "3");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				haLbl.setForeground(main.grey);
				haLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				haLbl.setForeground(main.lightgreen);
				haLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		ymLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "4");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				ymLbl.setForeground(main.grey);
				ymLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				ymLbl.setForeground(main.lightgreen);
				ymLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		zjLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "5");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				zjLbl.setForeground(main.grey);
				zjLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				zjLbl.setForeground(main.lightgreen);
				zjLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		subLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "7");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				subLbl.setForeground(main.grey);
				subLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				subLbl.setForeground(main.lightgreen);
				subLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		merchLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "6");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				merchLbl.setForeground(main.grey);
				merchLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				merchLbl.setForeground(main.lightgreen);
				merchLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		registerLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "8");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				registerLbl.setForeground(main.grey);
				registerLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				registerLbl.setForeground(main.lightgreen);
				registerLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		loginLbl.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent e)
			{
				slidePanel.show(contentPanel, "9");
			}
			public void mouseEntered(MouseEvent e) 
			{ 
				loginLbl.setForeground(main.grey);
				loginLbl.setFont(new Font("Verdana", Font.BOLD, 13));
			}
			public void mouseExited(MouseEvent e) 
			{ 
				loginLbl.setForeground(main.lightgreen);
				loginLbl.setFont(new Font("Verdana", Font.PLAIN, 13));
			}
		});
		
		// added top panel and content panel into main frame
		mainFrame.add(btnPanel, BorderLayout.NORTH);  
		mainFrame.add(contentPanel, BorderLayout.CENTER);  
		
		//configuration of main frame
		mainFrame.setSize(1050, 725);
		mainFrame.setTitle("All In: Donation");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);  
	}  
} 
