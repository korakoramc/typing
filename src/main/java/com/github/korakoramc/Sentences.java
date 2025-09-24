package com.github.korakoramc;

public class Sentences {
    String[][] sentences={
        {"私はJavaを勉強中です","わたしはJavaをべんきょうちゅうです。"},
        {"私の電話番号は123-456-789です。","わたしのでんわばんごうは123-456-789です。"},
        {"今日は12月13日です。","きょうは12がつ13にちです"}
    };

    public String getMainSentence(int n){
        return sentences[n][0];
    }
    
    public String getSubSentence(int n) {
        return sentences[n][1];
    }

    public int getLength(){
        return sentences.length;
    }
}

