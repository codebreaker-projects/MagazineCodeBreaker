package br.com.codebreaker.magazinecodebreaker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;

public class WebViewClientImpl extends android.webkit.WebViewClient {

    private Activity activity = null;



    public WebViewClientImpl(Activity activity){
        this.activity = activity;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView webView, String url){
        if(url.contains("magazinevoce.com.br")) return false;

        Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse(url));

        activity.startActivity(intent);

        return true;
    }
}
