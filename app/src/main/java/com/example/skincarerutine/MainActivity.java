package com.example.skincarerutine;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.stream.Collectors;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.skincarerutine.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Mutual> mutualArrayList;
    ArrayList<Product> productArrayList;
    //static Mutual chosenMutual;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        mutualArrayList = new ArrayList<>();

        Mutual dry = new Mutual("Dry Skin","Cleaning", "Tonic","Moisturizer", R.drawable.dry);
        Mutual combination = new Mutual("Combination Skin","Cleaning", "Tonic","Moisturizer", R.drawable.combination);
        Mutual oily = new Mutual("Oily Skin","Cleaning", "Tonic","Moisturizer", R.drawable.oily);

        mutualArrayList.add(dry);
        mutualArrayList.add(combination);
        mutualArrayList.add(oily);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MutualAdapter mutualAdapter = new MutualAdapter(mutualArrayList);
        binding.recyclerView.setAdapter(mutualAdapter);


        productArrayList = new ArrayList<>();

        Product cleaning_dry = new Product(R.drawable.dry,"Dry Skin Tonics",R.drawable.avene, R.drawable.bioderma,R.drawable.loreal, R.drawable.ziaja,
                "Avene", "Bioderma", "Loreal", "Ziaja");
        Product cleaning_combination = new Product(R.drawable.combination,"Combination Skin Tonics",R.drawable.clarins_c, R.drawable.clinique_c, R.drawable.garnier_c,
                R.drawable.inglot_c, "Clarins", "Clinique", "Garnier", "Inglot");
        Product cleaning_oily = new Product(R.drawable.oily, "Oily Skin Tonics", R.drawable.avene_o, R.drawable.larocheposey_o, R.drawable.sebamed_o,
                R.drawable.uriage_o, "Avene", "La Roche Posey", "Sebamed", "Inglot");

        productArrayList.add(cleaning_dry);
        productArrayList.add(cleaning_combination);
        productArrayList.add(cleaning_oily);

        Product tonics_dry = new Product(R.drawable.dry,"Dry Skin Tonics",R.drawable.avene, R.drawable.bioderma,R.drawable.loreal, R.drawable.ziaja,
                "Avene", "Bioderma", "Loreal", "Ziaja");
        Product tonics_combination = new Product(R.drawable.combination,"Combination Skin Tonics",R.drawable.clarins_c, R.drawable.clinique_c, R.drawable.garnier_c,
                R.drawable.inglot_c, "Clarins", "Clinique", "Garnier", "Inglot");
        Product tonics_oily = new Product(R.drawable.oily, "Oily Skin Tonics", R.drawable.avene_o, R.drawable.larocheposey_o, R.drawable.sebamed_o,
                R.drawable.uriage_o, "Avene", "La Roche Posey", "Sebamed", "Inglot");

        productArrayList.add(tonics_dry);
        productArrayList.add(tonics_combination);
        productArrayList.add(cleaning_oily);

        Product moisturizer_dry = new Product(R.drawable.dry, "Dry Skin Moisturizer", R.drawable.avene_m, R.drawable.nuxe_m, R.drawable.nuxe_m,R.drawable.vichy_m,
                "Avene", "CeraVe", "Nuxe", "Vichy");
        Product moisturizer_combination = new Product(R.drawable.combination, "Combination Skin Moisturizer", R.drawable.estelauder_m, R.drawable.nuxe_m, R.drawable.nuxe_m,R.drawable.uriage_m,
                "Este Lauder", "CeraVe","Nuxe", "Uriage");
        Product moisturizer_oily = new Product(R.drawable.oily, "Oily Skin Moisturizer", R.drawable.clinique_o, R.drawable.khiels_o, R.drawable.neutrogena_o, R.drawable.yvesrocher_o,
                "Clinique", "Khiels", "Neutrogena", "Yves Rocher");

        productArrayList.add(moisturizer_dry);
        productArrayList.add(moisturizer_combination);
        productArrayList.add(moisturizer_oily);


       /* binding..setLayoutManager(new GridLayoutManager(this, productArrayList.size()));
        ProductAdapter productAdapter = new ProductAdapter(productArrayList);
        binding.recyclerView.setAdapter(mutualAdapter); */


       /* ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                productArrayList.stream().map(product -> product.skinTypeText).collect(Collectors.toList())
        );
        linearLayout.setOnClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("product", productArrayList.get(i));
                startActivity(intent);
        };*/

        /*
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MutualAdapter mutualAdapter = new MutualAdapter(mutualArrayList);
        binding.recyclerView.setAdapter(mutualAdapter);

        */

        //mapping
       /* ArrayAdapter arrayAdapter = null;00
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                    productArrayList.stream().map(product -> product.skinTypeText).collect(Collectors.toList())
            );
        }
        binding
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent= new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("product", productArrayList.get(i));
                startActivity(intent);

            }
        });*/


    }
}
