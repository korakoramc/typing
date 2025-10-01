package com.github.korakoramc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class ResultScreenController {
    @FXML
    private Label correctCountLabel;
    @FXML
    private Label incorrectCountLabel;
    @FXML
    private Label accuracyLabel;

    private App app;
    public void setApp(App app) {
        this.app = app;
    }
    public void setResults(int correct,int incorrect){
        correctCountLabel.setText(String.valueOf(correct));
        incorrectCountLabel.setText(String.valueOf(incorrect));
        int sum=correct+incorrect;
        double accuracy=(double)correct/sum*100.0;
        accuracyLabel.setText(String.format("%.2f%%",accuracy));
    }

    @FXML
    private void handleToTitleButton()throws IOException{
        app.showStartScene();
    }
}
