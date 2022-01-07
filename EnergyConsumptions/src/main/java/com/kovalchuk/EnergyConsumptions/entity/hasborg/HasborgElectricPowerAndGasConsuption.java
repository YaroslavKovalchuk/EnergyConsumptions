package com.kovalchuk.EnergyConsumptions.entity.hasborg;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="hasborg_electric_power_and_gas_consuption")
public class HasborgElectricPowerAndGasConsuption {
	
	@Id
	private Long id;
	
	private Date dateTime;
	
	private Float temporaryGasConsumption;
	
	private Float temporaryElectricalPowerConsumption;
	
	private Double GasConsumptionInCurrentYear;
	
	private Double ElectricalPowerConsuptionInCurrentYear;


}
