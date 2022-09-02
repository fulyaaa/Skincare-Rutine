package com.example.skincarerutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.skincarerutine.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();


        //casting
        Mutual selectedMutual = (Mutual) intent.getSerializableExtra("mutual");
        binding.nameText.setText(selectedMutual.name);
        binding.cleaningText.setText(selectedMutual.cleaning);
        binding.tonicText.setText(selectedMutual.tonic);
        binding.moisturizerText.setText(selectedMutual.moisturizer);
        binding.imageView.setImageResource(selectedMutual.image);

       /* binding.cleaningText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailsActivity.this, LastActivity.class);
                intent.putExtra("mutual", "Dry Skin Tonics" );
                startActivity(intent);


                +
            }
        });*/



    }
}