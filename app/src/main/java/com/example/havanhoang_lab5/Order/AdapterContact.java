package com.example.havanhoang_lab5.Order;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.havanhoang_lab5.R;

import java.util.List;

public class AdapterContact extends RecyclerView.Adapter<AdapterContact.Viewhoder> {

    List<Contact> contacts;
    Context context;
    SharedPreferences sharedPreferences;


    public AdapterContact(List<Contact> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

    }

    @NonNull
    @Override
    public Viewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_contact, parent, false);

        Viewhoder viewhoder = new Viewhoder(view);
        return viewhoder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhoder holder, int position) {

        final Contact contact = contacts.get(position);

        holder.tvmNumber.setText(contact.getNumber());
        holder.tvName.setText(contact.getName());


    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class Viewhoder extends RecyclerView.ViewHolder {
        TextView tvName, tvmNumber;

        public Viewhoder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvmNumber = itemView.findViewById(R.id.tvmNumber);
        }
    }
}
