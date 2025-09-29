package com.github.korakoramc;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class SettingsScreenController {
    @FXML
    private ToggleGroup modeToggleGroup;
    @FXML
    private RadioButton timeLimitRadio;
    @FXML
    private RadioButton questRadio;
    @FXML
    private ChoiceBox<Integer> valueChoiceBox;

    private App app;
    
    public void setApp(App app){
        this.app=app;
    }

    @FXML
    public void initialize(){
        valueChoiceBox.getItems().addAll(3,5,10,15,20);
        valueChoiceBox.setValue(10);
    }

    @FXML
    private void handleGameStartButton()throws IOException{
        RadioButton selectedRadio=(RadioButton)modeToggleGroup.getSelectedToggle();
        String mode=selectedRadio.getId();
        int value=valueChoiceBox.getValue();
        System.out.println("Mode:"+mode+",Value:"+value);
        app.showGameScene(mode,value);
    }
}
