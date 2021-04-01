
package com.openbravo.pos.util;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 * Provides JavaFX media player services
 * @author uniCenta
 */


public class VideoPlayer extends Application {    
    public static void main(String[] args) { launch(args); }
        private static final String MEDIA_URL = 
//          "http://unicenta.org/downloads/unicentaopos_v3Beta1_preview.mp4";   // Test URL
   "file:///C://temp//2017_07_14_12_20_37-ses.mp4";                             // Test LocalFile 

        
@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("uniCenta Media Player");
        Group root = new Group();
        Scene scene = new Scene(root, 540, 310);
// create media player
        Media media = new Media(MEDIA_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
// create mediaView and add media player to the viewer
        MediaView mediaView = new MediaView(mediaPlayer);
        ((Group)scene.getRoot()).getChildren().add(mediaView);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
   
}
