package model;

import controller.UnitConversionController;

public class UnitConversionModel {
	
	
	private String unitType;
	private double unitValueToConvert;
	private double unitValueConverted;
	private String unitToConvert;
	private String unitConverted;
	
	public UnitConversionModel(String unitType, String unitToConvert, String unitConverted, double unitValueToConvert) {
		
		
		
		this.unitType = unitType;
		this.unitToConvert = unitToConvert;
		this.unitConverted = unitConverted;
		this.unitValueToConvert = unitValueToConvert;
		
		convertUnit();
		
	}
	
	public void convertUnit() {
		switch(unitType) {
			case "Length": 
				convertLengthUnit();
				break;
			case "Mass":
				convertMassUnit();
				break;
			case "Temperature":
				convertTemperatureUnit();
		}
	}
	
	public void convertLengthUnit() {
		switch (unitToConvert) {
			case "METER":
				convertMeter();
				break;
			case "KILOMETER":
				break;
			case "INCH":
				break;
			case "FEET":
				break;
		}
	}
	
	public void convertMassUnit() {
		
	}
	
	public void convertTemperatureUnit() {
		
	}
	
	public void convertMeter() {
		switch (unitConverted) {
			case "METER":
				break;
			case "KILOMETER":
				unitValueConverted = unitValueToConvert / 1000;
				break;
			case "INCH":
				break;
			case "FEET":
				break;
		}
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public double getUnitValueToConvert() {
		return unitValueToConvert;
	}

	public void setUnitValueToConvert(double unitValueToConvert) {
		this.unitValueToConvert = unitValueToConvert;
	}

	public double getUnitValueConverted() {
		return unitValueConverted;
	}

	public void setUnitValueConverted(double unitValueConverted) {
		this.unitValueConverted = unitValueConverted;
	}

	public String getUnitToConvert() {
		return unitToConvert;
	}

	public void setUnitToConvert(String unitToConvert) {
		this.unitToConvert = unitToConvert;
	}

	public String getUnitConverted() {
		return unitConverted;
	}

	public void setUnitConverted(String unitConverted) {
		this.unitConverted = unitConverted;
	}
	
	
	
	
}
