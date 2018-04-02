package controller;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class TimeZonesConversionController {

	// GUI components
	private ChoiceBox cityToConvertChoiceBox;
	private Label cityTimeToConvertLabel;
	private ChoiceBox cityConvertedChoiceBox;
	private Label cityTimeConvertedLabel;
	private Button findTimeButton;
	
	

	
	
	public TimeZonesConversionController(ChoiceBox cityToConvertChoiceBox, Label cityTimeToConvertLabel, ChoiceBox cityConvertedChoiceBox,
			Label cityTimeConvertedLabel, Button findTimeButton) {
		super();
		this.cityToConvertChoiceBox = cityToConvertChoiceBox;
		this.cityTimeToConvertLabel = cityTimeToConvertLabel;
		this.cityConvertedChoiceBox = cityConvertedChoiceBox;
		this.cityTimeConvertedLabel = cityTimeConvertedLabel;
		this.findTimeButton = findTimeButton;
		
		initializeCityToConvert();
		initializeCityConverted();
	}
	
	
	public void initializeCityToConvert() {
		cityToConvertChoiceBox.getSelectionModel().select(0);
		cityTimeToConvertLabel.setText("Yerevan");
	}
	
	public void initializeCityConverted() {
		cityConvertedChoiceBox.getSelectionModel().select(1);
		cityTimeConvertedLabel.setText("Montreal");
	}
	
	public void findTimeButtonActivator() {
		findTimeButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				
			}
		}));
	}
	
	
	
	
}
