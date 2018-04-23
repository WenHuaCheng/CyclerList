package com.example.administrator.cyclerlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
//
//eeeeeeeee

public class MainActivity extends AppCompatActivity {
private List<Fruit> fruit=new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter fruitAdapter=new FruitAdapter(fruit);
        recyclerView.setAdapter(fruitAdapter);
    }
    private void initFruit(){
        for (int i=0;i<2;i++){
            Fruit apple=new Fruit("apple",R.drawable.ic_launcher_background);
            fruit.add(apple);
            Fruit banana=new Fruit("banana",R.drawable.a1);
            fruit.add(banana);
            Fruit orange=new Fruit("orange",R.drawable.a23);
            fruit.add(orange);
        }
    }
}
