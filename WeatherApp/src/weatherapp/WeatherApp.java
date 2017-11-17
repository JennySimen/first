/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weatherapp;

import com.javaApps.WeatherController.WeatherController;
import com.javaApps.WeatherGui.WeatherGui;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author YAKAM
 */
public class WeatherApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        weatherapp();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void weatherapp(){
        WeatherGui weatherGui = new WeatherGui();
        WeatherController weatherController = new WeatherController(weatherGui);
    }
    
}