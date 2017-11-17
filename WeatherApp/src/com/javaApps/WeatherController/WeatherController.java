/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaApps.WeatherController;

/**
 *
 * @author YAKAM
 */

//Import the GUI
import com.javaApps.WeatherGui.WeatherGui;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

public class WeatherController {
   WeatherGui weatherGUI;

    public WeatherController(WeatherGui weatherGUI) {
        this.weatherGUI = weatherGUI;
        setUpStage();
    }

    private void setUpStage() {
        //creating a new scene
        weatherGUI.scene = new Scene(weatherGUI.root, 600, 450);
        
        //adding the stylesheet
        weatherGUI.scene.getStylesheets().add(getClass().
                getResource("/com/javaApps/Resources/style.css").toExternalForm());
        
        //setting up the root
        weatherGUI.root.setPadding(new Insets(20,20,20,20));  
        weatherGUI.root.setMargin(weatherGUI.searchTextField, new Insets(0,150,0,150));
        weatherGUI.root.setMargin(weatherGUI.titleLabel, new Insets(2,0,0,200));
        weatherGUI.root.setSpacing(20);
        
        //setting up the title
        weatherGUI.titleLabel.setId("title");
        
        //setting up the search
        weatherGUI.searchTextField.setId("searchField");
        weatherGUI.searchTextField.setPromptText("Search town...");
        
        //setting up the yesterday card
        weatherGUI.yesterdayVbox.getChildren().addAll(
                weatherGUI.yestDayLabel,
                weatherGUI.yestDateLabel,
                weatherGUI.yestTemperatureLabel,
                weatherGUI.yestCloudsLabel,
                weatherGUI.yestWindsLabel
        );
        weatherGUI.yesterdayVbox.getStyleClass().add("card");
        
        //Setting up the today card
        weatherGUI.todayVbox.getChildren().addAll(
                weatherGUI.todayDayLabel,
                weatherGUI.todayDateLabel,
                weatherGUI.todayTemperatureLabel,
                weatherGUI.todayCloudsLabel,
                weatherGUI.todayWindsLabel
        );
        weatherGUI.todayVbox.getStyleClass().add("card");
        
        //setting the tomorrow card
        weatherGUI.tomorrowVbox.getChildren().addAll(
                weatherGUI.tomorrowDayLabel,
                weatherGUI.tomorrowDateLabel,
                weatherGUI.tomorrowTemperatureLabel,
                weatherGUI.tomorrowCloudsLabel,
                weatherGUI.tomorrowWindsLabel
        );
        weatherGUI.tomorrowVbox.getStyleClass().add("card");
        
        //adding the sections to the weather vbox
        weatherGUI.dailyWeatherBox.getChildren().addAll(
                weatherGUI.yesterdayVbox,
                weatherGUI.todayVbox,
                weatherGUI.tomorrowVbox
        );
        
        //Adding components to the root
        weatherGUI.root.getChildren().addAll(
                weatherGUI.titleLabel,
                weatherGUI.searchTextField,
                weatherGUI.dailyWeatherBox
        );
        
        //setup the stage
        weatherGUI.setScene(weatherGUI.scene);
        weatherGUI.setResizable(false);
        weatherGUI.show();
    }
   
   
    
}
