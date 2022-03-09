import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;  
  
public class main   
{    
	// declaration of commonly used colours
	public static Color darkgreen = new Color(40, 72, 77);
	public static Color lightgreen = new Color(168, 200, 208);
	public static Color grey = new Color(199, 208, 216);
	   
	public static void main(String args[])  
	{  
		// creation of main frame
		JFrame mainFrame = new JFrame(); 
		  
		JPanel contentPanel = new JPanel();  
		JPanel btnPanel = new JPanel();  
		CardLayout slidePanel = new CardLayout();  
		
		// configurations of top and bottom panels
		contentPanel.setLayout(slidePanel);  
		btnPanel.setPreferredSize(new Dimension(1050, 35));
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
		JButton homeBtn = new JButton("Home"); 
		JButton cxBtn = new JButton("Cheng Xun's Section");
		JButton haBtn = new JButton("Hong Aik's Section");
		JButton ymBtn = new JButton("Yue Ming's Section");
		JButton zjBtn = new JButton("Zi Jie's Section");
		JButton merchBtn = new JButton("Merch"); 
		JButton subscriptionBtn = new JButton("Subscription");
		JButton registerBtn = new JButton("Register");
		JButton loginBtn = new JButton("Login");
		
		// setting general size for buttons
		homeBtn.setBounds(200, 200, 35, 35);
		cxBtn.setBounds(200, 200, 35, 35);
		haBtn.setBounds(200, 200, 35, 35);
		ymBtn.setBounds(200, 200, 35, 35);
		zjBtn.setBounds(200, 200, 35, 35);
		merchBtn.setBounds(200, 200, 35, 35);
		subscriptionBtn.setBounds(200, 200, 35, 35);
		registerBtn.setBounds(200, 200, 35, 35);
		loginBtn.setBounds(200, 200, 35, 35);
		
		// placing buttons into top panel
		btnPanel.add(homeBtn);
		btnPanel.add(cxBtn);
		btnPanel.add(haBtn);
		btnPanel.add(ymBtn);
		btnPanel.add(zjBtn);
		btnPanel.add(merchBtn);
		btnPanel.add(subscriptionBtn);
		btnPanel.add(registerBtn);
		btnPanel.add(loginBtn);
		  
		// added event handling for each button 
		homeBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "1");
			}
		});
	
		cxBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "2");
			}
		});
		
		haBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "3");
			}
		});
		
		ymBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "4");
			}
		});
		
		zjBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "5");
			}
		});
		
		subscriptionBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "7");
			}
		});
		
		merchBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "6");
			}
		});
		
		registerBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "8");
			}
		});
		
		loginBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				slidePanel.show(contentPanel, "9");
			}
		});
		
		// added top panel and content panel into main frame
		mainFrame.add(btnPanel, BorderLayout.NORTH);  
		mainFrame.add(contentPanel, BorderLayout.CENTER);  
		
		mainFrame.setSize(1050, 700);
		mainFrame.setTitle("Title Here");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		mainFrame.setVisible(true);  
	}  
} 
