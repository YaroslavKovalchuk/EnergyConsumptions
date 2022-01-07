package com.kovalchuk.EnergyConsumptions.entity.daub;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "daub_temperature_sensor")
public class DaubTemperatureSensor {
	
	@Id
	private Long id;
	
	private Integer firstCeilZone;
	
	private Integer secondCeilZone;
	
	private Integer thirdCeilZone;
	
	private Integer firstFloorZone;
	
	private Integer secondFloorZone;
	
	private Integer thirdFloorZone;

}

