package exo3;
 
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
 
/**
 *
 * @web http://java-buddy.blogspot.com/
 */
public class Sample implements Initializable {
 
    @FXML
    private PieChart piechart;
     
    @FXML
    private void handleButton1Action(ActionEvent event) {
        ObservableList<PieChart.Data> pieChartData = 
                FXCollections.observableArrayList(
                    new PieChart.Data("Information Systems", 130),
                    new PieChart.Data("Embedded Systems", 110),
                    new PieChart.Data("Embedded Systems", 110),
                    new PieChart.Data("Health", 50),
                    new PieChart.Data("Financial Computing",65),
                    new PieChart.Data("IOT", 40));
                    // draw the chart
         
        piechart.setTitle("ECE Master Proportions");
        piechart.setData(pieChartData);
    }
     
 
    @FXML
    private void handleButtonClearAction(ActionEvent event) {
        ObservableList<PieChart.Data> pieChartData = 
                FXCollections.observableArrayList();
        piechart.setTitle("");
        piechart.setData(pieChartData);
    }
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}