/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaApps.WeatherGui;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author YAKAM
 */
public class WeatherGui extends Stage{
    //Containers
    public HBox dailyWeatherBox = new HBox();
    public VBox root = new VBox();
    
    //Components
    public JFXTextField searchTextField = new JFXTextField();
    
    //title
    public Label titleLabel = new Label("WEATHER ME");
    
    //Cards
    public VBox yesterdayVbox = new VBox();
//    public Image yestImage = new Image("");
//    public ImageView yestImageView = new ImageView();
    public Label yestDayLabel = new Label("YESTERDAY");
    public Label yestDateLabel = new Label("DATE: ");
    public Label yestTemperatureLabel = new Label("TEMPERATURE: ");
    public Label yestWindsLabel = new Label("WINDS: ");
    public Label yestCloudsLabel = new Label("CLOUDS: ");
    
    public VBox todayVbox = new VBox();
//    public Image todayImage = new Image("");
//    public ImageView todayImageView = new ImageView();
    public Label todayDayLabel = new Label("TODAY");
    public Label todayDateLabel = new Label("DATE: ");
    public Label todayTemperatureLabel = new Label("TEMPERATURE: ");
    public Label todayWindsLabel = new Label("WINDS: ");
    public Label todayCloudsLabel = new Label("CLOUDS: ");
    
    public VBox tomorrowVbox = new VBox();
//    public Image tomorrowImage = new Image("");
//    public ImageView tomorrowImageView = new ImageView();
    public Label tomorrowDayLabel = new Label("TOMORROW");
    public Label tomorrowDateLabel = new Label("DATE: ");
    public Label tomorrowTemperatureLabel = new Label("TEMPERATURE: ");
    public Label tomorrowWindsLabel = new Label("WINDS: ");
    public Label tomorrowCloudsLabel = new Label("CLOUDS: ");
    
    public Scene scene;
}
