package model;

import controller.modalController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import utils.path;

public class Strip {
    private int id;
    private int numLeds;

    public void addStrip(int id) throws Exception {
        this.id = id;

        FXMLLoader loader = new FXMLLoader(getClass().getResource(path.modal));
        Parent root = loader.load();
        modalController controller = loader.getController();

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();

        this.numLeds = controller.getNumLeds();
    }

    public int getId() {
        return id;
    }

    public int getNumLeds() {
        return numLeds;
    }

}
