package com.yanghj.newinputtest2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Set;


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends Activity {
    private ToggleButton btn_b;
    private ToggleButton btn_m;
    private ToggleButton btn_d;
    private ToggleButton btn_n;
    private ToggleButton btn_g;
    private ToggleButton btn_h;
    private ToggleButton btn_j;
    private ToggleButton btn_x;
    private ToggleButton btn_z;
    private ToggleButton btn_c;
    private ToggleButton btn_s;
    private ToggleButton btn_p;
    private ToggleButton btn_f;
    private ToggleButton btn_t;
    private ToggleButton btn_l;
    private ToggleButton btn_k;
    private ToggleButton btn_y;
    private ToggleButton btn_q;
    private ToggleButton btn_w;
    private ToggleButton btn_zh;
    private ToggleButton btn_ch;
    private ToggleButton btn_sh;
    private ToggleButton btn_r;

    private ToggleButton btn_a;
    private ToggleButton btn_e;
    private ToggleButton btn_i;
    private ToggleButton btn_u;
    private ToggleButton btn_ai;
    private ToggleButton btn_ei;
    private ToggleButton btn_ia;
    private ToggleButton btn_ie;
    private ToggleButton btn_ua;
    private ToggleButton btn_ue;
    private ToggleButton btn_an;
    private ToggleButton btn_en;
    private ToggleButton btn_ian;
    private ToggleButton btn_in;
    private ToggleButton btn_uai;
    private ToggleButton btn_ui;
    private ToggleButton btn_ang;
    private ToggleButton btn_eng;
    private ToggleButton btn_iang;
    private ToggleButton btn_ing;
    private ToggleButton btn_uan;
    private ToggleButton btn_un;
    private ToggleButton btn_ao;
    private ToggleButton btn_er;
    private ToggleButton btn_iao;
    private ToggleButton btn_iu;
    private ToggleButton btn_uang;
    private ToggleButton btn_uo;
    private ToggleButton btn_o;
    private ToggleButton btn_ou;
    private ToggleButton btn_ong;
    private ToggleButton btn_iong;
    private ToggleButton btn_v;

    private ToggleButton[] sBtns;
    private ToggleButton[] yBtns;

    private GridView textSelectView;
    private TextView showField;
    private InputManager IM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButtons();
        addTextSelectView();
        showField = (TextView)findViewById(R.id.screen);
        IM = InputManager.getInstance(this);

        // test if array adapter works properly
        testTextSelectView();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    private void addButtons() {
        sBtns = new ToggleButton[23];
        yBtns = new ToggleButton[33];

        sBtns[0] = btn_b = (ToggleButton)findViewById(R.id.btn_b);
        sBtns[1] = btn_p = (ToggleButton)findViewById(R.id.btn_p);
        sBtns[2] = btn_m = (ToggleButton)findViewById(R.id.btn_m);
        sBtns[3] = btn_f = (ToggleButton)findViewById(R.id.btn_f);
        sBtns[4] = btn_d = (ToggleButton)findViewById(R.id.btn_d);
        sBtns[5] = btn_t = (ToggleButton)findViewById(R.id.btn_t);
        sBtns[6] = btn_n = (ToggleButton)findViewById(R.id.btn_n);
        sBtns[7] = btn_l = (ToggleButton)findViewById(R.id.btn_l);
        sBtns[8] = btn_g = (ToggleButton)findViewById(R.id.btn_g);
        sBtns[9] = btn_k = (ToggleButton)findViewById(R.id.btn_k);
        sBtns[10] = btn_h = (ToggleButton)findViewById(R.id.btn_h);
        sBtns[11] = btn_y = (ToggleButton)findViewById(R.id.btn_y);
        sBtns[12] = btn_j = (ToggleButton)findViewById(R.id.btn_j);
        sBtns[13] = btn_q = (ToggleButton)findViewById(R.id.btn_q);
        sBtns[14] = btn_x = (ToggleButton)findViewById(R.id.btn_x);
        sBtns[15] = btn_w = (ToggleButton)findViewById(R.id.btn_w);
        sBtns[16] = btn_z = (ToggleButton)findViewById(R.id.btn_z);
        sBtns[17] = btn_zh = (ToggleButton)findViewById(R.id.btn_zh);
        sBtns[18] = btn_c = (ToggleButton)findViewById(R.id.btn_c);
        sBtns[19] = btn_ch = (ToggleButton)findViewById(R.id.btn_ch);
        sBtns[20] = btn_s = (ToggleButton)findViewById(R.id.btn_s);
        sBtns[21] = btn_sh = (ToggleButton)findViewById(R.id.btn_sh);
        sBtns[22] = btn_r = (ToggleButton)findViewById(R.id.btn_r);

        yBtns[0] = btn_a = (ToggleButton)findViewById(R.id.btn_a);
        yBtns[1] = btn_e = (ToggleButton)findViewById(R.id.btn_e);
        yBtns[2] = btn_i = (ToggleButton)findViewById(R.id.btn_i);
        yBtns[3] = btn_u = (ToggleButton)findViewById(R.id.btn_u);
        yBtns[4] = btn_ai = (ToggleButton)findViewById(R.id.btn_ai);
        yBtns[5] = btn_ei = (ToggleButton)findViewById(R.id.btn_ei);
        yBtns[6] = btn_ia = (ToggleButton)findViewById(R.id.btn_ia);
        yBtns[7] = btn_ie = (ToggleButton)findViewById(R.id.btn_ie);
        yBtns[8] = btn_ua = (ToggleButton)findViewById(R.id.btn_ua);
        yBtns[9] = btn_ue = (ToggleButton)findViewById(R.id.btn_ue);
        yBtns[10] = btn_an = (ToggleButton)findViewById(R.id.btn_an);
        yBtns[11] = btn_en = (ToggleButton)findViewById(R.id.btn_en);
        yBtns[12] = btn_ian = (ToggleButton)findViewById(R.id.btn_ian);
        yBtns[13] = btn_in = (ToggleButton)findViewById(R.id.btn_in);
        yBtns[14] = btn_uai = (ToggleButton)findViewById(R.id.btn_uai);
        yBtns[15] = btn_ui = (ToggleButton)findViewById(R.id.btn_ui);
        yBtns[16] = btn_ang = (ToggleButton)findViewById(R.id.btn_ang);
        yBtns[17] = btn_eng = (ToggleButton)findViewById(R.id.btn_eng);
        yBtns[18] = btn_iang = (ToggleButton)findViewById(R.id.btn_iang);
        yBtns[19] = btn_ing = (ToggleButton)findViewById(R.id.btn_ing);
        yBtns[20] = btn_uan = (ToggleButton)findViewById(R.id.btn_uan);
        yBtns[21] = btn_un = (ToggleButton)findViewById(R.id.btn_un);
        yBtns[22] = btn_ao = (ToggleButton)findViewById(R.id.btn_ao);
        yBtns[23] = btn_er = (ToggleButton)findViewById(R.id.btn_er);
        yBtns[24] = btn_iao = (ToggleButton)findViewById(R.id.btn_iao);
        yBtns[25] = btn_iu = (ToggleButton)findViewById(R.id.btn_iu);
        yBtns[26] = btn_uang = (ToggleButton)findViewById(R.id.btn_uang);
        yBtns[27] = btn_uo = (ToggleButton)findViewById(R.id.btn_uo);
        yBtns[28] = btn_o = (ToggleButton)findViewById(R.id.btn_o);
        yBtns[29] = btn_ou = (ToggleButton)findViewById(R.id.btn_ou);
        yBtns[30] = btn_ong = (ToggleButton)findViewById(R.id.btn_ong);
        yBtns[31] = btn_iong = (ToggleButton)findViewById(R.id.btn_iong);
        yBtns[32] = btn_v = (ToggleButton)findViewById(R.id.btn_v);

        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "b");
                    IM.setPinyinS("b");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "p");
                    IM.setPinyinS("p");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "m");
                    IM.setPinyinS("m");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "f");
                    IM.setPinyinS("f");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "d");
                    IM.setPinyinS("d");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "t");
                    IM.setPinyinS("t");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "n");
                    IM.setPinyinS("n");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "l");
                    IM.setPinyinS("l");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "g");
                    IM.setPinyinS("g");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "k");
                    IM.setPinyinS("k");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "h");
                    IM.setPinyinS("h");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "y");
                    IM.setPinyinS("y");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "j");
                    IM.setPinyinS("j");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "q");
                    IM.setPinyinS("q");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "x");
                    IM.setPinyinS("x");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "w");
                    IM.setPinyinS("w");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_zh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "zh");
                    IM.setPinyinS("zh");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ch");
                    IM.setPinyinS("ch");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "sh");
                    IM.setPinyinS("sh");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "c");
                    IM.setPinyinS("c");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "z");
                    IM.setPinyinS("z");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "s");
                    IM.setPinyinS("s");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });
        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllSBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "r");
                    IM.setPinyinS("r");
                }
                else {
                    IM.setPinyinS(null);
                }
            }
        });

        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "a");
                    IM.setPinyinY("a");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "e");
                    IM.setPinyinY("e");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "i");
                    IM.setPinyinY("i");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "u");
                    IM.setPinyinY("u");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ai");
                    IM.setPinyinY("ai");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ei");
                    IM.setPinyinY("ei");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ia");
                    IM.setPinyinY("ia");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ie");
                    IM.setPinyinY("ie");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ua");
                    IM.setPinyinY("ua");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ue");
                    IM.setPinyinY("ue");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_an.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "an");
                    IM.setPinyinY("an");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "en");
                    IM.setPinyinY("en");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ian");
                    IM.setPinyinY("ian");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "in");
                    IM.setPinyinY("in");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_uai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "uai");
                    IM.setPinyinY("uai");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ui");
                    IM.setPinyinY("ui");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ang");
                    IM.setPinyinY("ang");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "eng");
                    IM.setPinyinY("eng");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_iang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "iang");
                    IM.setPinyinY("iang");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ing");
                    IM.setPinyinY("ing");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_uan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "uan");
                    IM.setPinyinY("uan");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "un");
                    IM.setPinyinY("un");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ao");
                    IM.setPinyinY("ao");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_er.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "er");
                    IM.setPinyinY("er");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_iao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "iao");
                    IM.setPinyinY("iao");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_iu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "iu");
                    IM.setPinyinY("iu");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "uang");
                    IM.setPinyinY("uang");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_uo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "uo");
                    IM.setPinyinY("uo");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "o");
                    IM.setPinyinY("o");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ou");
                    IM.setPinyinY("ou");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_ong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "ong");
                    IM.setPinyinY("ong");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_iong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "iong");
                    IM.setPinyinY("iong");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
        btn_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((ToggleButton)v).isChecked()) {
                    clearAllYBtnStatus();
                    ((ToggleButton) v).setChecked(true);
                    Log.d("BUTTON", "v");
                    IM.setPinyinY("v");
                }
                else {
                    IM.setPinyinY(null);
                }
            }
        });
    }

    private void clearAllSBtnStatus() {
        for (ToggleButton btn : sBtns) {
            btn.setChecked(false);
        }
    }

    private void clearAllYBtnStatus() {
        for (ToggleButton btn : yBtns) {
            btn.setChecked(false);
        }
    }

    private void addTextSelectView() {
        textSelectView = (GridView)findViewById(R.id.charSelectView);
    }

    private void testTextSelectView() {
        final String[] testChars = new String[] {
                "啦", "彭", "怕", "开", "即", "了",
                "发", "分", "的", "喜", "我", "上",
                "去", "写", "下", "法", "信", "啊",
                "吖", "飞", "把", "噗", "篇", "个",
                "啦", "彭", "怕", "开", "即", "了",
                "发", "分", "的", "喜", "我", "上",
                "去", "写", "下", "法", "信", "啊",
                "吖", "飞", "把", "噗", "篇", "个",
                "啦", "彭", "怕", "开", "即", "了",
                "发", "分", "的", "喜", "我", "上",
                "去", "写", "下", "法", "信", "啊",
                "吖", "飞", "把", "噗", "篇", "个",
                "啦", "彭", "怕", "开", "即", "了",
                "发", "分", "的", "喜", "我", "上",
                "去", "写", "下", "法", "信", "啊",
                "吖", "飞", "把", "噗", "篇", "个",
                "啦", "彭", "怕", "开", "即", "了",
                "发", "分", "的", "喜", "我", "上",
                "去", "写", "下", "法", "信", "啊",
                "吖", "飞", "把", "噗", "篇", "个",
                "啦", "彭", "怕", "开", "即", "了",
                "发", "分", "的", "喜", "我", "上",
                "去", "写", "下", "法", "信", "啊",
                "吖", "飞", "把", "噗", "篇", "个"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.char_select_view_item, testChars);

        textSelectView.setAdapter(adapter);

        textSelectView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Char", ((TextView) view).getText().toString());
            }
        });
    }

    public void refreshSelection() {
        IM.refreshIndicator();
        ArrayAdapter<String> adapter = IM.getWords();
        textSelectView.setAdapter(adapter);
        textSelectView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CharSequence showing = showField.getText();
                showField.setText(showing.toString() + ((TextView) view).getText());
            }
        });
    }

    public void showAllBtn() {
        for (ToggleButton btn : sBtns) {
            btn.setVisibility(View.VISIBLE);
        }
        for (ToggleButton btn : yBtns) {
            btn.setVisibility(View.VISIBLE);
        }
    }

    public void hideSBtns(String y, Set<String> keys) {
        showAllBtn();
        for (ToggleButton btn: sBtns) {
            String r = btn.getText() + y;
            if (!keys.contains(r)) {
                btn.setVisibility(View.INVISIBLE);
            }
        }
    }

    public void hideYBtns(String s, Set<String> keys) {
        showAllBtn();
        for (ToggleButton btn: yBtns) {
            String r = s + btn.getText();
            if (!keys.contains(r)) {
                btn.setVisibility(View.INVISIBLE);
            }
        }
    }
}
