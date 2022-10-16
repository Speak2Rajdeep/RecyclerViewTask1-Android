package com.example.recyclerviewtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Holder> {

    String data[];
    Context context;

    //Passing the data through Constructor
    public MyAdapter(String[] data,Context context) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    //Creates a view and patches it with the Holder Class
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlerow,parent,false);
        return new Holder(view);
    }

    //Set the Texts from On Bind Method and Displays in Screen
    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView img;
        TextView tv;

        public Holder(@NonNull View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img1);
            tv = (TextView) itemView.findViewById(R.id.t1);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAbsoluteAdapterPosition();
            Toast.makeText(img.getContext(), "You have Clicked on Position : " + (position+1), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(context.getApplicationContext(),DescriptionActivity.class);
            intent.putExtra("image",R.drawable.smile2);
            intent.putExtra("text",tv.getText());
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        }
    }
}
