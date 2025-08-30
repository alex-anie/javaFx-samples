package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {
   @Override
    public void start(Stage stage) throws Exception {

       try{
           Parent root = FXMLLoader.load(
                   Objects.requireNonNull(getClass().getResource("/com/example/hellofx/Scene1.fxml"))
           );

           Scene scene = new Scene(root);
           scene.getStylesheets().add(
                   Objects.requireNonNull(getClass().getResource("/com/example/hellofx/style.css"))
                           .toExternalForm()
           );

           stage.setScene(scene);
           stage.show();
       }catch (Exception e){
           e.printStackTrace();
       }
   }
}
