package com.github.korakoramc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private Stage currentStage;

    @Override
    public void start(Stage stage) throws IOException{
        this.currentStage=stage;
        stage.setTitle("タイピング");
        showStartScene();
        stage.show();
    }

    public void showStartScene() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("StartScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),640,480);
        currentStage.setScene(scene);
    }

    /*public void showGameScene(){
        //Scene gameScene=//
        //currentStage.setScene(gameScene);
    }

    public void showResultScene() {
        //Scene resultScene = //
        //currentStage.setScene(resultScene);
    }*/
    public static void main(String[] args) {
        launch();
    }

}