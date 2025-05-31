package chess.pieces;

import chess.main.GamePanel;
import chess.main.Type;

public class Knight extends Piece {
	
	//CONSTRUCTOR
	public Knight (int color, int col, int row) {
		super(color, col, row);
		
		type = Type.KNIGHT;
		
		if (color == GamePanel.WHITE) {
			image = getImage("/piece/white-knight");
		} else {
			image = getImage("/piece/black-knight");
		}
	}
	
    public boolean canMove(int targetCol, int targetRow) {
        // Knight can only move if it's movement ratio of col and row is 1:2 or 2:1
        if (Math.abs(targetCol - preCol) * Math.abs(targetRow - preRow) == 2) {
            if (isValidSquare(targetCol, targetRow)) {
                return true;
            }
        }

        return false;
    }


	
	
}
