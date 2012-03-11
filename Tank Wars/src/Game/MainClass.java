package Game;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass {
	
	public static void main(String[] args) {
		GameMenu();
		//GameWindow();
		
	}
	
	public static void GameMenu() {
		ImagePanel panel = new ImagePanel(new ImageIcon("D:/menu.jpg").getImage());
	    JFrame frame = new JFrame();
	    frame.setSize(1030, 615);
	    frame.getContentPane().add(panel);
	    frame.setResizable(false);
	    frame.setVisible(true);
	}
	
	public static void GameWindow() {
		JFrame frame = new JFrame("Tank Wars");
		frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1030,615);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
	
	class ImagePanel extends JPanel {

		  private Image img;

		  public ImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public ImagePanel(Image img) {
		    this.img = img;
		    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		    setPreferredSize(size);
		    setMinimumSize(size);
		    setMaximumSize(size);
		    setSize(size);
		    setLayout(null);
		  }
		  
		  public void paintComponent(Graphics g) {
			    g.drawImage(img, 0, 0, null);
			  }
	}

