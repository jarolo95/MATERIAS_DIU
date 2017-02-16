/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package materias_diu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JTabbedPane;

/**
 *
 * @author Javier
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button bt1;
    private Button bt2;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        bt1.getOnMouseClicked();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
