package main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private static List<Stage> childStages;

    public static void main(String[] args) {
        childStages = new ArrayList<Stage>();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/main.fxml"));
        stage.setTitle("WirelessTransfer");
        stage.setScene(new Scene(root, 300, 275));
        stage.setOnCloseRequest(event -> childStages.forEach(child -> child.close()));
        stage.show();
    }

    public static void addChildStage(Stage stage) {
        Main.childStages.add(stage);
    }

    public static void removeChildStage(Stage stage) {
        if(childStages.contains(stage))
            childStages.remove(stage);
    }
}
