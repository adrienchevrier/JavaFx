/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author Nicolas
 */
public class JavaFX extends Application  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        
        Text text = new Text(10,40, "Hello World!");
        text.setFont(new Font(40));
        Scene scene = new Scene (new Group(text));
        
        stage.setTitle("Welcome to my application!");
        stage.setScene(scene);
        stage.show();
    }
    
    
   
}

