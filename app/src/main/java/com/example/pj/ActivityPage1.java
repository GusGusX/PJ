package com.example.pj;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ActivityPage1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Altay Bayindir");
                intent.putExtra("Weight_Height", "Height: 198cm ");
                intent.putExtra("playernationality", "Nationality: Turkey");
                intent.putExtra("playerprice", "Price: €11.00m");
                intent.putExtra("playerImg", "gk");
                intent.putExtra("Birthday", "Date of Birth: " + "14/04/1998");
                startActivity(intent);
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Tom Heaton");
                intent.putExtra("Weight_Height", "Height: 188cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €500k ");
                intent.putExtra("playerImg", "gk1");
                intent.putExtra("Birthday", "Date of Birth: " + "15/04/1986");
                startActivity(intent);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Radek Vítek");
                intent.putExtra("Weight_Height", "Height: 198cm ");
                intent.putExtra("playernationality", "Nationality: Czech Republic ");
                intent.putExtra("playerprice", "Price: €150k ");
                intent.putExtra("playerImg", "gk2");
                intent.putExtra("Birthday", "Date of Birth: " + "24/10/2003");
                startActivity(intent);
            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: André Onana ");
                intent.putExtra("Weight_Height", "Height: 190cm ");
                intent.putExtra("playernationality", "Nationality: Cameroon");
                intent.putExtra("playerprice", "Price: €35.00m ");
                intent.putExtra("playerImg", "gk3");
                intent.putExtra("Birthday", "Date of Birth: " + "02/04/1996");
                startActivity(intent);
            }
        });
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Victor Lindelöf");
                intent.putExtra("Weight_Height", "Height: 187cm ");
                intent.putExtra("playernationality", "Nationality: Sweden");
                intent.putExtra("playerprice", "Price: €18.00m ");
                intent.putExtra("playerImg", "df1");
                intent.putExtra("Birthday", "Date of Birth: " + "17/07/1994");
                startActivity(intent);
            }
        });
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Harry Maguire ");
                intent.putExtra("Weight_Height", "Height: 194cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €20.00m ");
                intent.putExtra("playerImg", "df2");
                intent.putExtra("Birthday", "Date of Birth: " + "05/03/1993");
                startActivity(intent);
            }
        });
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Lisandro Martínez");
                intent.putExtra("Weight_Height", "Height: 175cm ");
                intent.putExtra("playernationality", "Nationality: Argentina ");
                intent.putExtra("playerprice", "Price: €50.00m ");
                intent.putExtra("playerImg", "df3");
                intent.putExtra("Birthday", "Date of Birth: " + "18/01/1998");
                startActivity(intent);
            }
        });
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);

        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Tyrell Malacia ");
                intent.putExtra("Weight_Height", "Height: 170cm ");
                intent.putExtra("playernationality", "Nationality: Netherlands");
                intent.putExtra("playerprice", "Price: €22.00m ");
                intent.putExtra("playerImg", "df4");
                intent.putExtra("Birthday", "Date of Birth: " + "17/08/1999");
                startActivity(intent);
            }
        });
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);

        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Raphaël Varane");
                intent.putExtra("Weight_Height", "Height: 191cm ");
                intent.putExtra("playernationality", "Nationality: France");
                intent.putExtra("playerprice", "Price: €35.00m ");
                intent.putExtra("playerImg", "df5");
                intent.putExtra("Birthday", "Date of Birth: " + "25/04/1993");
                startActivity(intent);
            }
        });
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);

        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Diogo Dalot");
                intent.putExtra("Weight_Height", "Height: 183cm ");
                intent.putExtra("playernationality", "Nationality: Portugal");
                intent.putExtra("playerprice", "Price: €40.00m ");
                intent.putExtra("playerImg", "df6");
                intent.putExtra("Birthday", "Date of Birth: " + "18/03/1999");
                startActivity(intent);
            }
        });
        ImageView imageView11 = (ImageView) findViewById(R.id.imageView11);

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Luke Shaw");
                intent.putExtra("Weight_Height", "Height: 185cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €42.00m ");
                intent.putExtra("playerImg", "df7");
                intent.putExtra("Birthday", "Date of Birth: " + "12/07/1995");
                startActivity(intent);
            }
        });
        ImageView imageView12 = (ImageView) findViewById(R.id.imageView12);

        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Aaron Wan-Bissaka");
                intent.putExtra("Weight_Height", "Height: 183cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €25.00m ");
                intent.putExtra("playerImg", "df8");
                intent.putExtra("Birthday", "Date of Birth: " + "26/11/1997");
                startActivity(intent);
            }
        });
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);

        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Jonny Evans");
                intent.putExtra("Weight_Height", "Height: 188cm ");
                intent.putExtra("playernationality", "Nationality: Northern Ireland");
                intent.putExtra("playerprice", "Price: €2.00m ");
                intent.putExtra("playerImg", "df9");
                intent.putExtra("Birthday", "Date of Birth: " + "03/01/1988");
                startActivity(intent);
            }
        });
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);

        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Sergio Reguilón");
                intent.putExtra("Weight_Height", "Height: 178cm ");
                intent.putExtra("playernationality", "Nationality: Spain");
                intent.putExtra("playerprice", "Price: €10.00m ");
                intent.putExtra("playerImg", "df10");
                intent.putExtra("Birthday", "Date of Birth: " + "16/12/1996");
                startActivity(intent);
            }
        });
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);

        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Bruno Fernandes");
                intent.putExtra("Weight_Height", "Height: 179cm ");
                intent.putExtra("playernationality", "Nationality: Portugal");
                intent.putExtra("playerprice", "Price: €75.00m ");
                intent.putExtra("playerImg", "cm1");
                intent.putExtra("Birthday", "Date of Birth: " + "08/09/1994");
                startActivity(intent);
            }
        });
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);

        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Christian Eriksen");
                intent.putExtra("Weight_Height", "Height: 182cm ");
                intent.putExtra("playernationality", "Nationality: Denmark");
                intent.putExtra("playerprice", "Price: €22.00m ");
                intent.putExtra("playerImg", "cm2");
                intent.putExtra("Birthday", "Date of Birth: " + "14/02/1992");
                startActivity(intent);
            }
        });
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);

        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Casemiro ");
                intent.putExtra("Weight_Height", "Height: 185cm ");
                intent.putExtra("playernationality", "Nationality: Brazil");
                intent.putExtra("playerprice", "Price: €40.00m ");
                intent.putExtra("playerImg", "cm3");
                intent.putExtra("Birthday", "Date of Birth: " + "23/02/1992" );
                startActivity(intent);
            }
        });
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);

        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Facundo Pellistri");
                intent.putExtra("Weight_Height", "Height: 175cm ");
                intent.putExtra("playernationality", "Nationality: Uruguay");
                intent.putExtra("playerprice", "Price: €6.00m ");
                intent.putExtra("playerImg", "cm4");
                intent.putExtra("Birthday", "Date of Birth: " + "20/12/2001" );
                startActivity(intent);
            }
        });
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);

        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Donny van de Beek");
                intent.putExtra("Weight_Height", "Height: 184cm ");
                intent.putExtra("playernationality", "Nationality: Netherlands");
                intent.putExtra("playerprice", "Price: €13.00m ");
                intent.putExtra("playerImg", "cm5");
                intent.putExtra("Birthday", "Date of Birth: " + "18/04/1997" );
                startActivity(intent);
            }
        });
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);

        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Scott McTominay");
                intent.putExtra("Weight_Height", "Height: 193cm ");
                intent.putExtra("playernationality", "Nationality: Scotland");
                intent.putExtra("playerprice", "Price: €25.00m ");
                intent.putExtra("playerImg", "cm6");
                intent.putExtra("Birthday", "Date of Birth: " + "08/09/1994" );
                startActivity(intent);
            }
        });
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);

        imageView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Hannibal Mejbri");
                intent.putExtra("Weight_Height", "Height: 177cm ");
                intent.putExtra("playernationality", "Nationality: Tunisia");
                intent.putExtra("playerprice", "Price: €8.00m ");
                intent.putExtra("playerImg", "cm7");
                intent.putExtra("Birthday", "Date of Birth: " + "21/01/2003" );
                startActivity(intent);
            }
        });
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);

        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Kobbie Mainoo");
                intent.putExtra("Weight_Height", "Height: 175cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €800k ");
                intent.putExtra("playerImg", "cm8");
                intent.putExtra("Birthday", "Date of Birth: " + "19/04/2005");
                startActivity(intent);
            }
        });
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView24);

        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Mason Mount");
                intent.putExtra("Weight_Height", "Height: 181cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €60.00m ");
                intent.putExtra("playerImg", "cm10");
                intent.putExtra("Birthday", "Date of Birth: " + "10/01/1999");
                startActivity(intent);
            }
        });
        ImageView imageView24 = (ImageView) findViewById(R.id.imageView25);

        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Daniel Gore");
                intent.putExtra("Weight_Height", "Height: unknow ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: unknow ");
                intent.putExtra("playerImg", "cm11");
                intent.putExtra("Birthday", "Date of Birth: " + "26/09/2004");
                startActivity(intent);
            }
        });
        ImageView imageView25 = (ImageView) findViewById(R.id.imageView26);

        imageView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Sofyan Amrabat");
                intent.putExtra("Weight_Height", "Height: 183cm ");
                intent.putExtra("playernationality", "Nationality: Morocco");
                intent.putExtra("playerprice", "Price: €30.00m ");
                intent.putExtra("playerImg", "cm12");
                intent.putExtra("Birthday", "Date of Birth: " + "21/08/1996");
                startActivity(intent);
            }
        });
        ImageView imageView26 = (ImageView) findViewById(R.id.imageView28);

        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Anthony Martial");
                intent.putExtra("Weight_Height", "Height: 181cm ");
                intent.putExtra("playernationality", "Nationality: France ");
                intent.putExtra("playerprice", "Price: €15.00m ");
                intent.putExtra("playerImg", "at1");
                intent.putExtra("Birthday", "Date of Birth: " + "05/12/1995 ");
                startActivity(intent);
            }
        });
        ImageView imageView27 = (ImageView) findViewById(R.id.imageView29);

        imageView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Marcus Rashford");
                intent.putExtra("Weight_Height", "Height: 185cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €80.00m ");
                intent.putExtra("playerImg", "at2");
                intent.putExtra("Birthday", "Date of Birth: " + "31/10/1997");
                startActivity(intent);
            }
        });
        ImageView imageView28 = (ImageView) findViewById(R.id.imageView30);

        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Antony ");
                intent.putExtra("Weight_Height", "Height: 174cm ");
                intent.putExtra("playernationality", "Nationality: Brazil");
                intent.putExtra("playerprice", "Price: €60.00m ");
                intent.putExtra("playerImg", "at3");
                intent.putExtra("Birthday", "Date of Birth: " + "24/02/2000");
                startActivity(intent);
            }
        });
        ImageView imageView29 = (ImageView) findViewById(R.id.imageView31);

        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Jadon Sancho");
                intent.putExtra("Weight_Height", "Height: 180cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €45.00m ");
                intent.putExtra("playerImg", "at4");
                intent.putExtra("Birthday", "Date of Birth: " + "25/03/2000");
                startActivity(intent);
            }
        });
        ImageView imageView30 = (ImageView) findViewById(R.id.imageView32);

        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Alejandro Garnacho ");
                intent.putExtra("Weight_Height", "Height: 180cm ");
                intent.putExtra("playernationality", "Nationality: Argentina");
                intent.putExtra("playerprice", "Price: €25.00m ");
                intent.putExtra("playerImg", "at5");
                intent.putExtra("Birthday", "Date of Birth: " + "01/07/2004");
                startActivity(intent);
            }
        });
        ImageView imageView31 = (ImageView) findViewById(R.id.imageView33);

        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Amad Diallo ");
                intent.putExtra("Weight_Height", "Height: 173cm ");
                intent.putExtra("playernationality", "Nationality: Ivory Coast");
                intent.putExtra("playerprice", "Price: €4.00m ");
                intent.putExtra("playerImg", "at6");
                intent.putExtra("Birthday", "Date of Birth: " + "11/07/2002");
                startActivity(intent);
            }
        });
        ImageView imageView32 = (ImageView) findViewById(R.id.imageView34);

        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Shola Shoretire ");
                intent.putExtra("Weight_Height", "Height: 171cm ");
                intent.putExtra("playernationality", "Nationality: England");
                intent.putExtra("playerprice", "Price: €4.00m ");
                intent.putExtra("playerImg", "at7");
                intent.putExtra("Birthday", "Date of Birth: " + "02/02/2004");
                startActivity(intent);
            }
        });
        ImageView imageView33 = (ImageView) findViewById(R.id.imageView35);

        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityPage1.this, PlayerDetail.class);
                intent.putExtra("playerName", "Name: Rasmus Højlund");
                intent.putExtra("Weight_Height", "Height: 191cm ");
                intent.putExtra("playernationality", "Nationality: Denmark");
                intent.putExtra("playerprice", "Price: €45.00m ");
                intent.putExtra("playerImg", "at8");
                intent.putExtra("Birthday", "Date of Birth: " + "04/02/2003");
                startActivity(intent);
            }
        });

    }
}

