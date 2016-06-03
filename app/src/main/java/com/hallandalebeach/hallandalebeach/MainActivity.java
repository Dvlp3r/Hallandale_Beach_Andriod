package com.hallandalebeach.hallandalebeach;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    WebView hallandaleWebView;
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        hallandaleWebView = (WebView) findViewById(R.id.wvHallandaleSite);
        hallandaleWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = hallandaleWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        backButton = (ImageButton) findViewById(R.id.ibBackButton);
    }

    public void showWebView() {
        backButton.setVisibility(View.VISIBLE);
        hallandaleWebView.setVisibility(View.VISIBLE);
    }

    public void hideWebView(View v) {
        backButton.setVisibility(View.GONE);
        hallandaleWebView.setVisibility(View.GONE);
        hallandaleWebView.loadUrl("about:blank");
    }

    public void loadPublicRecords(View v) {
        hallandaleWebView.loadUrl("https://hbeach.formstack.com/forms/publicrecordsrequest");
        showWebView();
    }

    public void loadPublicComments(View v) {
        hallandaleWebView.loadUrl("https://hbeach.formstack.com/forms/publicparticipation");
        showWebView();
    }

    public void loadVisitorTracker(View v) {
        hallandaleWebView.loadUrl("http://www.cohb.org/visit");
        showWebView();
    }

    public void loadCalendar(View v) {
        hallandaleWebView.loadUrl("http://www.cohb.org/index.aspx?NID=226");
        showWebView();
    }

    public void loadAboutUs(View v) {
        hallandaleWebView.loadUrl("http://www.cohb.org/index.aspx?NID=16");
        showWebView();
    }



}
