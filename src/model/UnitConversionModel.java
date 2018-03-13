package model;

public class UnitConversionModel {
	
	private String unitType;
	private double unit1Value;
	private double unit2Value;
	private String unit1;
	private String unit2;
	
	public UnitConversionModel(String unitType, double unit1Value, double unit2Value, String unit1, String unit2) {
		
		this.unitType = unitType;
		this.unit1Value = unit1Value;
		this.unit2Value = unit2Value;
		this.unit1 = unit1;
		this.unit2 = unit2;
		
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
	
}
