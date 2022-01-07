package com.kovalchuk.EnergyConsumptions.entity.hecrone;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "hecrone_tunnel_oven")
public class HecroneTunnelOven {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Boolean connectionValid;
	
	private Date dateTime;
	
	private Float transporterSpeed;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_temperatureValues")
	private HecroneTemperatureValues hecroneTemperatureValues;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_electric_power_and_gas_consuption")
	private HecroneElectricPowerAndGasConsuption electricPowerAndGasConsuption;

}
