package com.example.darkroom.basecontrols;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result_next extends AppCompatActivity {
public String q;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_next);
        Intent newIntent=getIntent();
        q=newIntent.getStringExtra(DispMsgActivity.MY_KEY);
        TextView newTxt=(TextView)findViewById(R.id.textView);
        String disp="Your message is : "+q;
        newTxt.setText(disp);

    }
    public void webSearch(View v){
        Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY,q);
        startActivity(intent);

    }
}
