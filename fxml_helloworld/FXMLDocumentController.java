/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author zain
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

    
    @FXML
    private BarChart bcBoneka;

    
    @FXML
    private Button btnHapus;

    
    @FXML
    private Button btnTambah;
    

    @FXML
    private void handleButtonHapus(ActionEvent event) {
    }

    @FXML
    private void handleButtonTambah(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        XYChart.Series<String, Integer> series = new XYChart.Series();  
        series.getData().add(new XYChart.Data<>("Teddy", 50));
        series.getData().add(new XYChart.Data<>("Barbie", 100));
        series.getData().add(new XYChart.Data<>("Lotso", 75));

        bcBoneka.getData().add(series);   
    }    
    
}
