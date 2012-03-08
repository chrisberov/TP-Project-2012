package Game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {
	Character ch;
	Image img;
	Timer time;
	public Board() {
		ch = new Character();
		addKeyListener(new AL());
		setFocusable(true);
		ImageIcon i = new ImageIcon("D:/background2.jpg");
		img = i.getImage();
		time = new Timer(5, this);
		time.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		ch.move();
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(img, 0, 0, null);
		g2d.drawImage(ch.getImage(), ch.getX(), ch.getY(), null);
	}
	
	private class AL extends KeyAdapter {
		public void keyReleased(KeyEvent e) {
			ch.keyReleased(e);
		}
		
		public void keyPressed(KeyEvent e) {
			ch.keyPressed(e);
		}
	}
}
