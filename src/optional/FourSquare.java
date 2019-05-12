package optional;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot squareBot = new Robot();

	void go() {
		squareBot.setSpeed(100);
		squareBot.setPenWidth(5);

		// 6. Do steps #7 to #8 four times...

		for (int i = 0; i < 4; i++) {
			squareBot.penDown();
			squareBot.setRandomPenColor();
			drawSquare();
			squareBot.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		for(int i = 0; i < 4; i++) {
			squareBot.move(100);
			squareBot.turn(90);
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
