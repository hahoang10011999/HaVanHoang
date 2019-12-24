package com.example.havanhoang_lab5.Order;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.havanhoang_lab5.MainActivity;
import com.example.havanhoang_lab5.R;

import java.util.ArrayList;
import java.util.List;


public class Your_order extends AppCompatActivity {
    ImageView imgArrow;
    List<Contact> contacts;
    RecyclerView recyclerView;
    AdapterContact adapterContact;
    SharedPreferences sharedPreferences;
    TextView tv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_order);
        imgArrow = findViewById(R.id.imgArrow);
        tv = findViewById(R.id.tvPrice);

        recyclerView =findViewById(R.id.rv);
        contacts = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext(),
                LinearLayoutManager.VERTICAL, false);
        adapterContact = new AdapterContact(contacts,getBaseContext());

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

       String mName = sharedPreferences.getString("name","");
       String mNumber = sharedPreferences.getString("number","");
       if(mName != "" && mNumber != ""){
           contacts.add(new Contact(mName,mNumber));
       }

        String mName1 = sharedPreferences.getString("name1","");
        String mNumber1 = sharedPreferences.getString("number1","");
        if(mName1 != "" && mNumber1 != ""){
            contacts.add(new Contact(mName1,mNumber1));
        }

        String mName2 = sharedPreferences.getString("name2","");
        String mNumber2 = sharedPreferences.getString("number2","");
        if(mName2 != "" && mNumber2 != ""){
            contacts.add(new Contact(mName2,mNumber2));
        }

        String mName3 = sharedPreferences.getString("name3","");
        String mNumber3 = sharedPreferences.getString("number3","");
        if(mName3 != "" && mNumber3 != ""){
            contacts.add(new Contact(mName3,mNumber3));
        }

        String mName4 = sharedPreferences.getString("name4","");
        String mNumber4 = sharedPreferences.getString("number4","");
        if(mName4 != "" && mNumber4 != ""){
            contacts.add(new Contact(mName4,mNumber4));
        }

        String mName5 = sharedPreferences.getString("name5","");
        String mNumber5 = sharedPreferences.getString("number5","");
        if(mName5 != "" && mNumber5 != ""){
            contacts.add(new Contact(mName5,mNumber5));
        }
        Intent intent = getIntent();
        String price= intent.getStringExtra("price");
        tv.setText(price);



       // adapterContact.notifyDataSetChanged();

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterContact);
        imgArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }


}


