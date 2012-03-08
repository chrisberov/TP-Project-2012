package Game;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Character {

	int x, y, dx;
	Image tank;

	public Character() {
		ImageIcon i = new ImageIcon("D:/tank.png");
		tank = i.getImage();
		x = 10;
		y = 395;
	}
	
	public void move() {
		x = x + dx;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Image getImage() {
		return tank;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT)
			dx = -1;
		
		if(key == KeyEvent.VK_RIGHT)
			dx = 1;
		
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT)
			dx = 0;
		
		if(key == KeyEvent.VK_RIGHT)
			dx = 0;
		
	}
}

