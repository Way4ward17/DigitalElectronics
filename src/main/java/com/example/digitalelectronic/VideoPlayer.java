package com.example.digitalelectronic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class VideoPlayer implements Initializable {


    public AnchorPane Video;
    String URL;
    @FXML
    public MediaView mediaView;
    private Media media;
    Stage stage;
    private MediaPlayer mediaPlayer;
    DataSingleton dataSingleton = DataSingleton.getInstance();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stage = new Stage();
        URL = dataSingleton.getLinks();
        media = new Media(URL);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setOnReady(() -> stage.sizeToScene());
        mediaView.setMediaPlayer(mediaPlayer);


        System.out.println(URL);
    }

    public void stop(ActionEvent actionEvent) {
        if(mediaPlayer.getStatus() != MediaPlayer.Status.READY){
            mediaPlayer.seek(Duration.seconds(0.0));
            mediaPlayer.stop();
            Video.getScene().getWindow().hide();
        }
    }
}
