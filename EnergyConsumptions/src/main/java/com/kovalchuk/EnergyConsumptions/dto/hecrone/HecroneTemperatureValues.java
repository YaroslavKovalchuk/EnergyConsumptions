package com.kovalchuk.EnergyConsumptions.dto.hecrone;

import lombok.Data;

@Data
public class HecroneTemperatureValues {
	
	private long id;
	
	private int burnerSetpoint;
	
	private int burnerSensor;
	
	private int firstZoneSensor;
	
	private int secondZoneSensor;
	
	private int thirdZoneSensor;
	

}
