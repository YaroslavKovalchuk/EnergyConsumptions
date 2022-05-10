package com.kovalchuk.EnergyConsumptions.entity.ovens.hasborg;

import javax.persistence.*;

import com.kovalchuk.EnergyConsumptions.entity.ovens.PowerAndGasConsumption;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name="hasborg_power_and_gas_consumption")
public class PowerAndGasConsumptionOfHasborg extends PowerAndGasConsumption{


}
