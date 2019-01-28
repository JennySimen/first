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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class WeatherController {
   WeatherGui weatherGUI;

    public WeatherController(WeatherGui weatherGUI) {
        this.weatherGUI = weatherGUI;
        setUpStage();
    }

    private void setUpStage() {
        //image icon path
        Image yestImage;
        Image todayImage;
        Image tomorrowImage;
        ImageView tomorrowImageView;
        ImageView yestImageView;
        ImageView todayImageView;
        String yesterdayPathString = "/com/javaApps/Resources/yesterday.jpg";
        String todaypathString = "/com/javaApps/Resources/today.png";
        String tomorrowpathString = "/com/javaApps/Resources/yesterday.jpg";
        
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
        weatherGUI.root.setId("root");
        
        //setting up the title
        weatherGUI.titleLabel.setId("title");
        
        //setting up the search
        weatherGUI.searchTextField.setId("searchField");
        weatherGUI.searchTextField.setPromptText("Search town...");
        
        //setting up the yesterday card
        yestImage  = new Image(yesterdayPathString);
        yestImageView  = new ImageView(yestImage);
        yestImageView.setFitHeight(100.0);
        yestImageView.setFitWidth(100.0);
        
        //Show yesterday's date
        weatherGUI.yestDateLabel.setText(
                weatherGUI.yestDateLabel.getText() + getYesterdayDate()
        );
        
        weatherGUI.yesterdayVbox.getChildren().addAll(
                weatherGUI.yestDayLabel,
                weatherGUI.yestDateLabel,
                yestImageView,
                weatherGUI.yestTemperatureLabel,
                weatherGUI.yestCloudsLabel,
                weatherGUI.yestWindsLabel
        );
        weatherGUI.yesterdayVbox.getStyleClass().add("card");
        weatherGUI.yesterdayVbox.setPrefSize(230, 300);
        weatherGUI.yesterdayVbox.setSpacing(15);
        weatherGUI.yesterdayVbox.setPadding(new Insets(10,10,10,10)); 
        weatherGUI.yesterdayVbox.setMargin(weatherGUI.yestDayLabel, new Insets(0,0,0,30));
        weatherGUI.yesterdayVbox.setMargin(yestImageView, new Insets(0,0,0,20));
        
        weatherGUI.yestDayLabel.getStyleClass().add("day-label");
        
        //Setting up the today card
        todayImage = new Image(todaypathString);
        todayImageView = new ImageView(todayImage);
        todayImageView.setFitHeight(100.0);
        todayImageView.setFitWidth(100.0);
        
        //show today's date
        weatherGUI.todayDateLabel.setText(
                weatherGUI.todayDateLabel.getText() + getTodayDate()
        );
        
        weatherGUI.todayVbox.getChildren().addAll(
                weatherGUI.todayDayLabel,
                weatherGUI.todayDateLabel,
                todayImageView,
                weatherGUI.todayTemperatureLabel,
                weatherGUI.todayCloudsLabel,
                weatherGUI.todayWindsLabel
        );
        weatherGUI.todayVbox.getStyleClass().add("card");
        weatherGUI.todayVbox.setPrefSize(230, 300);
        weatherGUI.todayVbox.setSpacing(15);
        weatherGUI.todayVbox.setPadding(new Insets(10,10,10,10)); 
        weatherGUI.todayVbox.setMargin(weatherGUI.todayDayLabel, new Insets(0,0,0,30));
        weatherGUI.todayVbox.setMargin(todayImageView, new Insets(0,0,0,20));
        
        weatherGUI.todayDayLabel.getStyleClass().add("day-label");
        
        //setting the tomorrow card
        tomorrowImage = new Image(tomorrowpathString);
        tomorrowImageView = new ImageView(tomorrowImage);
        tomorrowImageView.setFitHeight(100.0);
        tomorrowImageView.setFitWidth(100.0);
        
        weatherGUI.tomorrowDateLabel.setText(
                weatherGUI.tomorrowDateLabel.getText() + getTommorowDate()
        );
        
        weatherGUI.tomorrowVbox.getChildren().addAll(
                weatherGUI.tomorrowDayLabel,
                weatherGUI.tomorrowDateLabel,
                tomorrowImageView,
                weatherGUI.tomorrowTemperatureLabel,
                weatherGUI.tomorrowCloudsLabel,
                weatherGUI.tomorrowWindsLabel
        );
        weatherGUI.tomorrowVbox.getStyleClass().add("card");
        weatherGUI.tomorrowVbox.setPrefSize(230, 300);
        weatherGUI.tomorrowVbox.setSpacing(15);
        weatherGUI.tomorrowVbox.setPadding(new Insets(10,10,10,10)); 
        weatherGUI.tomorrowVbox.setMargin(weatherGUI.tomorrowDayLabel, new Insets(0,0,0,30));
        weatherGUI.tomorrowVbox.setMargin(tomorrowImageView, new Insets(0,0,0,20));
        
        weatherGUI.tomorrowDayLabel.getStyleClass().add("day-label");
        
        //adding the sections to the weather vbox
        weatherGUI.dailyWeatherBox.getChildren().addAll(
                weatherGUI.yesterdayVbox,
                weatherGUI.todayVbox,
                weatherGUI.tomorrowVbox
        );
        weatherGUI.dailyWeatherBox.setSpacing(15);
        
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
   
   //get yesterdaý's date
    public String getYesterdayDate(){
        final Calendar calender = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat(" dd/MM/yyyy");
        calender.add(Calendar.DATE, -1);
        return dateFormat.format(calender.getTime());
    }
    
    //tomorrows date
    public String getTommorowDate(){
        final Calendar calender = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat(" dd/MM/yyy");
        calender.add(Calendar.DATE, +1);
        return dateFormat.format(calender.getTime());
    }
    
    //get today's date
    public String getTodayDate(){
        final Calendar calender = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat(" dd/MM/yyy");
        return dateFormat.format(calender.getTime());
    }
    
}
