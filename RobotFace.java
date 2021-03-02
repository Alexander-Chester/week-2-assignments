package week2;

import acm.program.*;

import acm.graphics.*;

import java.awt.Color;
import java.awt.color.*;

public class RobotFace extends GraphicsProgram {
	
	public static final double HEAD_WIDTH = 300;
	public static final double HEAD_HEIGHT = 450;
	public static final double EYE_DIAMETER = 50;
	public static final double MOUTH_HEIGHT = 60;
	public static final double MOUTH_WIDTH = 200;

	public void run() {
		putHead();
		putLeftEye();
		putRightEye();
		putMouth();

}
	private void putHead(){
		double HeadXLocation = ((getWidth()- HEAD_WIDTH)/2);
		double HeadYLocation = ((getHeight() - HEAD_HEIGHT)/2);		
		GRect Head = new GRect(HEAD_WIDTH,HEAD_HEIGHT);
		Head.setFilled(true);
		Head.setFillColor(Color.GRAY);
		add(Head,HeadXLocation,HeadYLocation);
	}
	private void putLeftEye() {
		double EyeXLocation = (((getWidth()/4)+HEAD_WIDTH/2)-(EYE_DIAMETER));
		double EyeYLocation = ((getHeight()/4)-(EYE_DIAMETER)/2);
		GOval LeftEye = new GOval(EYE_DIAMETER, EYE_DIAMETER);
		LeftEye.setColor(Color.YELLOW);
		LeftEye.setFilled(true);
		add(LeftEye,EyeXLocation,EyeYLocation);
	}
	private void putRightEye() {
		double EyeXLocation = (((getWidth()/4 + HEAD_WIDTH)-3*EYE_DIAMETER/2));
		double EyeYLocation = ((getHeight()/4)-(EYE_DIAMETER)/2);
		GOval RightEye = new GOval(EYE_DIAMETER, EYE_DIAMETER);
		RightEye.setColor(Color.YELLOW);
		RightEye.setFilled(true);
		add(RightEye,EyeXLocation,EyeYLocation);
	}
	private void putMouth() {
		double MouthXLocation = getWidth()/2- MOUTH_WIDTH/2;
		double MouthYLocation = getHeight()-getHeight()/4-MOUTH_HEIGHT/2;
		GRect Mouth = new GRect(MOUTH_WIDTH, MOUTH_HEIGHT);
		Mouth.setFilled(true);
		Mouth.setColor(Color.WHITE);
		add(Mouth, MouthXLocation,MouthYLocation);
	}
}