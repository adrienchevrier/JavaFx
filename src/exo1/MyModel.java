/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Nicolas
 */
public class MyModel {

    private final ObservableList <String> list = FXCollections.observableArrayList();
    
  public ObservableList <String> getItems() {
      return list;
  }
  
}
