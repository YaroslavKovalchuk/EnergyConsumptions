package com.kovalchuk.EnergyConsumptions.entity.ovens;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public abstract class TunnelOven {
	
	@Setter
	@Getter
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Setter
	@Getter
	private Boolean connectionIsInvalid;
	
	@Setter
	@Getter
	private Date dateTime;
	
	@Setter
	@Getter
	private Float transporterSpeed;

}
