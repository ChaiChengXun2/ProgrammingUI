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
		
		//Re-scaling the image
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
		information.setText("Hello World");
        information.setFont(new Font("Open Sans Extra Bold", Font.PLAIN, 12));
        information.setPreferredSize(new Dimension(350, 400));
        information.setBackground(Color.decode("#1DA2D8"));
        BotLeft.add(information, BorderLayout.WEST);
        Bottom.add(information);
        panel.add(Bottom, BorderLayout.WEST);
        
        //Creation of Bottom Center Panel
       JPanel botcen = new JPanel();
		BufferedImage img2 = null;
		try {
			img2 = ImageIO.read(new File("ProgrammingUI/src/trash.jpg"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Image trash = img2.getScaledInstance(350, 300, Image.SCALE_SMOOTH);
		JLabel BOTCEN = new JLabel();
		ImageIcon Trash = new ImageIcon(trash);
		BOTCEN.setIcon(Trash);
		BOTCEN.setFont(new Font("Open Sans ExtraBold", Font.PLAIN, 12));
		BOTCEN.setPreferredSize(new Dimension(1050, 200));
		BOTCEN.setText("Remove Oceanic Trash!");
		botcen.add(BOTCEN);
		Bottom.add(botcen, BorderLayout.NORTH);
		panel.add(Bottom, BorderLayout.CENTER);
		//write your code above
		
		return panel;
	}
}
