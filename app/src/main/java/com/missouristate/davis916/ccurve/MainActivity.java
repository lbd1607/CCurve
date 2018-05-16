package com.missouristate.davis916.ccurve;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Laura Davis CIS 262-902
 * 22 March 2018
 *
 * This app uses the canvas and some math to
 * draw fractal images with the
 * push of a button.
 */

public class MainActivity extends Activity {

    private TextView levelsTV;
    private Integer level;
    private ConstraintLayout constraintLayout;
    private FractalView fractalView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        fractalView = new FractalView(this);
        constraintLayout.addView(fractalView, 0);

        level = 1;
        levelsTV = (TextView) findViewById(R.id.textView);
    }//end onCreate()

    public void drawFractal(View view){
        fractalView.level = level;
        fractalView.invalidate();
    }//end drawFractal

    //Numbers for step up and step down can range from 1 through 14
    public void stepUp(View view){
        if(level < 14){
            level++;
            levelsTV.setText(level.toString());
        }
    }//end stepUp()

    public void stepDown(View view){
        if(level > 1){
            level--;
            levelsTV.setText(level.toString());
        }
    }//end stepUp()

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }//end createOptionsMenu

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button,
        //as long as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }//end onOptionsItemSelected

}//end MainActivity class
