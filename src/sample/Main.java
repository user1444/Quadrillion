package sample;

import DataModels.Achievement;
import DataModels.GameLevel;
import DataModels.Player;
import Scenes.LoginScene;
import Scenes.MenuScene;
import Scenes.PlayScene;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import java.util.LinkedList;

public class Main extends Application {

    // We will need this
    public static Stage mainStage;

    public static Player player;

    boolean nightMode = false;
    boolean colorBlindMode = false;
    int theme;
    float volume;

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {
            mainStage = primaryStage;

            //LevelEditorScene gameScene = new LevelEditorScene();



            primaryStage.setTitle("My Little Quadrillion - v0.01");
            primaryStage.getIcons().add(new Image("file:src/Images/logo.png"));
            primaryStage.setResizable(false);

            Media media = new Media(new File("src/Playlist/tetris.mp3").toURI().toString());
            MediaPlayer player = new MediaPlayer(media);
            MediaView view = new MediaView(player);


            player.setAutoPlay(true);

            MenuScene EntryScene = new MenuScene(view);
            primaryStage.setScene(EntryScene);

            this.player = new Player("awsome", "more");

            primaryStage.show();

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
