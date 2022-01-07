package com.kovalchuk.EnergyConsumptions.dto.daub;

import java.util.Date;

import com.kovalchuk.EnergyConsumptions.dto.ElectricPowerAndGasConsuption;

import lombok.Data;


@Data
public class DaubTunnelOven {
	
	private Long id;
	
	private boolean connectionValid;
	
	private Date dateTime;
	
	private float transporterSpeed;
	
	private DaubTemperatureValues temperatureSetpoint;
	
	private DaubTemperatureValues temperatureSensor;
	
	private ElectricPowerAndGasConsuption electricPowerAndGasConsuption;

}
