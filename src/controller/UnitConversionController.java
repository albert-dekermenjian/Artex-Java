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
	private TextField unit1ValueTextField;
	private TextField unit2ValueTextField;
	private ChoiceBox unit1ChoiceBox;
	private ChoiceBox unit2ChoiceBox;
	private Label equalLabel;
	private Button convertUnitButton;
	
	
	// data fields
	
	private String unitType;
	private double unit1Value;
	private double unit2Value;
	private String unit1;
	private String unit2;

	public UnitConversionController(ChoiceBox unitTypeChoiceBox, TextField unit1ValueTextField, TextField unit2ValueTextField, ChoiceBox unit1ChoiceBox,
			ChoiceBox unit2ChoiceBox, Label equalLabel, Button convertUnitButton) {
		
		this.unitTypeChoiceBox = unitTypeChoiceBox;
		this.unit1ValueTextField = unit1ValueTextField;
		this.unit2ValueTextField = unit2ValueTextField;
		this.unit1ChoiceBox = unit1ChoiceBox;
		this.unit2ChoiceBox = unit2ChoiceBox;
		this.equalLabel = equalLabel;
		this.convertUnitButton = convertUnitButton;
		
		setUnitType();
		setUnit1ChoiceBox();
		setUnit2ChoiceBox();

		
		convertUnitButtonActivator();
	} 
	

	public void setUnitType() {
	//	unitType.getSelectionModel().selectedIndexProperty();
		unitTypeChoiceBox.getSelectionModel().select(0);
		unitType = "Length";
	}
	
	public void setUnit1ChoiceBox() {
		unit1ChoiceBox.getItems().addAll("METER", "KILOMETER", "INCH", "FEET");
		unit1ChoiceBox.getSelectionModel().select(0);
		unit1 = "METER";
	}
	
	public void setUnit2ChoiceBox() {
		unit2ChoiceBox.getItems().addAll("METER", "KILOMETER", "INCH", "FEET");
		unit2ChoiceBox.getSelectionModel().select(1);
		unit2 = "KILOMETER";
	}
	
	public void convertUnitButtonActivator() {
		convertUnitButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				getUnit1Value();
				getUnit2Value();
				new UnitConversionModel(unitType, unit1Value, unit2Value, unit1, unit2);
			}
		}));
	}
	
	public void getUnit1Value() {
		unit1Value = Double.valueOf(unit1ValueTextField.getText()).doubleValue();
	}
	
	public void getUnit2Value() {
		unit2Value = Double.valueOf(unit2ValueTextField.getText()).doubleValue();
	}
}
