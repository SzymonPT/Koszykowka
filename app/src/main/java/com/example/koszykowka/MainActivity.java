package com.example.koszykowka;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textViewPunkty;
    private Button button,button6,button7;

    private int punkty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textViewPunkty = findViewById(R.id.TextViewPunkty);
        button = findViewById(R.id.button);
        button6 = findViewById(R.id.button6);
        button7= findViewById(R.id.button7);
        if(savedInstanceState !=null){
            punkty = savedInstanceState.getInt("Punkty");
        }
        textViewPunkty.setText(String.valueOf(punkty));
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty +=1;
                        textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty +=2;
                        textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty +=3;
                        textViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Punkty",punkty);
    }
}