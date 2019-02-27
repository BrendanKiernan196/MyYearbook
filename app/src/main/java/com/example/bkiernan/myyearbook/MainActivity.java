package com.example.bkiernan.myyearbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.github_prof);

        webView = findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); //XSS shouldn't be an issue given the hard-coded URL
    }

    public void loadSideActivity(View view) {
        Intent sideActIntent = new Intent(this, SideActivity.class);
        startActivity(sideActIntent);
    }

    public void loadWebView(View view) {
        webView.loadUrl("https://www.google.com/");
    }
}
