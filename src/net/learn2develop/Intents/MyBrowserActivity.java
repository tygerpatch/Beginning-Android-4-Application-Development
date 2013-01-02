package net.learn2develop.Intents;

import net.learn2develop.R;
import net.learn2develop.R.layout;
import net.learn2develop.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyBrowserActivity extends Activity {

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.browser);

      Uri url = getIntent().getData();
      WebView webView = (WebView) findViewById(R.id.WebView01);
      webView.setWebViewClient(new Callback());
      webView.loadUrl(url.toString());
  }

  private class Callback extends WebViewClient {
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
          return(false);
      }
  }
}
