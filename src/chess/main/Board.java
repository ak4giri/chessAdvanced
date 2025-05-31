package chess.main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Board {
	public final int ROWS = 8;
	public final int COLS = 8;
	public final static int squareSize = 100;
	public final static int halfSquareSize = squareSize / 2;
	
	public Board () {
		
	}
	
	public void draw(Graphics2D g2) {
		int color = 0;
		
		for(int row = 0; row<ROWS; row ++) {
			for (int col = 0; col < COLS; col++) {
				if (color == 0) {
					g2.setColor(new Color(55, 55, 55));
					color = 1;
				} else {
					g2.setColor(new Color(189, 187, 177));
					color = 0;
				}
				g2.fillRect(col*squareSize, row*squareSize, squareSize, squareSize);
			}
			
			if (color == 0) {
				color = 1;
			} else {
				color = 0;
			}
		}
	}
}
