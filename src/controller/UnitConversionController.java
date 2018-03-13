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
	
	
	// data fields
	
	private String unitType;
	private double unit1Value;
	private double unit2Value;
	private String unit1;
	private String unit2;

	public UnitConversionController(ChoiceBox unitTypeChoiceBox, TextField unitValueToConvertTextField, Label unitValueConvertedLabel, ChoiceBox unit1ChoiceBox,
			ChoiceBox unit2ChoiceBox, Button convertUnitButton) {
		
		this.unitTypeChoiceBox = unitTypeChoiceBox;
		this.unitValueToConvertTextField = unitValueToConvertTextField;
		this.unitValueConvertedLabel = unitValueConvertedLabel;
		this.unit1ChoiceBox = unit1ChoiceBox;
		this.unit2ChoiceBox = unit2ChoiceBox;
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
				new UnitConversionModel(unitType, unit1Value, unit2Value, unit1, unit2);
			}
		}));
	}
	
	public void getUnit1Value() {
		unit1Value = Double.valueOf(unitValueToConvertTextField.getText()).doubleValue();
	}
	

}
