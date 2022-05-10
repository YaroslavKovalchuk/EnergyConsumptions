package com.kovalchuk.EnergyConsumptions.dto.ovens.hecrone;

import com.kovalchuk.EnergyConsumptions.entity.ovens.hecrone.HecroneTemperatureValues;

import lombok.Getter;
import lombok.Setter;

public class HecroneTemperatureValuesResponse {
	
	@Setter
	@Getter
	private long id;
	
	@Setter
	@Getter
	private int burnerSetpoint;
	
	@Setter
	@Getter
	private int burnerSensor;
	
	@Setter
	@Getter
	private int firstZoneSensor;
	
	@Setter
	@Getter
	private int secondZoneSensor;
	
	@Setter
	@Getter
	private int thirdZoneSensor;
	
	public HecroneTemperatureValuesResponse(HecroneTemperatureValues hectv) {
		this.setId(hectv.getId());
		this.setBurnerSensor(hectv.getBurnerSensor());
		this.setBurnerSetpoint(hectv.getBurnerSetpoint());
		this.setFirstZoneSensor(hectv.getFirstZoneSensor());
		this.setSecondZoneSensor(hectv.getSecondZoneSensor());
		this.setThirdZoneSensor(hectv.getThirdZoneSensor());
		
	}

}
