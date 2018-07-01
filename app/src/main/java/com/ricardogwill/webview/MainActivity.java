package com.ricardogwill.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://Lucidys.com");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    //Create the basics of this (minus if/else) through "Ctrl + O" and searching for "onBackPressed"
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        }else{
            super.onBackPressed();
        }

    }
}
