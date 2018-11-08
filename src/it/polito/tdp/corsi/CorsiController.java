package it.polito.tdp.corsi;

/**
 * Sample Skeleton for 'Corsi.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CorsiController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtSemestre"
    private TextField txtSemestre; // Value injected by FXMLLoader

    @FXML // fx:id="handleCerca"
    private Button handleCerca; // Value injected by FXMLLoader

    @FXML // fx:id="txtLog"
    private TextArea txtLog; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtSemestre != null : "fx:id=\"txtSemestre\" was not injected: check your FXML file 'Corsi.fxml'.";
        assert handleCerca != null : "fx:id=\"handleCerca\" was not injected: check your FXML file 'Corsi.fxml'.";
        assert txtLog != null : "fx:id=\"txtLog\" was not injected: check your FXML file 'Corsi.fxml'.";

    }
}
