package com.example.skincarerutine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.skincarerutine.databinding.ActivityDetailsBinding;
import com.example.skincarerutine.databinding.ActivityLastBinding;

public class LastActivity extends AppCompatActivity {

    private ActivityLastBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLastBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        //casting
        Product selectedProduct = (Product) intent.getSerializableExtra("product");
        binding.imageView.setImageResource(selectedProduct.imageView);
        binding.imageView1.setImageResource(selectedProduct.imageView1);
        binding.imageView2.setImageResource(selectedProduct.imageView2);
        binding.imageView3.setImageResource(selectedProduct.imageView3);
        binding.imageView4.setImageResource(selectedProduct.imageView4);
        binding.skinTypeText.setText(selectedProduct.skinTypeText);
        binding.product1.setText(selectedProduct.product1);
        binding.product2.setText(selectedProduct.product2);
        binding.product3.setText(selectedProduct.product3);
        binding.product4.setText(selectedProduct.product4);


    }
}
