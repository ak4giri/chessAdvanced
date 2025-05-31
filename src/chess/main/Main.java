package chess.main;
import chess.main.Mouse;
import java.awt.Component;

import javax.swing.JFrame;

public class Main extends JFrame {
	public static void main (String [] args) {
		JFrame window = new JFrame();
		GamePanel gamePanel = new GamePanel();
		Mouse mouse = new Mouse();
		
		
		window.setTitle("Chess");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.add(gamePanel);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		
		 gamePanel.launchGame();
	}
	
	  
}
