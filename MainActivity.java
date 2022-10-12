package com.eduardo.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.io.StringReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> AL = new ArrayList<Pokemon>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Pokemon p1 = new Pokemon("Pokemon 1","Descripcion del pokemon",R.drawable.vamoacalmalno);
        Pokemon p2 = new Pokemon("Pokemon 2","Descripcion del pokemon", R.drawable.escuero);
        Pokemon p3 = new Pokemon("Pokemon 3","Descripcion del pokemon",R.drawable.raichu);
        Pokemon p4 = new Pokemon("Pokemon 1","Descripcion del pokemon",R.drawable.pika);
        Pokemon p5 = new Pokemon("Pokemon 1","Descripcion del pokemon",R.drawable.bulba);
        AL.add(p1); AL.add(p2); AL.add(p3);
        AL.add(p4); AL.add(p5);
        PokemonAdapter pokeAdapter = new PokemonAdapter(AL);
        recyclerView.setAdapter(pokeAdapter);
    }
}