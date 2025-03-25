// basic mocking
package de.syngenio.demo2;

public class Controller {
	
	private Sensor sensor;
	private Actor actor;
	
	public Controller(Sensor sensor, Actor actor) {
		_sensor = sensor;
		_actor = actor;
		
	}
	
	public void singleDecision() {
		if (_sensor.isMotorBlocked()) {
			_actor.stopMotor();
		} else {
			int desiredTemperature;
			if (_sensor.getBrightness() < 10) {
				desiredTemperature = 15;
			} else {
				desiredTemperature = 20;
			}
			_actor.moveMotor(desiredTemperature - _sensor.getTemperature());
		}
	}
}
