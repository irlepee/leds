package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Strip;

public class modalController {

    private int numLeds;

    @FXML
    private Button btnNumLeds;

    @FXML
    private TextField txtNumLeds;

    @FXML
    void clickbtnNumLeds(ActionEvent event) {
        if (txtNumLeds.getText() != null) {
            try {
                numLeds = Integer.parseInt(txtNumLeds.getText());
            } catch (NumberFormatException e) {
                numLeds = 0;
            }
        }
    }

    public int getNumLeds() {
        return numLeds;
    }

}
