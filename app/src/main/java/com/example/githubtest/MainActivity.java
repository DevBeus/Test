package com.example.githubtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// First change

//Comment by DevBeus on master
//Another change
//Another change by DevBeus

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toggleText(View view) {
        Button btn = (Button) findViewById(R.id.button);
        String btnString = btn.getText().toString();

        if (btnString.equals("OK")) {
            btn.setText("Toggle");
        }
        else {
            btn.setText("OK");
        }

    }
}
