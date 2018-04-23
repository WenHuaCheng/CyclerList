package com.example.administrator.cyclerlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/4/23 0023.
 */

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder>{


     private List<Fruit> mFruitList;
     static class ViewHolder extends RecyclerView.ViewHolder{
     ImageView fruitImage;
     TextView fruitName;
          public ViewHolder( View View) {
               super(View);
              fruitImage= (ImageView)View.findViewById(R.id.image);
              fruitName=(TextView) View.findViewById(R.id.name);

          }
     }
     public FruitAdapter(List<Fruit> mFruitList) {
          this.mFruitList = mFruitList;
     }
     @Override
     public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
         View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
         ViewHolder viewHolder=new ViewHolder(view);
          return viewHolder;
     }

     @Override
     public void onBindViewHolder( ViewHolder holder, int position) {
           Fruit fruit=mFruitList.get(position);
           holder.fruitImage.setImageResource(fruit.getImageId());
           holder.fruitName.setText(fruit.getName());
     }

     @Override
     public int getItemCount() {

          return mFruitList.size();
     }



}
