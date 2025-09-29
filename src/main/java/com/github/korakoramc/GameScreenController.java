package com.github.korakoramc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class GameScreenController {
    @FXML
    private Label japaneseLabel;
    @FXML
    private Label romajiLabel;
    @FXML
    private Label timerLabel;

    private App app;
    private int countIndex;
    private String currentRomaji;
    private int finishedProblems=0;

    public void setApp(App app){
        this.app=app;
    }

    public void setNewProblem(String japanese,String romaji){
        japaneseLabel.setText(japanese);
        romajiLabel.setText(romaji);
        currentRomaji=romaji;
        countIndex=0;
    }

    public void processKeyPress(String pressedKey){
        if(currentRomaji==null)//問題が表示されるまでは何もしない
        return;
        String nextKey=currentRomaji.substring(countIndex,countIndex+1);
        if(pressedKey.equals(nextKey)){
            countIndex++;
            romajiLabel.setText(currentRomaji.substring(countIndex));
            if(countIndex==currentRomaji.length()){
                System.out.println("次の問題");
                loadNextProblem();
            }
        }else{
            System.out.println("ミス！");
        }
    }

    private void loadNextProblem(){
        finishedProblems++;
        if(finishedProblems>=3){
            app.showResultScene();
        }
        TypingManager typingManager=new TypingManager();
        typingManager.startTyping();
        japaneseLabel.setText(typingManager.getCurrentMainSentence());
        romajiLabel.setText(typingManager.getCurrentRomajiSentence());
        currentRomaji = typingManager.getCurrentRomajiSentence();
        countIndex = 0;
    }
}