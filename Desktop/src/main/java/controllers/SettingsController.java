package controllers;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import util.Category;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {

    @FXML
    protected ListView<String> categories;

    @FXML
    protected VBox settingsPane;

    protected List<String> categoryItems;
    protected ListProperty<String> listProperty;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        categoryItems = new ArrayList<String>();
        listProperty = new SimpleListProperty<String>();

        categoryItems.add(Category.GENERAL.toString());
        categoryItems.add(Category.RECEIVED.toString());

        categories.itemsProperty().bind(listProperty);
        listProperty.set(FXCollections.<String>observableArrayList(categoryItems));
    }
}
