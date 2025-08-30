package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Scene1Controller {

    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException {

        String username = nameTextField.getText();

        FXMLLoader loader = new FXMLLoader(
                Objects.requireNonNull(getClass().getResource("/com/example/hellofx/Scene2b.fxml"))
        );

        root = loader.load();

        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(username);

//        Parent root = FXMLLoader.load(
//                Objects.requireNonNull(getClass().getResource("/com/example/hellofx/Scene1a.fxml"))
//        );
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
