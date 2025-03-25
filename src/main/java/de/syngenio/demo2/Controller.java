// basic mocking
package de.syngenio.demo2;

public class Controller {
	
	private Sensor sensor;
	private Actor actor;
	
	public Controller(Sensor sensor, Actor actor) {
		this.sensor = sensor;
		this.actor = actor;
		
	}
	
	public void singleDecision() {
		if (sensor.isMotorBlocked()) {
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
