package com.example.stressleafmentalhealthapp;

import android.app.Activity;
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
    int fontSize = 14; // default value
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sp = getSharedPreferences("font_pref", Activity.MODE_PRIVATE);
        if (sp.contains("font_key")){
            int saved_fontSize = sp.getInt("font_key", fontSize);
            fontSize = saved_fontSize;
        }
        else{
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("font_key", fontSize);
            editor.commit();
        }
    }
    public void setHomeview(View view)
    {
                setContentView(R.layout.activity_main);
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
                SharedPreferences sp = getSharedPreferences("font_pref", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putInt("font_key", fontSize);
                editor.commit();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    public void setListview(View view) { setContentView((R.layout.listview_layout));
        TextView b1  = (TextView) findViewById(R.id.listview_layout_GoToArticle1_btn);
        b1.setTextSize(fontSize);
        TextView b2  = (TextView) findViewById(R.id.listview_layout_GoToArticle2_btn);
        b2.setTextSize(fontSize);
        TextView b3  = (TextView) findViewById(R.id.listview_layout_GoToArticle3_btn);
        b3.setTextSize(fontSize);
        TextView b4  = (TextView) findViewById(R.id.listview_layout_GoToArticle4_btn);
        b4.setTextSize(fontSize);
        TextView b5  = (TextView) findViewById(R.id.listview_layout_GoToArticle5_btn);
        b5.setTextSize(fontSize);
        TextView b6  = (TextView) findViewById(R.id.listview_layout_GoToArticle6_btn);
        b6.setTextSize(fontSize);
    } // TODO: Fix list view button for article 6.

    public void resetSettings(View view)
    {
        fontSize = 14;
        TextView fontTxt = (TextView) findViewById(R.id.fontSize);
        fontTxt.setText(String.valueOf(fontSize));
        final SeekBar fsk=(SeekBar) findViewById(R.id.fontSlider);
        fsk.setProgress(fontSize);
        SharedPreferences sp = getSharedPreferences("font_pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("font_key", fontSize);
        editor.commit();
    }


    public void OpenArticle1(View view)
    {
       setContentView((R.layout.article1_layout));
       TextView main_article_text = (TextView) findViewById(R.id.Article1Text);
       main_article_text.setTextSize(fontSize);
    }

    public void OpenArticle2(View view)
    {
        setContentView((R.layout.article2_layout));
        TextView main_article_text = (TextView) findViewById(R.id.Article2Text);
        main_article_text.setTextSize(fontSize);
    }

    public void OpenArticle3(View view)
    {
        setContentView((R.layout.article3_layout));
        TextView main_article_text = (TextView) findViewById(R.id.Article3Text);
        main_article_text.setTextSize(fontSize);
    }

    public void OpenArticle4(View view)
    {
        setContentView((R.layout.article4_layout));
        TextView main_article_text = (TextView) findViewById(R.id.Article4Text);
        main_article_text.setTextSize(fontSize);
    }

    public void OpenArticle5(View view)
    {
        setContentView((R.layout.article5_layout));
        TextView main_article_text = (TextView) findViewById(R.id.Article5Text);
        main_article_text.setTextSize(fontSize);
    }

    public void OpenArticle6(View view)
    {
        setContentView((R.layout.article6_layout));
        TextView main_article_text = (TextView) findViewById(R.id.Article6Text);
        main_article_text.setTextSize(fontSize);
    }

    public void setCreditView(View view)
    {
        setContentView((R.layout.credits));
    }
    public void setTAAView(View view)
    {
        setContentView((R.layout.termsandagreements));
        TextView main_article_text = (TextView) findViewById(R.id.tagText);
        main_article_text.setTextSize(fontSize);
    }
}
