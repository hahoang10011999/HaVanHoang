package com.example.havanhoang_lab5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.havanhoang_lab5.databinding.OrderBinding;

import java.util.prefs.Preferences;

public class OrderFragment extends Fragment {
    OrderBinding binding;
    int number = 0;
    int price = 0;




    public static OrderFragment newInstance() {
        Bundle args = new Bundle();
        OrderFragment fragment = new OrderFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.order,container,false);
        binding.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Your_order.class);
                startActivity(intent);
            }
        });
        binding.tvPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = binding.tvPizza.getText().toString();
                 int numberPizza = 0 ;
                 number = number +1;
                 numberPizza = numberPizza+1;
                 price = price + 10;
                 String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);


            }
        });
        binding.tvKFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number +1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);
            }
        });
        binding.tvEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number +1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);
            }
        });
        binding.tvCoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number +1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);
            }
        });
        binding.tvChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number +1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);
            }
        });
        binding.tvCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number +1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);
            }
        });
        binding.btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Thank you! Your order is send to restaurant!",Toast.LENGTH_SHORT).show();
            }
        });
        return binding.getRoot();
    }
}
