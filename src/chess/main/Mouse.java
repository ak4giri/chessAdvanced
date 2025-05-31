package chess.main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter {
	
	public int x, y;
	public boolean isPressed = false;
	
	@Override
	public void mousePressed(MouseEvent e) {
		isPressed = true; //WORKS
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		isPressed = false;   //WORKS
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}
	
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}
}
