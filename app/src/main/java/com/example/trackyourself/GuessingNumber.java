package com.example.trackyourself;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class GuessingNumber extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextGuess;
    private Button checkButtonGuess;
    private TextView textViewGuess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // hiding the title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_guessing_number);
        editTextGuess=findViewById(R.id.guessEditTextId);
        checkButtonGuess=findViewById(R.id.checkGuessButtonId);
        textViewGuess=findViewById(R.id.resultGuessId);

        checkButtonGuess.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String guessString=editTextGuess.getText().toString();

        if (guessString.isEmpty()){
            errorMessage();
        }

        else {
            int guess=Integer.parseInt(guessString);
            if (guess>10){
                errorMessage();
            }

            // Generating random number
            Random random= new Random();
            int randomNumber =random.nextInt(10)+1;
            if (randomNumber==guess){
                textViewGuess.setText("Congratulation! You have won.");
            }
            else {
                textViewGuess.setText("Sorry! You have lost.The number was: "+randomNumber);
            }
        }
    }
    void errorMessage()
    {
        editTextGuess.setError("Please Enter a valid input");
        editTextGuess.requestFocus();
        return;
    }
}