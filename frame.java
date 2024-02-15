package calculatrice;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class frame extends JFrame{
	

	JFrame frame;
	ImageIcon image = new ImageIcon("images.png");
	frame(){
		
		this.setIconImage(image.getImage());
		this.setSize(450, 500);
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);  
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white);
	}
	
	
	
	
}
