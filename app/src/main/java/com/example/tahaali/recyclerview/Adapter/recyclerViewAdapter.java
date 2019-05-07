package com.example.tahaali.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tahaali.recyclerview.Main2Activity;
import com.example.tahaali.recyclerview.R;
import com.example.tahaali.recyclerview.model.Person;

import java.util.List;

/**
 * Created by hp on 10/3/2017.
 */

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.viewHolder>
{
    List<Person> model;
    Context context;
    public recyclerViewAdapter(List<Person> Model, Context context)
    {
        this.model=Model;
        this.context=context;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        viewHolder viewHolder=new recyclerViewAdapter.viewHolder(v);
        Log.d("Taha","On CREATE VIEW METOOD");
        return viewHolder;


    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {

        holder.heading.setText(model.get(position).getName());
        holder.para.setText(String.valueOf(model.get(position).getAge()));
        Log.d("Taha","On BIND METHOOD");
    }




    @Override
    public int getItemCount() {
        return model.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener//
    {// Implementsing the view holder class so we can access elements

        public TextView heading,para;



        public viewHolder(View itemView) {
            super(itemView);
            Log.d("Taha","View HOLDER");
            itemView.setOnClickListener(this);
            heading=(TextView) itemView.findViewById(R.id.headingTextview);
            para=(TextView)itemView.findViewById(R.id.paraTextview);
        }


        @Override
        public void onClick(View v)
        {
            Log.d("Taha","ON CLICK ITEM");

            int Position=getAdapterPosition();
            Intent intent=new Intent(context, Main2Activity.class);
            intent.putExtra("Name",model.get(Position).getName());
            intent.putExtra("Age",String.valueOf(model.get(Position).getAge()));
            intent.putExtra("Dob",String.valueOf(model.get(Position).getDOB()));

            context.startActivity(intent);

        }
    }



}
