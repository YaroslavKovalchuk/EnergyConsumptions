package com.kovalchuk.EnergyConsumptions.dto.daub;

import lombok.Data;

@Data
public class DaubTemperatureValues {
	
	private long id;
	
	private int firstCeilZone;
	
	private int secondCeilZone;
	
	private int thirdCeilZone;
	
	private int firstFloorZone;
	
	private int secondFloorZone;
	
	private int thirdFloorZone;

}
