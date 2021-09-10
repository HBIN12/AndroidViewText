package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   private TextView titleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  titleView=(TextView) findViewById(R.id.titleView);
        titleView.setText(Html.fromHtml(("欢迎参加<font color='red'>手机软件</>设计赛")));*/
    }
}
