package com.example.stressleafmentalhealthapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.preference.PreferenceManager;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    int fontSize = 14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.GoToArticle1_btn);
        Button btn2 = (Button) findViewById(R.id.GoToArticle2_btn);
        Button btn3 = (Button) findViewById(R.id.GoToArticle3_btn);
        Button btn4 = (Button) findViewById(R.id.GoToArticle4_btn);
        Button btn5 = (Button) findViewById(R.id.GoToArticle5_btn);

        /*SharedPreferences getsp  = PreferenceManager.getDefaultSharedPreferences(this);
        int savedfontsize = getsp.getInt("SavedFontSize",fontSize);
        if (savedfontsize == fontSize){
            SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("SavedFontSize",fontSize);// saves fontSize
            editor.apply();
        }
        fontSize = savedfontsize;*/
        //TODO: fix saving the fontsize method ^

        /*androidx.constraintlayout.widget.ConstraintLayout layout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(R.id.HomeLayout);
        // TODO: ^ causes the app to crash - https://github.com/richardwei6/Mental-Health-Awareness-App/issues/1
        for( int i = 0; i < layout.getChildCount(); i++ ){

            if( layout.getChildAt( i ) instanceof TextView )
            {
                // change the values of text view here
                TextView text = (TextView) layout.getChildAt( i );
                text.setTypeface(Typeface.createFromAsset(getAssets(),"@fonts/FiraSans-Regular"));

            } // needs to be in a different function
        }*/

    }
    // TODO: when opening list view and articles on a real device, it causes 140+ skipped frames - needs optimization/reduce asset file sizes. https://stackoverflow.com/questions/14678593/the-application-may-be-doing-too-much-work-on-its-main-thread/21126690
    public void setHomeview(View view)
    {
        setContentView((R.layout.activity_main));
    }

    public void setSettingsview(View view) { setContentView((R.layout.settings_layout));
        TextView fontTxt = (TextView) findViewById(R.id.fontSize);
        fontTxt.setText(String.valueOf(fontSize));
        final SeekBar fsk=(SeekBar) findViewById(R.id.fontSlider);
        fsk.setProgress(fontSize);
        fsk.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress!=0){
                    fontSize = progress;
                }
                else{
                    fontSize = 1;
                }
                TextView fontTxt = (TextView) findViewById(R.id.fontSize);
                fontTxt.setText(String.valueOf(fontSize));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public void setListview(View view) { setContentView((R.layout.listview_layout)); }

    public void OpenArticle1(View view)
    {
       setContentView((R.layout.article1_layout));
    }

    public void OpenArticle2(View view)
    {
        setContentView((R.layout.article2_layout));
    }

    public void OpenArticle3(View view)
    {
        setContentView((R.layout.article3_layout));
    }

    public void OpenArticle4(View view)
    {
        setContentView((R.layout.article4_layout));
    }

    public void OpenArticle5(View view)
    {
        setContentView((R.layout.article5_layout));
    }



   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
