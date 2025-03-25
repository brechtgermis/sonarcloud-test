package de.syngenio.demo2;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestController {

	private Actor actor;
	private Sensor sensor;
	private Controller controller;

	@BeforeEach
	public void setUp() throws Exception {
		actor = mock(Actor.class);
		sensor = mock(Sensor.class);
		controller = new Controller(sensor, actor);
	}

	@Test
	public void assureThatMotorIsStoppedWhenBlocked() {
		when(sensor.isMotorBlocked()).thenReturn(true);

		controller.singleDecision();

		verify(actor).stopMotor();
		verify(actor,times(0)).moveMotor(anyInt());
	}

	@Test
	public void assureThatMotorIsMovedCorrectly() {
		when(sensor.isMotorBlocked()).thenReturn(false);
		// 1. bright, too warm
		when(sensor.getBrightness()).thenReturn(15);
		doReturn(30).when(sensor).getTemperature();
		controller.singleDecision();
		verify(actor).moveMotor(-10);

		// 2. bright, too cold
		when(sensor.getBrightness()).thenReturn(15);
		when(sensor.getTemperature()).thenReturn(15);
		controller.singleDecision();
		verify(actor).moveMotor(5);

		// ...

	}

}
