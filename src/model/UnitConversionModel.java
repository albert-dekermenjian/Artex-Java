package model;

import controller.UnitConversionController;

public class UnitConversionModel {
	
	
	private UnitConversionController controller;
	
	private String unitType;
	private double unit1Value;
	private double unit2Value;
	private String unit1;
	private String unit2;
	
	public UnitConversionModel(UnitConversionController controller) {
		
		this.controller = controller;
		
		this.unitType = controller.getUnitType();
		this.unit1Value = controller.getUnitValueToConvert();
		this.unit2Value = controller.getUnitValueConverted();
		this.unit1 = controller.getUnitToConvert();
		this.unit2 = controller.getUnitConverted();
		
		System.out.println(unit1Value);
		convertUnit();
		
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public double getUnit1Value() {
		return unit1Value;
	}

	public void setUnit1Value(double unit1Value) {
		this.unit1Value = unit1Value;
	}

	public double getUnit2Value() {
		return unit2Value;
	}

	public void setUnit2Value(double unit2Value) {
		this.unit2Value = unit2Value;
	}

	public String getUnit1() {
		return unit1;
	}

	public void setUnit1(String unit1) {
		this.unit1 = unit1;
	}

	public String getUnit2() {
		return unit2;
	}

	public void setUnit2(String unit2) {
		this.unit2 = unit2;
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
		switch (unit1) {
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
		switch (unit2) {
			case "METER":
				break;
			case "KILOMETER":
				unit2Value = unit1Value / 1000;
				System.out.println("hey: " + unit2Value);
				controller.setUnitValueConverted(unit2Value);
				controller.displayConvertedUnit();
				break;
			case "INCH":
				break;
			case "FEET":
				break;
		}
	}
	
}
