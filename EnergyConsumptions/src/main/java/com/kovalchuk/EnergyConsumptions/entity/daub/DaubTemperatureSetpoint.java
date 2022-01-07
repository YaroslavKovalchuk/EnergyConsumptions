package com.kovalchuk.EnergyConsumptions.entity.daub;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "daub_temperature_setpoint")
public class DaubTemperatureSetpoint {
	
	@Id
	private Long id;
	
	private Integer firstCeilZone;
	
	private Integer secondCeilZone;
	
	private Integer thirdCeilZone;
	
	private Integer firstFloorZone;
	
	private Integer secondFloorZone;
	
	private Integer thirdFloorZone;

}
