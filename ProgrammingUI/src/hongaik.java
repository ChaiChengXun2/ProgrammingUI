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
		JPanel info = new JPanel();
		JLabel information = new JLabel();
		information.setText("Hello World");
        information.setFont(new Font("Open Sans Extra Bold", Font.PLAIN, 12));
        info.setBackground(Color.decode("#1DA2D8"));
        info.setPreferredSize(new Dimension(350, 400));
        info.add(information, BorderLayout.NORTH);
        panel.add(Bottom, BorderLayout.WEST);
        
		//write your code above
		
		return panel;
	}
}
