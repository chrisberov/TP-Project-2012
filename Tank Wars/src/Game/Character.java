package Game;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Character {
	Board b;
	int x, y, dx;
	Image tankleft1, tankright1;

	public Character() {
		ImageIcon iright1 = new ImageIcon("D:/tank.png");
		ImageIcon ileft1  = new ImageIcon("D:/tank11.png");
		tankright1 = iright1.getImage();
		tankleft1  = ileft1 .getImage();
		x = 40;
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
		
		
		if(dx == 1)
			 return tankright1;
		else if (dx == -1)
			 return tankleft1;
		else return tankright1;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_LEFT) {
			if(x>40)
				dx = -1;
			if(x<=40)
				dx = 0;
		}
		
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

