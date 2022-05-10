package com.kovalchuk.EnergyConsumptions.dto.ovens.hecrone;

import com.kovalchuk.EnergyConsumptions.dto.ovens.TunnelOven;
import com.kovalchuk.EnergyConsumptions.entity.ovens.hecrone.HecroneTunnelOven;

import lombok.Getter;
import lombok.Setter;


public class HecroneTunnelOvenResponse extends TunnelOven{
	
	@Setter
	@Getter
	private HecroneTemperatureValuesResponse hecroneTemperatureValues;
	
	public HecroneTunnelOvenResponse(HecroneTunnelOven hto) {
		this.setId(hto.getId());
		this.setConnectionIsInvalid(hto.getConnectionIsInvalid());
		this.setDateTime(hto.getDateTime());
		this.setTransporterSpeed(hto.getTransporterSpeed());
		this.setHecroneTemperatureValues(new HecroneTemperatureValuesResponse(hto.getHecroneTemperatureValues()));
	}

}
