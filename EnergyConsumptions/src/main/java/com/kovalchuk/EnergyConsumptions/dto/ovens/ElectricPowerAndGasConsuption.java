package com.kovalchuk.EnergyConsumptions.dto.ovens;

import java.util.Date;

import lombok.Data;

@Data
public class ElectricPowerAndGasConsuption {
	
	private long id;
	
	private Date dateTime;
	
	private float temporaryGasConsumption;
	
	private float temporaryElectricalPowerConsumption;
	
	private double GasConsumptionInCurrentYear;
	
	private double ElectricalPowerConsuptionInCurrentYear;

}
