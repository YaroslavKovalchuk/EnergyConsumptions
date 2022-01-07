package com.kovalchuk.EnergyConsumptions.entity.hecrone;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="hecrone_electric_power_and_gas_consuption")
public class HecroneElectricPowerAndGasConsuption {
	
	@Id
	private Long id;
	
	private Date dateTime;
	
	private Float temporaryGasConsumption;
	
	private Float temporaryElectricalPowerConsumption;
	
	private Double GasConsumptionInCurrentYear;
	
	private Double ElectricalPowerConsuptionInCurrentYear;


}
