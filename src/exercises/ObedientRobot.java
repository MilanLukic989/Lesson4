package exercises;
/*
 * Create methods to draw a circle, square and triangle and call the appropriate
 * one depending on the user choice.
 */

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	Robot robot = new Robot();

	public void shapes(int shape) {
		if (shape == 0) {
			drawCircle();
		} else if (shape == 1) {
			drawSqare();
		} else if (shape == 2) {
			drawTriangle();
		}
	}

	void drawCircle() {
		robot.penDown();
		robot.setPenWidth(5);
		robot.setRandomPenColor();
		robot.setSpeed(50);
		for (int i = 0; i < 360; i++) {
			robot.turn(1);
			robot.move(3);
			
		}
		robot.hide();
	}

	void drawSqare() {
		robot.penDown();
		robot.setPenWidth(5);
		robot.setRandomPenColor();
		robot.setSpeed(3);
		for (int i = 0; i < 4; i++) {
			robot.move(250);
			robot.turn(90);
		}
		robot.hide();
	}

	void drawTriangle() {
		robot.penDown();
		robot.setPenWidth(5);
		robot.setRandomPenColor();
		robot.setSpeed(3);
		for (int i = 0; i < 3; i++) {
			robot.move(250);
			robot.turn(120);
		}
		robot.hide();
	}

	public static void main(String[] args) {
		int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
		ObedientRobot obedientRobot = new ObedientRobot();
		obedientRobot.shapes(shape);
//		new ObedientRobot().shapes(shape);
		
	}

}
