/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo2;

import exo2.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Nicolas
 */

public class Main extends Application {

    /**
     * @param args the command line arguments
     */
    Button MyButton;
    public static void main(String[] args) {
        
        Application.launch(Main.class, (java.lang.String[])null);
    }
    
    public void start(Stage primaryStage) {
        try {
            AnchorPane page = (AnchorPane) FXMLLoader.load(Main.class.getResource("sample2.fxml"));
            Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("FXML exo 2");
            primaryStage.show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

//launchs the fxml file and thus the view
// back end has not been implemented