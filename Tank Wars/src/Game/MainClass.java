package Game;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass {
	
	public static void main(String[] args) {
		
		GameMenu();
		
	}
	
	public static void GameMenu() {
		
		ImagePanel panel = new ImagePanel(new ImageIcon("D:/bg.png").getImage());
	    final JFrame frame = new JFrame();  
	    
	    JButton play = new JButton();
	    Icon img2 = new ImageIcon("D:/play2.gif");
	    play.setBounds(440, 280, 139, 21);
	    play.setIcon(img2);
	    play.setVisible(true);
	    play.setBorder(null);
	    
	    frame.add(play);
	    frame.setSize(1030, 615);
	    frame.getContentPane().add(panel);
	    frame.setResizable(false);
	    frame.setVisible(true);

	    play.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e){
	    		frame.dispose();
	    		GameWindow();
	    	}
	    });
	        
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

		  private Image img, imgplay, imgoptions, imgcredits, imgexit;

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
			  	imgplay    = new ImageIcon("D:/play.png").getImage();
			  	imgoptions = new ImageIcon("D:/options.png").getImage();
			  	imgcredits = new ImageIcon("D:/credits.png").getImage();
			  	imgexit    = new ImageIcon("D:/exit.png").getImage();
			  	
			    g.drawImage(img, 0, 0, null);
			    g.drawImage(imgplay,    440, 280, null);
			    g.drawImage(imgoptions, 410, 360, null);
			    g.drawImage(imgcredits, 410, 440, null);
			    g.drawImage(imgexit,    450, 520, null);
		  }

	}

