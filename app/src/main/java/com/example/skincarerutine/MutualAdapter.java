package com.example.skincarerutine;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skincarerutine.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class MutualAdapter extends RecyclerView.Adapter<MutualAdapter.MutualHolder> {

    ArrayList<Mutual> mutualList;

    public MutualAdapter(ArrayList<Mutual> mutualList) {
        this.mutualList = mutualList;
    }

    //baglama ıslemı xml ile

    @Override
    public MutualHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MutualHolder(recyclerRowBinding);
    }

    //viewholder baglandıktan sonra ne gosterileceği
    @Override

    public void onBindViewHolder(@NonNull MutualHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.binding.recyclerViewTextView.setText(mutualList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                intent.putExtra("mutual", mutualList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }


    //kaac eleman donecegı- arraylistsize
    @Override
    public int getItemCount() {
        return mutualList.size();
    }

    public class MutualHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public MutualHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;

        }
    }
}


