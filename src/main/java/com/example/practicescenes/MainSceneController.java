package com.example.practicescenes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class MainSceneController {
    @FXML
    private Label welcomeText;

    private Stage stage;

    @FXML
    protected void nextScene() throws IOException {
        FXMLLoader root = new FXMLLoader(MainApp.class.getResource("newScene.fxml"));
        Scene scene = new Scene(root.load());

        stage= (Stage)welcomeText.getScene().getWindow();
        stage.setScene(scene);

        stage.show();

        /*
        FXMLLoader root = new FXMLLoader(SceneSwitchMain.class.getResource("scene2.fxml"));
        Stage stage = (Stage) btn1.getScene().getWindow();
        stage.setScene(new Scene(root.load()));
        * */

    }
}