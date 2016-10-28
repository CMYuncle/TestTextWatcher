package com.test.cmyuncle.testtextwatcher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.id_switcher)
    TextSwitchView idSwitcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        idSwitcher = (TextSwitchView)findViewById(R.id.id_switcher);
 idSwitcher.setTextStillTime(1000);
    }
}
