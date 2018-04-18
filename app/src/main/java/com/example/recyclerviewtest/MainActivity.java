package com.example.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruits(){
        for (int i=0;i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.apple);
            fruitList.add(banana);
            Fruit cherry = new Fruit("Cherry",R.drawable.apple);
            fruitList.add(cherry);
            Fruit grape = new Fruit("Grape",R.drawable.apple);
            fruitList.add(grape);
            Fruit mango = new Fruit("Mango",R.drawable.apple);
            fruitList.add(mango);
            Fruit orange = new Fruit("Orange",R.drawable.apple);
            fruitList.add(orange);
            Fruit pear = new Fruit("Pear",R.drawable.apple);
            fruitList.add(pear);
            Fruit pineapple = new Fruit("Pineapple",R.drawable.apple);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("Strawberry",R.drawable.apple);
            fruitList.add(strawberry);
            Fruit watermelon = new Fruit("Watermelon",R.drawable.apple);
            fruitList.add(watermelon);
        }
    }

}
