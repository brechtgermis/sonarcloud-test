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
		if (this.sensor.isMotorBlocked()) {
			this.actor.stopMotor();
		} else {
			int desiredTemperature;
			if (this.sensor.getBrightness() < 10) {
				desiredTemperature = 15;
			} else {
				desiredTemperature = 20;
			}
			this.actor.moveMotor(desiredTemperature - this.sensor.getTemperature());
		}
	}
}
