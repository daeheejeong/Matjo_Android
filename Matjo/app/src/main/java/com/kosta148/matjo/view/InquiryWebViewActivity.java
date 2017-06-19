package com.kosta148.matjo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kosta148.matjo.R;

/**
 * Created by kota on 2017-06-17.
 */

public class InquiryWebViewActivity extends AppCompatActivity {
    Context context;
    WebView inquiryView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry);
        context = getApplicationContext();

        inquiryView = (WebView)findViewById(R.id.inquiryWebView);
        //자바스트립트 사용 셋팅
        inquiryView.getSettings().setLoadWithOverviewMode(true); // 웹뷰에서 페이지가 확대되는 문제해결
        inquiryView.getSettings().setUseWideViewPort(true);
        inquiryView.setInitialScale(1); // 기기별 화면사이트에 맞게 조절
        inquiryView.setWebViewClient(new WebViewClientHandler());
        inquiryView.getSettings().setJavaScriptEnabled(true);
        inquiryView.loadUrl("http://ldh66210.cafe24.com/inquiry/selectInquiryListMobile.do");
    }

    class WebViewClientHandler extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
        }
        @Override
        public void onPageFinished(WebView view, String url) {
        }
    }
}
