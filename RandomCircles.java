package week2;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.util.*;

public class RandomCircles extends GraphicsProgram {
	
	/** constant for number of circles*/
	private static final int CIRCLES_DRAWN = 10;
	/** constant for minimum radius*/
	private static final int SMALLEST_CIRCLE = 5;
	/**contant for maximum radius*/
	private static final int LARGEST_CIRCLE = 50;
	
	public void run() {
		for (int i = 0; i < CIRCLES_DRAWN; i++) {
			//*generates circle of random radius for each iteration of loop*/
			double radius = randgen.nextDouble(SMALLEST_CIRCLE, LARGEST_CIRCLE);
			//*places top left corner of bounding box of circle at random position on x axis between left most pixel and right most pixel that allows space for circle 
			double xaxis = randgen.nextDouble(0,getWidth()-2*radius);
			//*likewise as x axis local variable but for y axis*/
			double yaxis = randgen.nextDouble(0,getHeight()-2*radius);
			//*now we are creating the circle for each iteration of the loop, 2*radius is the height of the bounding box*/
			GOval Circle = new GOval(xaxis, yaxis, 2*radius,2*radius);
			Circle.setFilled(true);
			Circle.setFillColor(randgen.nextColor());
			add(Circle);
		}
	}
	/**private ivars*/
	private RandomGenerator randgen = RandomGenerator.getInstance();
	}



