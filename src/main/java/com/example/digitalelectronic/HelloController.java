package com.example.digitalelectronic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private void chapterone(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 642, 459);
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void chaptertwo(ActionEvent event) {
    }

    @FXML
    private void chapterthree(ActionEvent event) {
    }

    @FXML
    private void chapterfour(ActionEvent event) {
    }

    @FXML
    private void chapterfive(ActionEvent event) {
    }

    @FXML
    private void chaptersix(ActionEvent event) {
    }

    @FXML
    private void chapterseven(ActionEvent event) {
    }

    @FXML
    private void chaptereight(ActionEvent event) {
    }

    @FXML
    private void chapternine(ActionEvent event) {
    }

    @FXML
    private void chapterten(ActionEvent event) {
    }

    @FXML
    private void chaptereleven(ActionEvent event) {
    }

    @FXML
    private void chaptertwelve(ActionEvent event) {
    }

    @FXML
    private void chapterthirteen(ActionEvent event) {
    }

    @FXML
    private void chapterforteen(ActionEvent event) {
    }

    @FXML
    private void chapterfiften(ActionEvent event) {
    }

    @FXML
    private void chaptersixten(ActionEvent event) {
    }

    @FXML
    private void chapterseventeen(ActionEvent event) {
    }

    @FXML
    private void chaptereighten(ActionEvent event) {
    }

    @FXML
    private void chapternineteen(ActionEvent event) {
    }

    @FXML
    private void chaptertwenty(ActionEvent event) {
    }
}