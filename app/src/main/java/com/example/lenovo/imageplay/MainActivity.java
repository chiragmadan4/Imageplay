package com.example.lenovo.imageplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count=1;
    public void animate(View view)
    {
        ImageView micky = findViewById(R.id.micky);
        ImageView bart = findViewById(R.id.bart);
        TextView t1 = findViewById(R.id.textView);
        micky.animate()
                .scaleX(0.1f)
                .scaleY(0.1f)
                .setDuration(1000)
                .translationXBy(-1000f)
                .setDuration(2000);
        bart.animate()
                .translationXBy(-1000f)
                .setDuration(2000)
                .scaleX(1.0f)
                .scaleY(1.0f).setDuration(2000);
        t1.setText("CLICK AGAIN");
        count++;
        if(count>3)
        {
            bart.animate()
                    .translationXBy(-2000f)
                    .setDuration(2500);
            t1.setText("It's too much..BYE!");
        }
    }

    public void animate2(View view)
    {
        ImageView micky = findViewById(R.id.micky);
        ImageView bart = findViewById(R.id.bart);
        TextView t1 = findViewById(R.id.textView);
        micky.animate()
                .translationXBy(1000f)
                .scaleX(0.75f)
                .scaleY(0.75f)
                .setDuration(2000);
        bart.animate()
                .translationXBy(1000f)
                .scaleX(0.2f)
                .scaleY(0.2f)
                .setDuration(2000);
        t1.setText("CLICK AGAIN");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bart=findViewById(R.id.bart);
        bart.setTranslationX(1000f);
        bart.animate().scaleX(0.2f).scaleY(0.2f).setDuration(0);
        ImageView micky = findViewById(R.id.micky);
        micky.animate()
                .scaleX(0.75f)
                .scaleY(0.75f)
                .setDuration(0);

    }

}
