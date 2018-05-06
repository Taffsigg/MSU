package com.example.tafadzwa.midlandsstateuniversity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Apply extends AppCompatActivity {

    WebView OurBrow;
    ProgressBar barr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);

        barr =(ProgressBar) findViewById(R.id.progressbarapply);


        OurBrow=(WebView) findViewById(R.id.webviewapply);
        OurBrow.setWebViewClient(new MyBrowser());
        OurBrow.setWebViewClient(new Myb());
        OurBrow.getSettings().setJavaScriptEnabled(true);
        OurBrow.loadUrl("http://www.msu.ac.zw");
    }

    private class Myb extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            barr.setVisibility(View.VISIBLE);
            setTitle("Loading to Apply.....");
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            barr.setVisibility(View.GONE);
            setTitle(view.getTitle());
        }
    }

    private class MyBrowser extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return  true;
        }
    }
}


