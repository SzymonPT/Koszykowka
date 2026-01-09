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
import androidx.lifecycle.ViewModelProvider;

import com.example.koszykowka.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private PunktyViewModel punktyViewModel;
    private  ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        EdgeToEdge.enable(this);
        setContentView(view);
        punktyViewModel = new ViewModelProvider(this).get(PunktyViewModel.class);
        binding.TextViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
        binding.button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(1);
                        binding.TextViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(2);
                        binding.TextViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
        binding.button7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        punktyViewModel.addPunkty(3);
                        binding.TextViewPunkty.setText(String.valueOf(punktyViewModel.getPunkty()));
                    }
                }
        );
    }
}