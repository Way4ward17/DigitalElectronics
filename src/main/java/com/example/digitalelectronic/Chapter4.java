package com.example.digitalelectronic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Chapter4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    @FXML
    private void nexttofive(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("chapter5.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Chapter Five");
        stage.setScene(scene);
        stage.show();
    }


    public void playVideo(ActionEvent actionEvent) throws IOException {
        DataSingleton dataSingleton = DataSingleton.getInstance();
        dataSingleton.setLinks("https://grezitioninter.com.ng/video/LogicGates.mp4");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("videoPlayer.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage(StageStyle.UNDECORATED);
        stage.setTitle("Chapter Thirteen");
        stage.setScene(scene);
        stage.show();
    }
}
