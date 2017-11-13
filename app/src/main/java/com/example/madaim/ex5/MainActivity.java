package com.example.madaim.ex5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl1= (RelativeLayout) findViewById(R.id.RL);
        LinearLayout ll1=new LinearLayout(this);
        ll1.setId(R.id.LL);
        ll1.setLayoutParams(new LinearLayout.LayoutParams(100,100));
        ll1.setOrientation(LinearLayout.HORIZONTAL);
        rl1.addView(ll1);


    }


}
