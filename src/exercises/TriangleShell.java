package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Instantiate a new Robot
	Robot triangleBot = new Robot("mini");

	void go() {
		triangleBot.setSpeed(10);
		int length = 50;

		for (int i = 0; i < 60; i++) {
			triangleBot.setRandomPenColor();
			length += 10;
			drawTriangle(length);
			triangleBot.turn(6);
		}

	}

	private void drawTriangle(int length) {
		triangleBot.penDown();
		for (int i = 0; i < 3; i++) {
			triangleBot.move(length);
			triangleBot.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
