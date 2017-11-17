package com.example.madaim.ex5;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import static java.security.AccessController.getContext;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.RL);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.LL);
        ll1.setOrientation(LinearLayout.VERTICAL);
        ll1.setBackgroundResource(R.drawable.border);
        RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(180));
        rlp.addRule(RelativeLayout.BELOW, R.id.intro);
        rlp.setMargins(0, dpToPx(20), 0, dpToPx(20));
        TextView tv = new TextView(this);
        tv.setId(R.id.TV);
        tv.setText(R.string.secintro);
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(100));
        llp.setMargins(0, 0, dpToPx(20), 0);
        LinearLayout ll2 = new LinearLayout(this);
        ll2.setId(R.id.ll2);
        ll2.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams llp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, dpToPx(20));
        CheckBox cb = new CheckBox(this);
        CheckBox cb2 = new CheckBox(this);
        cb.setId(R.id.CB);
        cb2.setId(R.id.CB2);
        cb.setText(R.string.cb);
        cb2.setText(R.string.cb2);
        cb.setLayoutParams(llp2);
        cb2.setLayoutParams(llp2);
        rl1.addView(ll1, rlp);
        ll1.addView(tv, llp);
        ll1.addView(cb, llp2);
        ll1.addView(cb2, llp2);
    }

    public void click(View v) {
        FrameLayout fl = (FrameLayout) findViewById(R.id.fl);
        fl.removeAllViews();
        if(((ToggleButton)v).isChecked()==true) {
            LinearLayout ll5 = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout1, null);
            fl.addView(ll5);
        }
        else
        { LinearLayout ll6= (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout2,null);
            fl.addView(ll6);
        }

    }


    public int dpToPx(int dp) {
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        return (int) Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));


    }
}
