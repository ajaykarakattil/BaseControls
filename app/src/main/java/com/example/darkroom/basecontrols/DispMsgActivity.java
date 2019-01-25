package com.example.darkroom.basecontrols;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DispMsgActivity extends AppCompatActivity {
public static String MY_KEY="Key is a key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp_msg);
        Intent intent=getIntent();
        String msg=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tv=(TextView)findViewById(R.id.textView2);
        tv.setText(msg);

    }
    public void ac1(View v){
        Intent resIntent=new Intent(this,Result_next.class);
        TextView t =(TextView)findViewById(R.id.textView2);
        String nextMsg= t.getText().toString();
        resIntent.putExtra(MY_KEY,nextMsg);
        startActivity(resIntent);



    }
}
