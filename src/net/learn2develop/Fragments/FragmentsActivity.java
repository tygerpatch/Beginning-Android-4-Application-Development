package net.learn2develop.Fragments;

import net.learn2develop.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentsActivity extends Activity {

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragments);
    /*
     * FragmentManager fragmentManager = getFragmentManager();
     * FragmentTransaction fragmentTransaction =
     * fragmentManager.beginTransaction();
     * 
     * //---get the current display info--- WindowManager wm =
     * getWindowManager(); Display d = wm.getDefaultDisplay(); if (d.getWidth()
     * > d.getHeight()) { //---landscape mode--- Fragment1 fragment1 = new
     * Fragment1(); // android.R.id.content refers to the content // view of the
     * activity fragmentTransaction.replace( android.R.id.content, fragment1); }
     * else { //---portrait mode--- Fragment2 fragment2 = new Fragment2();
     * fragmentTransaction.replace( android.R.id.content, fragment2); } //---add
     * to the back stack--- fragmentTransaction.addToBackStack(null);
     * fragmentTransaction.commit();
     */
  }

  public void onClick(View v) {
    TextView lbl = (TextView) findViewById(R.id.lblFragment1);
    Toast.makeText(this, lbl.getText(), Toast.LENGTH_SHORT).show();
  }
}