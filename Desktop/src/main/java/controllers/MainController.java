package controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import main.Main;

import java.io.IOException;

public class MainController {

    @FXML
    protected MenuItem menuSettings;


    @FXML
    protected void onSettingsClicked() {
        try {
            Stage settings = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("../fxml/settings.fxml"));
            settings.setTitle("Settings");
            settings.initStyle(StageStyle.UTILITY);
            settings.setScene(new Scene(root, 896, 504));
            settings.setOnCloseRequest(event -> Main.removeChildStage(settings));
            Main.addChildStage(settings);
            settings.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
