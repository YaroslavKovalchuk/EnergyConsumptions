package com.kovalchuk.EnergyConsumptions.entity.daub;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "daub_tunnel_oven")
public class DaubTunnelOven {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Boolean connectionValid;
	
	private Date dateTime;
	
	private Float transporterSpeed;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_temperature_setpoint")
	private DaubTemperatureSetpoint temperatureSetpoint;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_temperature_sensor")
	private DaubTemperatureSensor temperatureSensor;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_electric_power_an_gas_consuption")
	private DaubElectricPowerAndGasConsuption electricPowerAndGasConsuption;
	
}
