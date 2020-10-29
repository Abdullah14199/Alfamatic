package com.example.alfamatic;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtLength , txtWidth, txtLengthOfDoors , txtWidthOfDoors ;
    public ImageView imageView;
    public itemClickListner listner;

    public ProductViewHolder(@NonNull View itemView)
    {
        super(itemView);

        imageView = itemView.findViewById(R.id.product_image);
        txtLength = itemView.findViewById(R.id.product_length);
        txtWidth = itemView.findViewById(R.id.product_width);
        txtLengthOfDoors = itemView.findViewById(R.id.p_lengthofdoors);
        txtWidthOfDoors = itemView.findViewById(R.id.p_widthofdoors);

    }

    public void setItemClickListner(itemClickListner listner)
    {
        this.listner = listner;
    }

    @Override
    public void onClick(View view)
    {
        listner.onClick(view, getAdapterPosition() , false);

    }
}

