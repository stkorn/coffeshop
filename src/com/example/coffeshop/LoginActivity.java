package com.example.coffeshop;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class LoginActivity extends Activity {

    LinearLayout bar1;
    LinearLayout bar2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bar1 = (LinearLayout) findViewById(R.id.bar1);
        bar2 = (LinearLayout) findViewById(R.id.bar2);

    }
}
