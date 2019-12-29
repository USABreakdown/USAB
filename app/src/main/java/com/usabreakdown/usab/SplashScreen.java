package com.usabreakdown.usab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SplashScreen extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

        try {
            //set time in mili
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


