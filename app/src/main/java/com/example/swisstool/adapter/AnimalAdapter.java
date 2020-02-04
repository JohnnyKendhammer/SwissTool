package com.example.swisstool.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.swisstool.R;
import com.example.swisstool.model.Animal;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder> {

    private ArrayList<Animal> animalList;

    public AnimalAdapter() {
        animalList = new ArrayList(Arrays.asList(
                new Animal(R.drawable.alligator, "Wally", "Alligator", "Dangerous"),
                new Animal(R.drawable.pitbull, "Nena", "Dog", "Loves Food"),
                new Animal(R.drawable.fish, "Nemo", "Fish", "Easily Lost"),
                new Animal(R.drawable.lion, "Leo", "Lion", "Fuck you up"),
                new Animal(R.drawable.rhino, "Ricky", "Rhinoceros", "Endangered")
        ));
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.animal_view, parent, false
        );
        return new AnimalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animal = animalList.get(position);
        holder.ivAnimalPic.setImageResource(animal.getImageID());
        holder.tvAnimalName.setText("Name: " + animal.getName());
        holder.tvType.setText("Type: " + animal.getType());
        holder.tvFact.setText("Fact: " + animal.getFact());
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public void addNewAnimal(Animal animal) {
        animalList.add(animal);
        notifyItemInserted(animalList.size() - 1);
    }

    class AnimalViewHolder extends RecyclerView.ViewHolder {
        MaterialTextView tvAnimalName;
        MaterialTextView tvType;
        MaterialTextView tvFact;
        ImageView ivAnimalPic;

        AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAnimalPic = itemView.findViewById(R.id.ivAnimalPic);
            tvAnimalName = itemView.findViewById(R.id.tvAnimalName);
            tvType = itemView.findViewById(R.id.tvAnimalType);
            tvFact = itemView.findViewById(R.id.tvAnimalFact);
        }
    }
}
