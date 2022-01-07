package com.kovalchuk.EnergyConsumptions.entity.daub;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "daub_power_and_gas_consuption")
public class DaubElectricPowerAndGasConsuption {
	
	@Id
	private Long id;
	
	private Date dateTime;
	
	private Float temporaryGasConsumption;
	
	private Float temporaryElectricalPowerConsumption;
	
	private Double GasConsumptionInCurrentYear;
	
	private Double ElectricalPowerConsuptionInCurrentYear;

}
