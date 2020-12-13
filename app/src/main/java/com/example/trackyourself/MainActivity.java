package com.example.trackyourself;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView cardView_1,cardView_2,cardView_3,cardView_4,cardView_5,cardView_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView_1=findViewById(R.id.card_1_Id);
        cardView_2=findViewById(R.id.card_2_Id);
      //  cardView_3=findViewById(R.id.card_3_Id);
      //  cardView_4=findViewById(R.id.card_4_Id);
        cardView_5=findViewById(R.id.card_5_Id);
        cardView_6=findViewById(R.id.card_6_Id);

        cardView_1.setOnClickListener(this);
        cardView_2.setOnClickListener(this);
        cardView_3.setOnClickListener(this);
        cardView_4.setOnClickListener(this);
        cardView_5.setOnClickListener(this);
        cardView_6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.card_1_Id){}
        else if (v.getId()==R.id.card_2_Id){
        }
      //  else if (v.getId()==R.id.card_3_Id){}
       // else if (v.getId()==R.id.card_4_Id){}
        else if(v.getId()==R.id.card_5_Id){
        //    Intent intent=new Intent(getApplicationContext(),GamesActivity.class);
          //  startActivity(intent);
        }
        else if(v.getId()==R.id.card_6_Id){}
    }
}