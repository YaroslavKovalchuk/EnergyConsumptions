package com.kovalchuk.EnergyConsumptions.entity.ovens.daub;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "daub_temperature_sensor")
public class DaubTemperaturesSensors extends DaubTemperatures{

}

