package com.example.havanhoang_lab5;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHoder> {
    List<Contect> contects;
    @NonNull
    @Override
    public Adapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHoder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
