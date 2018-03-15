package controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.UnitConversionModel;
import utility.*;

public class UnitConversionController {
	
	// GUI components
	private ChoiceBox unitTypeChoiceBox;
	private TextField unitValueToConvertTextField;
	private Label unitValueConvertedLabel;
	private ChoiceBox unit1ChoiceBox;
	private ChoiceBox unit2ChoiceBox;
	private Button convertUnitButton;
	
	
	
	private UnitConversionModel model;
	
	
	// data fields
	
	private String unitType;
	private double unitValueToConvert;
	private double unitValueConverted;
	private String unitToConvert;
	private String unitConverted;

	public UnitConversionController(ChoiceBox unitTypeChoiceBox, TextField unitValueToConvertTextField, Label unitValueConvertedLabel, ChoiceBox unit1ChoiceBox,
			ChoiceBox unit2ChoiceBox, Button convertUnitButton) {
		
		this.unitTypeChoiceBox = unitTypeChoiceBox;
		this.unitValueToConvertTextField = unitValueToConvertTextField;
		this.unitValueConvertedLabel = unitValueConvertedLabel;	
		this.unit1ChoiceBox = unit1ChoiceBox;
		this.unit2ChoiceBox = unit2ChoiceBox;
		this.convertUnitButton = convertUnitButton;
		
		initializeUnitType();
		initializeUnit1ChoiceBox();
		initializeUnit2ChoiceBox();

		
		convertUnitButtonActivator();
		
	} 
	
	
	


	public void initializeUnitType() {
		unitTypeChoiceBox.getSelectionModel().select(0);
		unitType = "Length";
	}
	
	public void initializeUnit1ChoiceBox() {
		unit1ChoiceBox.getItems().addAll("METER", "KILOMETER", "INCH", "FEET");
		unit1ChoiceBox.getSelectionModel().select(0);
		unitToConvert = "METER";
	}
	
	public void initializeUnit2ChoiceBox() {
		unit2ChoiceBox.getItems().addAll("METER", "KILOMETER", "INCH", "FEET");
		unit2ChoiceBox.getSelectionModel().select(1);
		unitConverted = "KILOMETER";
	}
	
	public void convertUnitButtonActivator() {
		convertUnitButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				obtainUnit1Value();
				model = new UnitConversionModel(unitType, unitToConvert, unitConverted, unitValueToConvert);
				displayConvertedUnit();
			}
		}));
	}
	
	public void obtainUnit1Value() {
		unitValueToConvert = Double.valueOf(unitValueToConvertTextField.getText()).doubleValue();
	}
	

	public void displayConvertedUnit() {
		String unitValueDislayFormat = Double.toString(model.getUnitValueConverted());
		unitValueConvertedLabel.setText(unitValueDislayFormat);
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
