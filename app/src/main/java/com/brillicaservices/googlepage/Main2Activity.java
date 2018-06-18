package com.brillicaservices.googlepage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.view.View;
import android.webkit.WebChromeClient;

public class Main2Activity extends AppCompatActivity {
    ProgressBar pb;
    WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pb = (ProgressBar) findViewById(R.id.progress_bar);
        wb = (WebView) findViewById(R.id.wb1);

        wb.loadUrl("https://www.google.com");
        wb.setWebChromeClient(new WebChromeClient()
        {
            public void onProgressChanged(WebView wbvw,int progress)
            {
                if (progress == 100) {
                    pb.setVisibility(View.GONE);
                    wb.setVisibility(View.VISIBLE);
                }
            }
        }
        );


    }
}
