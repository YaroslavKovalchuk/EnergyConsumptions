package com.kovalchuk.EnergyConsumptions.dto.ovens;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class TunnelOven {
	
	@Setter
	@Getter
	private Long id;
	
	@Setter
	@Getter
	private boolean connectionIsInvalid;
	
	@Setter
	@Getter
	private Date dateTime;
	
	@Setter
	@Getter
	private float transporterSpeed;

}
