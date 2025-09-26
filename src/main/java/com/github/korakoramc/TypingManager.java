package com.github.korakoramc;

public class TypingManager {
    String currentMainSentence;
    String currentRomajiSentence;
    
    public void startTyping(){
        int index=(int)(Math.random()*sentences.getLength());
        currentMainSentence=sentences.getMainSentence(index);
        currentRomajiSentence = romaji.toRomaji(sentences.getSubSentence(index));
    }
    private Sentences sentences=new Sentences();
    private Romaji romaji = new Romaji();

    public String getCurrentMainSentence(){
        return currentMainSentence;
    }
    
    public String getCurrentRomajiSentence() {
        return currentRomajiSentence;
    }
}
