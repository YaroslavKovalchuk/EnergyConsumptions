package com.kovalchuk.EnergyConsumptions.dto.ovens.daub;

import lombok.Getter;
import lombok.Setter;

import com.kovalchuk.EnergyConsumptions.entity.ovens.daub.DaubTemperatures;

public class DaubTemperaturesResponse {
	
	@Setter
	@Getter
	private long id;
	
	@Setter
	@Getter
	private int firstCeilZone;
	
	@Setter
	@Getter
	private int secondCeilZone;
	
	@Setter
	@Getter
	private int thirdCeilZone;
	
	@Setter
	@Getter
	private int firstFloorZone;
	
	@Setter
	@Getter
	private int secondFloorZone;
	
	@Setter
	@Getter
	private int thirdFloorZone;
	
	public DaubTemperaturesResponse(DaubTemperatures daubTemps) {
		
		this.setId(daubTemps.getId());
		this.setFirstCeilZone(daubTemps.getFirstCeilZone());
		this.setFirstFloorZone(daubTemps.getFirstFloorZone());
		this.setSecondCeilZone(daubTemps.getSecondCeilZone());
		this.setSecondFloorZone(daubTemps.getSecondFloorZone());
		this.setThirdCeilZone(daubTemps.getThirdCeilZone());
		this.setThirdFloorZone(daubTemps.getThirdFloorZone());
	}

}
