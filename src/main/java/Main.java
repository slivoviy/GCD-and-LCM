package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("gui/interface.fxml"));

        Scene scene = new Scene(root);
        scene.setRoot(root);

        primaryStage.setTitle("Нахождение НОК и НОД");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../resources/icons/icon1.png")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../resources/icons/icon2.png")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../resources/icons/icon3.png")));
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../resources/icons/icon4.png")));
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
