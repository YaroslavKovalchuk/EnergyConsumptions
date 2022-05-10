package com.kovalchuk.EnergyConsumptions.entity.ovens.daub;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.kovalchuk.EnergyConsumptions.entity.ovens.PowerAndGasConsumption;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "daub_power_and_gas_consumption")
public class PowerAndGasConsumptionOfDaub extends PowerAndGasConsumption{
	

}
