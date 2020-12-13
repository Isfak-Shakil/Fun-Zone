package com.example.trackyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CurrencyConverter extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);
        sp1 =findViewById(R.id.spinnerFromId);
        sp2=findViewById(R.id.spinnerToId);
        ed1=findViewById(R.id.txtEnterId);
        btn=findViewById(R.id.convertButtonId);

        String[] from ={"USD","BDT","Riyal",};
        ArrayAdapter ad =new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);
        String[] to ={"USD","BDT","Riyal"};
        ArrayAdapter ad1 =new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount =Double.parseDouble(ed1.getText().toString().trim());

                if (sp1.getSelectedItem().toString()=="USD"&& sp2.getSelectedItem().toString()=="BDT")
                {
                    tot=amount*84.93;
                    Toast.makeText(getApplicationContext(),tot.toString()+"TAKA",Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="BDT"&& sp2.getSelectedItem().toString()=="USD")
                {
                    tot=amount/84.93;
                    Toast.makeText(getApplicationContext(),tot.toString()+"USD",Toast.LENGTH_LONG).show();
                }


                else if (sp1.getSelectedItem().toString()=="USD"&& sp2.getSelectedItem().toString()=="Riyal")
                {
                    tot=amount*3.75;
                    Toast.makeText(getApplicationContext(),tot.toString()+"RIYAL",Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="Riyal"&& sp2.getSelectedItem().toString()=="USD")
                {
                    tot=amount/3.75;
                    Toast.makeText(getApplicationContext(),tot.toString()+"USD",Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="Riyal"&& sp2.getSelectedItem().toString()=="BDT")
                {
                    tot=amount*22.62;
                    Toast.makeText(getApplicationContext(),tot.toString()+"TAKA",Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="BDT"&& sp2.getSelectedItem().toString()=="Riyal")
                {
                    tot=amount/22.62;
                    Toast.makeText(getApplicationContext(),tot.toString()+"Riyal",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Should be different",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}