package chess.pieces;

import chess.main.GamePanel;
import chess.main.Type;

public class King extends Piece {
	
	//CONSTRUCTOR
	public King (int color, int col, int row) {
		super(color, col, row);

		type = Type.KING;
		
		if (color == GamePanel.WHITE) {
			image = getImage("/piece/white-king");
		} else {
			image = getImage("/piece/black-king");
		}
	}
	
	
	public boolean canMove(int targetCol, int targetRow) {
		boolean statement = true;
		if (isWithinBoard(targetCol, targetRow)) {
			
			if (Math.abs(targetCol - preCol) + Math.abs(targetRow - preRow) == 1
                    || Math.abs(targetCol - preCol) * Math.abs(targetRow - preRow) == 1) {
				statement = true;
			} else {
				statement = false;
			}
		} else {
			statement = false; 
		}
		
		
		return statement;
		
	}
	
	
	

}

