package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("/panda.png");

        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program woot woot");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//       stage.setX(50);
//       stage.setY(50);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("You can't escape unless you press q");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        stage.setScene(scene);

        stage.show();
    }
}
