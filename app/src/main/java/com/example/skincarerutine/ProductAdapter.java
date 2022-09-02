package com.example.skincarerutine;

/*import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skincarerutine.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {

    ArrayList<Product> productArrayList;

    public ProductAdapter(ArrayList<Product> productArrayList){this.productArrayList=productArrayList;}

    @NonNull
    @Override
    public ProductAdapter.ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ProductHolder(recyclerRowBinding);
    }

    @Override
    //ProductAdapter.
    public void onBindViewHolder(@NonNull ProductHolder holder,@SuppressLint("RecyclerView") int position) {
            holder.binding.recyclerViewTextView.setText(productArrayList.get(position).skinTypeText);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(holder.itemView.getContext(), LastActivity.class);
                    intent.putExtra("product", productArrayList.get(position));
                    holder.itemView.getContext().startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() { return productArrayList.size();}

    public class ProductHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public ProductHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }
}*/
