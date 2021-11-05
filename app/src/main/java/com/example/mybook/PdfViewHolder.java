package com.example.mybook;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PdfViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public CardView container;

    public PdfViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_pdf_name);
        container = itemView.findViewById(R.id.cv_container);


    }
}
