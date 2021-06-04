package id.kotlin.quantumlibrary

import android.view.View
import android.webkit.WebView

class AboutActivity {
    val mWebView = findViewById<View>(R.id.webView) as WebView
    mWebView.loadUrl("http://one.synergize.co/")
}