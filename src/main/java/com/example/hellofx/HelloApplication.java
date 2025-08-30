package com.example.hellofx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {
   @Override
    public void start(Stage stage) throws Exception {

       try{
           Parent root = FXMLLoader.load(
                   Objects.requireNonNull(getClass().getResource("/com/example/hellofx/exit.fxml"))
           );

           Scene scene = new Scene(root);

           stage.setOnCloseRequest(event -> {
               event.consume();
               logout(stage);
           });

           stage.setScene(scene);
           stage.show();
       }catch (Exception e){
           e.printStackTrace();
       }




   }

    public void logout(Stage stage){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout");
        alert.setContentText("Do you want to save before exiting?: ");

        if(alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out!");
            stage.close();
        }

    }
}
