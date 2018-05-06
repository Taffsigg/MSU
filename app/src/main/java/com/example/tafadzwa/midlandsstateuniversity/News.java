package com.example.tafadzwa.midlandsstateuniversity;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class News extends AppCompatActivity {


    WebView OurBrow;

    ProgressBar barr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        barr = (ProgressBar)findViewById(R.id.progressbar44);


        OurBrow=(WebView) findViewById(R.id.webviewnews);
        OurBrow.setWebViewClient(new MyBrowser());
        OurBrow.setWebViewClient(new Myb());
        OurBrow.getSettings().setJavaScriptEnabled(true);
        OurBrow.loadUrl("https://ww4.msu.ac.zw/notice/");


    }

    private class Myb extends WebViewClient {

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            barr.setVisibility(View.VISIBLE);
            setTitle("Loading News.....");
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

