/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author YAKAM
 */
public class HomeController implements Initializable {
    
    // other methods you may need to access, etc...
    
    Button button = new Button("dentist");
button.setStyle("url('../css/dentist.jpg');");

Button button1 = new Button("blood-work");
button1.setStyle("url('../css/white.jpeg')");
  
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}

   
