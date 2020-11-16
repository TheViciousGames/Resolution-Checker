package com.theviciousgames.resolutionchecker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView resolutionTextView,realResolutionTextView;
    private Button refreshButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declareVars();
        getResolution();
        buttonsFunction();
    }

    protected void declareVars()
    {
        resolutionTextView=findViewById(R.id.resolutionTextView);
        refreshButton=findViewById(R.id.refreshButton);
        realResolutionTextView=findViewById(R.id.realResolutionTextView);
    }

    protected void buttonsFunction()
    {
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getResolution();
                Tools.Utils.vibrate(MainActivity.this);
            }
        });
    }

    protected void getResolution()
    {
        resolutionTextView.setText(Tools.Utils.getResolution(MainActivity.this));
        realResolutionTextView.setText(Tools.Utils.getRealResolution(this));
    }
}