package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.Strip;
import utils.path;

public class mainWindowController {

    int idStrip = 0;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnRecord;

    @FXML
    public void initialize() {

    }


    @FXML
    void clickbtnAdd(ActionEvent event) throws Exception {
        Strip strip1 = new Strip();
        strip1.addStrip(idStrip);

    }

    @FXML
    void clickbtnRecord(ActionEvent event) {

    }

}
