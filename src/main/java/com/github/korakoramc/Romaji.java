package com.github.korakoramc;

import java.util.HashMap;
import java.util.Map;

public class Romaji {
    Map<String,String> Romaji = new HashMap<String,String>(){
        {
            put("あ", "a");
            put("い", "i");
            put("う", "u");
            put("え", "e");
            put("お", "o");

            put("か", "ka");
            put("き", "ki");
            put("く", "ku");
            put("け", "ke");
            put("こ", "ko");

            put("さ", "sa");
            put("し", "si");
            put("す", "su");
            put("せ", "se");
            put("そ", "so");

            put("た", "ta");
            put("ち", "ti");
            put("つ", "tu");
            put("て", "te");
            put("と", "to");

            put("な", "na");
            put("に", "ni");
            put("ぬ", "nu");
            put("ね", "ne");
            put("の", "no");

            put("は", "ha");
            put("ひ", "hi");
            put("ふ", "hu");
            put("へ", "he");
            put("ほ", "ho");

            put("ま", "ma");
            put("み", "mi");
            put("む", "mu");
            put("め", "me");
            put("も", "mo");

            put("や", "ya");
            put("ゆ", "yu");
            put("よ", "yo");

            put("ら", "ra");
            put("り", "ri");
            put("る", "ru");
            put("れ", "re");
            put("ろ", "ro");

            put("わ", "wa");
            put("を", "wo");
            put("ん", "nn");

            put("ー", "-");

            put("が", "ga");
            put("ぎ", "gi");
            put("ぐ", "gu");
            put("げ", "ge");
            put("ご", "go");

            put("ざ", "zi");
            put("じ", "za");
            put("ず", "zu");
            put("ぜ", "ze");
            put("ぞ", "zo");

            put("だ", "da");
            put("ぢ", "di");
            put("づ", "du");
            put("で", "de");
            put("ど", "do");

            put("ば", "ba");
            put("び", "bi");
            put("ぶ", "bu");
            put("べ", "be");
            put("ぼ", "bo");
            
            put("ぱ", "pa");
            put("ぴ", "pi");
            put("ぷ", "pu");
            put("ぺ", "pe");
            put("ぽ", "po");

            put("ふぁ", "fa");
            put("ふぃ", "fi");
            put("ふぇ", "fe");
            put("ふぉ", "fo");

            put("きゃ", "kya");
            put("きゅ", "kyu");
            put("きょ", "kyo");

            put("しゃ", "sya");
            put("しゅ", "syu");
            put("しょ", "syo");

            put("ちゃ", "tya");
            put("ちゅ", "tyu");
            put("ちょ", "tyo");

            put("にゃ", "nya");
            put("にゅ", "nyu");
            put("にょ", "nyo");

            put("ひゃ", "hya");
            put("ひゅ", "hyu");
            put("ひょ", "hyo");

            put("みゃ", "mya");
            put("みゅ", "myu");
            put("みょ", "myo");
            
            put("りゃ", "rya");
            put("りゅ", "ryu");
            put("りょ", "ryo");

            put("ぎゃ", "gya");
            put("ぎゅ", "gyu");
            put("ぎょ", "gyo");

            put("じゃ", "zya");
            put("じゅ", "zyu");
            put("じょ", "zyo");

            put("ぢゃ", "dya");
            put("ぢゅ", "dyu");
            put("ぢょ", "dyo");

            put("びゃ", "bya");
            put("びゅ", "byu");
            put("びょ", "byo");

            put("ぴゃ", "pya");
            put("ぴゅ", "pyu");
            put("ぴょ", "pyo");

            //put("ヴぁ", "va");
            put("うぃ", "wi");
            put("いぇ", "ye");

            put("、", ",");
            put("。", ".");
        }
    };

    public String toRomaji(String text){
        String result="";
        String[] t=text.split("");
        int l=t.length;
        int i=0;
        while(i<l){
            if(Romaji.containsKey(t[i])){
                if(i+1<l){
                    if(t[i+1].equals("ぁ")||
                    t[i+1].equals("ぃ")||
                    t[i+1].equals("ぇ")||
                    t[i+1].equals("ぉ")||
                    t[i+1].equals("ゃ")||
                    t[i+1].equals("ゅ")||
                    t[i+1].equals("ょ")){
                        result = result + Romaji.get(t[i]+t[i+1]);
                        i+=2;
                    }
                }
                result=result+Romaji.get(t[i]);
                i++;
            }else if(t[i].equals("っ")){//"っ"の後は子音のみ
                i++;
                String c=Romaji.get(t[i]).split("")[0];
                result=result+c+Romaji.get(t[i]);
                i++;
            }else{
                result=result+t[i];
                i++;
            }
        }
        return result;
    }
}
