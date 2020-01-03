package com.example.stressleafmentalhealthapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.GoToArticle1_btn);
        btn2 = (Button) findViewById(R.id.GoToArticle2_btn);
        btn3 = (Button) findViewById(R.id.GoToArticle3_btn);
        btn4 = (Button) findViewById(R.id.GoToArticle4_btn);
        btn5 = (Button) findViewById(R.id.GoToArticle5_btn);

        LinearLayout layout = (LinearLayout) findViewById(R.id.HomeLayout);

        for( int i = 0; i < layout.getChildCount(); i++ ){

            if( layout.getChildAt( i ) instanceof TextView )
            {
                // change the values of text view here
                TextView text = (TextView) layout.getChildAt( i );
                text.setTypeface(Typeface.createFromAsset(getAssets(),"@fonts/FiraSans-Regular"));

            }
        }
    }

    public void setHomeview(View view)
    {
        setContentView((R.layout.activity_main));
    }

    public void setSettingsview(View view) { setContentView((R.layout.settings_layout)); }

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

    @Override
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
    }
}
