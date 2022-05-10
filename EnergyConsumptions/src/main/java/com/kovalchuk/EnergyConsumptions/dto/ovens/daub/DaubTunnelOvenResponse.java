package com.kovalchuk.EnergyConsumptions.dto.ovens.daub;

import com.kovalchuk.EnergyConsumptions.dto.ovens.TunnelOven;
import com.kovalchuk.EnergyConsumptions.entity.ovens.daub.DaubTunnelOven;

import lombok.Getter;
import lombok.Setter;

public class DaubTunnelOvenResponse extends TunnelOven {
	
	@Setter
	@Getter
	private DaubTemperaturesResponse temperaturesSetpoints;
	
	@Setter
	@Getter
	private DaubTemperaturesResponse temperaturesSensors;
	
	public DaubTunnelOvenResponse(DaubTunnelOven dto) {
		
		this.setId(dto.getId());
		
		this.setConnectionIsInvalid(dto.getConnectionIsInvalid());
		
		this.setDateTime(dto.getDateTime());
		
		this.setTransporterSpeed(dto.getTransporterSpeed());
		
		this.setTemperaturesSensors(new DaubTemperaturesResponse(dto.getTemperatureSensor()));
		
		this.setTemperaturesSetpoints(new DaubTemperaturesResponse(dto.getTemperatureSetpoint()));
		
		
	}
	

}
