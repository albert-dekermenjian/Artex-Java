package view;

import controller.TimeZonesConversionController;
import controller.UnitConversionController;
import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.*;

public class MainWindow extends Application {
	
    private MenuBar menuBar;
    private TabPane tabPane;
    private Tab unitConversionTab;
    private Tab timeZonesConverterTab;
    private BorderPane borderPane;
	
	@Override
	public void start (Stage stage) {
		

		
		setBorderPaneTopPosition();
		
		setBorderPaneCenterPosition();

		setUnitConversionTabContent();
		
		setTimeZonesConverterTab();
		
		setBorderPaneLayout();

		Scene scene = new Scene(borderPane, 400, 350);
		
		
		
		stage.setTitle("ArtexJava");
		stage.setScene(scene);
		stage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	
    public void setBorderPaneTopPosition() {
		
	    // BorderPane top position
		
	    this.menuBar = new MenuBar();
	    Menu menuFile = new Menu("File");
	    Menu menuEdit = new Menu("Edit");
	    Menu menuHelp = new Menu("Help");
		
	    this.menuBar.getMenus().addAll(menuFile, menuEdit, menuHelp);

    }
	
	
	
    public void setBorderPaneCenterPosition() {
		
		this.tabPane = new TabPane();
		this.unitConversionTab = new Tab();
		this.unitConversionTab.setText("Unit Conversion");
		Tab webDataApplicationTab = new Tab();
		webDataApplicationTab.setText("Web data importer");
		this.timeZonesConverterTab = new Tab();
		this.timeZonesConverterTab.setText("Time zones");
		this.tabPane.getTabs().addAll(unitConversionTab, webDataApplicationTab, timeZonesConverterTab);
		this.tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

    }
    
    
    public void setUnitConversionTabContent() {
    	GridPane unitConversionContent = new GridPane();
    	
		ChoiceBox unitType = new ChoiceBox();
		TextField unitValueToConvertTextField = new TextField();
		Label unitValueConvertedLabel = new Label();
		ChoiceBox unit1ChoiceBox = new ChoiceBox();
		ChoiceBox unit2ChoiceBox = new ChoiceBox();
		Label equalLabel = new Label(" = ");
		Button convertUnitButton = new Button("Convert Unit");
		
		unitType.getItems().addAll("Length", "Mass", "Temperature");
		
		
		unitConversionContent.setConstraints(unitType, 0, 0, 3, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
		unitConversionContent.setConstraints(unitValueToConvertTextField, 0, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
		unitConversionContent.setConstraints(equalLabel, 1, 1);
		unitConversionContent.setConstraints(unitValueConvertedLabel, 2, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
		unitConversionContent.setConstraints(unit1ChoiceBox, 0, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
		unitConversionContent.setConstraints(unit2ChoiceBox, 2, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
		unitConversionContent.setConstraints(convertUnitButton, 1, 3, 3, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
		
		unitConversionContent.getChildren().addAll(unitType, unitValueToConvertTextField, equalLabel, unitValueConvertedLabel, unit1ChoiceBox, unit2ChoiceBox, convertUnitButton);
		
		this.unitConversionTab.setContent(unitConversionContent);
		
		new UnitConversionController(unitType, unitValueToConvertTextField, unitValueConvertedLabel, unit1ChoiceBox, unit2ChoiceBox, convertUnitButton);
    }
    
    public void setTimeZonesConverterTab() {
    	GridPane timeZonesContent = new GridPane();
    	
    	ChoiceBox cityToConvert = new ChoiceBox();
    	Label cityTimeToConvert = new Label();
    	
    	ChoiceBox cityConverted = new ChoiceBox();
    	Label cityTimeConverted = new Label();
    	
    	Button findTime = new Button("Find time");
    	
    	cityToConvert.getItems().addAll("Yerevan", "Montreal", "Moscow", "Aleppo");
    	cityConverted.getItems().addAll("Yerevan", "Montreal", "Moscow", "Aleppo");
    	
    	timeZonesContent.setConstraints(cityToConvert, 0, 0, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
    	timeZonesContent.setConstraints(cityTimeToConvert, 0, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
    	timeZonesContent.setConstraints(cityConverted, 1, 0, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
    	timeZonesContent.setConstraints(cityTimeConverted, 1, 1, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
    	timeZonesContent.setConstraints(findTime, 0, 2, 1, 1, HPos.CENTER, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);
    	
    	timeZonesContent.getChildren().addAll(cityToConvert, cityTimeToConvert, cityConverted, cityTimeConverted, findTime);
    	
    	this.timeZonesConverterTab.setContent(timeZonesContent);
    	
    	new TimeZonesConversionController(cityToConvert, cityTimeToConvert, cityConverted, cityTimeConverted, findTime);
    }

	public void setBorderPaneLayout() {
		// BorderPane definition
		borderPane = new BorderPane();
		borderPane.setTop(menuBar);
		borderPane.setCenter(tabPane);
		
	}


}
