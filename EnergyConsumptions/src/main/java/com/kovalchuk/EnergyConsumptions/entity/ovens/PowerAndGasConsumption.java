package com.kovalchuk.EnergyConsumptions.entity.ovens;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class PowerAndGasConsumption {
	
	@Setter
	@Getter
	@Id
	private Long id;
	
	@Setter
	@Getter
	private Date dateTime;
	
	@Setter
	@Getter
	private Double GasConsumptionInCurrentYear;
	
	@Setter
	@Getter
	private Double PowerConsumptionInCurrentYear;

}
