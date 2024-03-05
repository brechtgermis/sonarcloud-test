// constructor mocking
package de.syngenio.demo6b;

public class Controller {
	
	private Sensor sensor;
	private Actor  actor;
	
	
	public Controller() {
		sensor = new Sensor();
		actor = new Actor();
	}
	
	public void singleDecision() {
		if (_ensor.isMotorBlocked()) {
			actor.stopMotor();
		} else {
			int desiredTemperature;
			if (sensor.getBrightness() < 10) {
				desiredTemperature = 15;
			} else {
				desiredTemperature = 20;
			}
			actor.moveMotor(desiredTemperature - sensor.getTemperature());
		}
	}
}
