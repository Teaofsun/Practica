package com.example.practica;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button Button_b;

    @FXML
    private BorderPane PrimaryLayout;

    @FXML
    void New_Scene(ActionEvent event) throws IOException {
        AnchorPane view = FXMLLoader.load(getClass().getResource("Spisok.fxml"));
        PrimaryLayout.setCenter(view);
    }
}
