package net.learn2develop.HelloWorld;

import net.learn2develop.R;
import android.app.Activity;
import android.os.Bundle;

public class HelloWorldActivity extends Activity {
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_hello_world);
  }
}
