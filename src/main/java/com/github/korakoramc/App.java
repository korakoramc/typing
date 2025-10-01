package com.github.korakoramc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IO;
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
        StartScreenController controller=fxmlLoader.getController();
        controller.setApp(this);
        currentStage.setScene(scene);
    }

    public void showSettingScene()throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("SettingsScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        SettingsScreenController controller = fxmlLoader.getController();
        controller.setApp(this);
        currentStage.setScene(scene);
    }

    public void showGameScene(String mode,int value)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("GameScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        GameScreenController controller=fxmlLoader.getController();
        controller.setApp(this);
        controller.setupGame(mode, value);
        scene.setOnKeyTyped(event -> {
            String pressedKey=event.getCharacter();
            controller.processKeyPress(pressedKey);
        });
        currentStage.setScene(scene);
        TypingManager typingManager=new TypingManager();
        typingManager.startTyping();
        controller.setNewProblem(typingManager.getCurrentMainSentence(),typingManager.getCurrentRomajiSentence());
    }

    public void showResultScene(int correctTypeCount,int incorrectTypeCount) throws IOException{
        FXMLLoader fxmlLoader=new FXMLLoader(App.class.getResource("ResultScreen.fxml"));
        Scene scene=new Scene(fxmlLoader.load(),640,480);
        ResultScreenController controller=fxmlLoader.getController();
        controller.setApp(this);
        controller.setResults(correctTypeCount,incorrectTypeCount);
        currentStage.setScene(scene);
    }
    public static void main(String[] args) {
        launch();
    }

}