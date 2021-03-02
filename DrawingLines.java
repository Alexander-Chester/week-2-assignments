package week2;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;

public class DrawingLines extends GraphicsProgram {
	public void run() {
	addMouseListeners();
	}
	//* creates line and sets the first end of the line when user presses the mouse at a location*/
	public void mousePressed(MouseEvent e) {
		double xposition = e.getX();
		double yposition = e.getY();
		line = new GLine(xposition,yposition,xposition,yposition);
		add(line);
		}
	public void mouseDragged(MouseEvent e) {
		double xposition = e.getX();
		double yposition = e.getY();
		line.setEndPoint(xposition, yposition);
	}
	

	private GLine line;
}
