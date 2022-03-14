import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class hongaik {
	public static JPanel newPanel() { 
		
ImageIcon TitleIcon = new ImageIcon("Beach.jpg");
		
		JPanel panel = new JPanel(); 
		panel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4,Color.decode("#000000")));
		panel.setPreferredSize(new Dimension(1050, 625));
		panel.setBackground(main.lightgreen);
		panel.setLayout(new GridLayout(4, 1, 1, 1));
		
		JLabel Title = new JLabel();
		Title.setIcon(TitleIcon);
		Title.setText("Welcome to Life Below Water Site");
		Title.setVerticalAlignment(JLabel.TOP);
		
		//write your code below 
		JPanel Intro = new JPanel();
		JPanel Selection = new JPanel();
		
		//Creation of Title/Picture pane
		Intro.setBackground(Color.decode("#09C3DB"));
		Intro.setBounds(0,0,300,300);
		Intro.setLayout(new FlowLayout());
		Intro.add(Title);
		panel.add(Intro);

		
		//write your code above
		
		return panel;
	}
}
