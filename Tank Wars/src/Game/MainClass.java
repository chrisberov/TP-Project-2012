package Game;

import javax.swing.JFrame;

public class MainClass {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tank Wars");
		frame.add(new Board());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024,590);
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
