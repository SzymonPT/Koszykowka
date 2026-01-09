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

import com.example.koszykowka.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private int punkty = 0;
    private  ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        if(savedInstanceState !=null){
            punkty = savedInstanceState.getInt("Punkty");
        }
        binding.TextViewPunkty.setText(String.valueOf(punkty));
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty +=1;
                        binding.TextViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        binding.button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty +=2;
                        binding.TextViewPunkty.setText(String.valueOf(punkty));
                    }
                }
        );
        binding.button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punkty +=3;
                        binding.TextViewPunkty.setText(String.valueOf(punkty));
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