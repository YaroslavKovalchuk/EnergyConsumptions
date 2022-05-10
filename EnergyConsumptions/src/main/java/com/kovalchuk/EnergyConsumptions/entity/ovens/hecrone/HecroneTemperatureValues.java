package com.kovalchuk.EnergyConsumptions.entity.ovens.hecrone;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name="hecrone_temperature_values")
public class HecroneTemperatureValues {
	
	@Setter
	@Getter
	@Id
	private Long id;
	
	@Setter
	@Getter
	private Integer burnerSetpoint;
	
	@Setter
	@Getter
	private Integer burnerSensor;
	
	@Setter
	@Getter
	private Integer firstZoneSensor;
	
	@Setter
	@Getter
	private Integer secondZoneSensor;
	
	@Setter
	@Getter
	private Integer thirdZoneSensor;

}
