package com.kovalchuk.EnergyConsumptions.dto.hecrone;

import java.util.Date;

import com.kovalchuk.EnergyConsumptions.dto.ElectricPowerAndGasConsuption;

import lombok.Data;

@Data
public class HecroneTunnelOven {
	
	private Long id;
	
	private boolean connectionValid;
	
	private Date dateTime;
	
	private float transporterSpeed;
	
	private HecroneTemperatureValues hecroneTemperatureValues;
	
	private ElectricPowerAndGasConsuption electricPowerAndGasConsuption;

}
