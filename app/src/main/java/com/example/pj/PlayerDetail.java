package com.example.pj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_detail);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Intent intent = getIntent();
        String playerName = intent.getStringExtra("playerName");
        String playernationality = intent.getStringExtra("playernationality");
        String Weight_Height = intent.getStringExtra("Weight_Height");
        String playerprice = intent.getStringExtra("playerprice");
        String Birthday = intent.getStringExtra("Birthday");
        String playerImg = intent.getStringExtra("playerImg");


        switch (playerImg) {
            case "gk": imageView.setImageResource(R.drawable.gk); break;
            case "gk1": imageView.setImageResource(R.drawable.gk1); break;
            case "gk2": imageView.setImageResource(R.drawable.gk2); break;
            case "gk3": imageView.setImageResource(R.drawable.gk3); break;
            case "df1": imageView.setImageResource(R.drawable.df1); break;
            case "df2": imageView.setImageResource(R.drawable.df2); break;
            case "df3": imageView.setImageResource(R.drawable.df3); break;
            case "df4": imageView.setImageResource(R.drawable.df4); break;
            case "df5": imageView.setImageResource(R.drawable.df5); break;
            case "df6": imageView.setImageResource(R.drawable.df6); break;
            case "df7": imageView.setImageResource(R.drawable.df7); break;
            case "df8": imageView.setImageResource(R.drawable.df8); break;
            case "df9": imageView.setImageResource(R.drawable.df9); break;
            case "df10": imageView.setImageResource(R.drawable.df10); break;
            case "cm1": imageView.setImageResource(R.drawable.cm1); break;
            case "cm2": imageView.setImageResource(R.drawable.cm2); break;
            case "cm3": imageView.setImageResource(R.drawable.cm3); break;
            case "cm4": imageView.setImageResource(R.drawable.cm4); break;
            case "cm5": imageView.setImageResource(R.drawable.cm5); break;
            case "cm6": imageView.setImageResource(R.drawable.cm6); break;
            case "cm7": imageView.setImageResource(R.drawable.cm7); break;
            case "cm8": imageView.setImageResource(R.drawable.cm8); break;
            case "cm10": imageView.setImageResource(R.drawable.cm10); break;
            case "cm11": imageView.setImageResource(R.drawable.cm11); break;
            case "cm12": imageView.setImageResource(R.drawable.cm12); break;
            case "at1": imageView.setImageResource(R.drawable.at1); break;
            case "at2": imageView.setImageResource(R.drawable.at2); break;
            case "at3": imageView.setImageResource(R.drawable.at3); break;
            case "at4": imageView.setImageResource(R.drawable.at4); break;
            case "at5": imageView.setImageResource(R.drawable.at5); break;
            case "at6": imageView.setImageResource(R.drawable.at6); break;
            case "at7": imageView.setImageResource(R.drawable.at7); break;
            case "at8": imageView.setImageResource(R.drawable.at8); break;

        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(playerprice);

        TextView textView1 = (TextView) findViewById(R.id.textView2);
        textView1.setText(Birthday);

        TextView textView2 = (TextView) findViewById(R.id.textView3);
        textView2.setText(playernationality);

        TextView textView3 = (TextView) findViewById(R.id.textView4);
        textView3.setText(Weight_Height);

        TextView textView4 = (TextView) findViewById(R.id.textView5);
        textView4.setText(playerName);

    }
}
