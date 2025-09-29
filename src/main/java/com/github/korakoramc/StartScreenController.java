package com.github.korakoramc;

import java.io.IOException;
import javafx.fxml.FXML;

public class StartScreenController {
    private App app;
    public void setApp(App app){
        this.app=app;
    }

    @FXML
    private void startButtonClick() throws IOException{
        System.out.println("スタート!");
        app.showSettingScene();
    }
}
