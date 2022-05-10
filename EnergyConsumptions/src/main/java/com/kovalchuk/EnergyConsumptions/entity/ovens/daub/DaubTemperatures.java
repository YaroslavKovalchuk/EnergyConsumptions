package com.kovalchuk.EnergyConsumptions.entity.ovens.daub;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class DaubTemperatures {
	
	@Setter
	@Getter
	@Id
	private Long id;
	
	@Setter
	@Getter
	private Integer firstCeilZone;
	
	@Setter
	@Getter
	private Integer secondCeilZone;
	
	@Setter
	@Getter
	private Integer thirdCeilZone;
	
	@Setter
	@Getter
	private Integer firstFloorZone;
	
	@Setter
	@Getter
	private Integer secondFloorZone;
	
	@Setter
	@Getter
	private Integer thirdFloorZone;
	

}
