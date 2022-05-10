package com.kovalchuk.EnergyConsumptions.entity.ovens.daub;

import java.util.Date;

import javax.persistence.*;

import com.kovalchuk.EnergyConsumptions.entity.ovens.TunnelOven;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name = "daub_tunnel_oven")
public class DaubTunnelOven extends TunnelOven{
	
	@Setter
	@Getter
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_temperature_setpoint")
	private DaubTemperaturesSetpoints temperatureSetpoint;
	
	@Setter
	@Getter
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_temperature_sensor")
	private DaubTemperaturesSensors temperatureSensor;
	
}
