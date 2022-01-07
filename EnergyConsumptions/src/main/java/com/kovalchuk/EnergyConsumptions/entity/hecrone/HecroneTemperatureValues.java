package com.kovalchuk.EnergyConsumptions.entity.hecrone;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="hecrone_temperature_values")
public class HecroneTemperatureValues {
	
	@Id
	private Long id;
	
	private Integer burnerSetpoint;
	
	private Integer burnerSensor;
	
	private Integer firstZoneSensor;
	
	private Integer secondZoneSensor;
	
	private Integer thirdZoneSensor;

}
