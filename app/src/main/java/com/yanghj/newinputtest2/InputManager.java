package com.yanghj.newinputtest2;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by yanghj on 3/31/15.
 */
public class InputManager {
    private static InputManager instance;

    public static InputManager getInstance(@Nullable Activity aty) {
        if (null == instance) try {
            instance = new InputManager(aty);
        } catch (IOException e) {
            Log.d("InputManager", "init fail");
            e.printStackTrace();
        }
        return instance;
    }

    // 韵母
    public static final String Y_A = "a";
    public static final String Y_E = "e";
    public static final String Y_I = "i";
    public static final String Y_O = "o";
    public static final String Y_U = "u";
    public static final String Y_N = "n";
    public static final String Y_G = "g";

    public static final String Y_AI = "ai";
    public static final String Y_AO = "ao";
    public static final String Y_AN = "an";
    public static final String Y_ANG = "ang";

    public static final String Y_EI = "ei";
    public static final String Y_EN = "en";
    public static final String Y_ENG = "eng";

    public static final String Y_IN = "in";
    public static final String Y_ING = "ing";
    public static final String Y_IA = "ia";
    public static final String Y_IAN = "ian";
    public static final String Y_IANG = "iang";
    public static final String Y_IAO = "iao";
    public static final String Y_IE = "ie";
    public static final String Y_IU = "iu";
    public static final String Y_IONG = "iong";

    public static final String Y_OU = "ou";
    public static final String Y_ONG = "ong";

    public static final String Y_UA = "ua";
    public static final String Y_UAN = "uan";
    public static final String Y_UANG = "uang";
    public static final String Y_UAI = "uai";
    public static final String Y_UE = "ue";
    public static final String Y_UI = "ui";
    public static final String Y_UO = "uo";
    public static final String Y_UN = "un";

    public static final String Y_V = "v";

    // 声母
    public static final String S_B = "b";
    public static final String S_P = "p";
    public static final String S_M = "m";
    public static final String S_F = "f";
    public static final String S_D = "d";
    public static final String S_T = "t";
    public static final String S_N = "n";
    public static final String S_L = "l";
    public static final String S_G = "g";
    public static final String S_K = "k";
    public static final String S_H = "h";
    public static final String S_Y = "y";
    public static final String S_J = "j";
    public static final String S_Q = "q";
    public static final String S_X = "x";
    public static final String S_W = "w";
    public static final String S_ZH = "zh";
    public static final String S_CH = "ch";
    public static final String S_SH = "sh";
    public static final String S_R = "r";
    public static final String S_Z = "z";
    public static final String S_C = "c";
    public static final String S_S = "s";

    private CharacterList wordList;
    private MainActivity aty;
    private TextView indicator;
    private String pinyin_s;
    private String pinyin_y;

    private InputManager(Activity aty) throws IOException {
        initWordList(aty);
        this.aty = (MainActivity)aty;
        indicator = (TextView)aty.findViewById(R.id.pinyinIndicator);
    }

    public void setPinyinS(String s) {
        this.pinyin_s = s;
        if (null == pinyin_y && null != pinyin_s) {
            aty.hideYBtns(s, wordList.getPinyinList());
        }
        else if (null != pinyin_y && null == pinyin_s){
            aty.hideSBtns(pinyin_y, wordList.getPinyinList());
        }
        else {
            aty.showAllBtn();
        }
        aty.refreshSelection();
    }

    public void setPinyinY(String y) {
        this.pinyin_y = y;
        if (null == pinyin_y && null != pinyin_s) {
            aty.hideYBtns(pinyin_s, wordList.getPinyinList());
        }
        else if (null != pinyin_y && null == pinyin_s){
            aty.hideSBtns(y, wordList.getPinyinList());
        }
        else {
            aty.showAllBtn();
        }
        aty.refreshSelection();
    }

    private void initWordList(Activity aty) throws IOException {
        wordList = new CharacterList();
        InputStream im = aty.getResources().openRawResource(R.raw.single_char);
        BufferedReader reader = new BufferedReader(new InputStreamReader(im));
        String line = reader.readLine();
        while (null != line) {
            wordList.storeLine(line);
            line = reader.readLine();
        }
        wordList.sortAll();
    }

    public void refreshIndicator() {
        if (null == pinyin_y || null == pinyin_s) {
            indicator.setText("");
        }
        else {
            indicator.setText(pinyin_s + pinyin_y);
        }
    }

    public ArrayAdapter<String> getWords() {
        if (null == pinyin_y || null == pinyin_s) {
            return new ArrayAdapter<>(aty,
                    R.layout.char_select_view_item, new String[] {""});
        }
        else {
            int size = 0, index = 0;

            // search characters for Sheng + Yun
            String key = pinyin_s + pinyin_y;
            List<CharacterPair> result = wordList.get(key);

            if (null != result) {
                size = result.size();
            }

            // arrayAdapter constructing
            String[] characterToShow = new String[size];
            if (null != result) {
                for (CharacterPair entry : result) {
                    characterToShow[index++] = entry.first;
                }
            }

            return new ArrayAdapter<>(aty,
                    R.layout.char_select_view_item, characterToShow);
        }
    }
}
