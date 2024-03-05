package de.syngenio.demo4;

public interface InfrastructureFactory {
	public abstract Sensor obtainSensor();
	public abstract Actor  obtainActor();
}
