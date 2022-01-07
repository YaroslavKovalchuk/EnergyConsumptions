package com.kovalchuk.EnergyConsumptions.entity.hasborg;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="hasborg_tunnel_oven")
public class HasborgTunnelOven {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Date dateTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_electric_power_and_gas_consuption")
	private HasborgElectricPowerAndGasConsuption electricPowerAndGasConsuption;

}
