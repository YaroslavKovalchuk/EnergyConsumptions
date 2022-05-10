package com.kovalchuk.EnergyConsumptions.entity.ovens.hecrone;

import java.util.Date;

import javax.persistence.*;

import com.kovalchuk.EnergyConsumptions.entity.ovens.TunnelOven;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name = "hecrone_tunnel_oven")
public class HecroneTunnelOven extends TunnelOven{
	
	@Setter
	@Getter
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_temperatureValues")
	private HecroneTemperatureValues hecroneTemperatureValues;

}
