package com.example.maryamebouhajeb.tp3partie2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
public class ThirdActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nv);
        Intent i = getIntent();
    }
}
