/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Nicolas
 */
public class controller implements Initializable{
    
    private final MyModel model = new MyModel();
    
    @FXML //  fx:id="myButton"
    private Button myButton; // Value injected by FXMLLoader
    @FXML
    private TextArea myText;
    
    @FXML
    private ListView <String> listView;
    
 /*   @FXML
    private void initialize () {
        
        listView.setItems(model.getItems());
    }
      @FXML
  private void handleButton1Action(ActionEvent event) {
      
       System.out.println(myText.getText());
  }
 */   
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      assert myButton != null : "fx:id=\"myButton\" was not injected: check your FXML file 'FXML App.fxml'.";
      assert myText != null : "fx:id=\"myText\" was not injected: check your FXML file 'FXML App.fxml'.";
      
      
  myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {           
            //  System.out.println(myText.getText());
             System.out.println("Bonjour");
              
            }
        });
    // what we catch here is the press on the button
    //each time an action occurs on the buttion, we get the text from the textarea
    // note that there is an issue that shoudnt appear here
  
      
    }


    public void handleButton1Action(ActionEvent actionEvent) {

    }
}
