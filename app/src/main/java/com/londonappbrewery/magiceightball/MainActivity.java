package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Want to Make decision quickly?Think about question and let me predict about your future!",Toast.LENGTH_LONG).show();

         final int images[]={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        final TextView texthead=(TextView)findViewById(R.id.texthead);
        final ImageView ballimage=(ImageView)findViewById(R.id.ball_image);
        ballimage.setVisibility(View.GONE);
        Button askbut=(Button)findViewById(R.id.askbutton);
        askbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r=new Random();
                int ranum=r.nextInt(5);
                ballimage.setVisibility(View.VISIBLE);
                ballimage.setImageResource(images[ranum]);

            }
        });
    }
}
