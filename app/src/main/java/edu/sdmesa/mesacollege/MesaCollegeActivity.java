package edu.sdmesa.mesacollege;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MesaCollegeActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesa_college);

        WebView mesaView = (WebView) findViewById(R.id.webViewMesa);

        mesaView.setWebViewClient(new WebViewClient());

        mesaView.loadUrl("http://www.sdmesa.edu");

    }
}