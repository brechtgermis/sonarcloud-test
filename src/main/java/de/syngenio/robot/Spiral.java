package de.syngenio.robot;

public class Spiral {

	private Robot robot;

	public Spiral(Robot robot) {
		this.robot = robot;
	}
	
	public void walkSpiral() {
		robot.move(1);
		robot.turnleft(90);
		robot.move(1);
		robot.turnleft(90);

		robot.move(2);
		robot.turnleft(90);
		robot.move(2);
		robot.turnleft(90);

		robot.move(3);
		robot.turnleft(90);
		robot.move(3);
		robot.turnleft(90);

		robot.move(4);
		robot.turnleft(90);
		robot.move(4);
		robot.turnleft(90);

		robot.move(5);
		robot.turnleft(90);
		robot.move(5);
		robot.turnleft(90);
	}
}
