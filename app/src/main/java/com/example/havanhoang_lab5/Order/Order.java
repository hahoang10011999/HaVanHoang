package com.example.havanhoang_lab5.Order;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.havanhoang_lab5.R;
import com.example.havanhoang_lab5.databinding.OrderBinding;

public class Order extends Fragment {
    OrderBinding binding;
    int number = 0;
    int price = 0;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    int numberPizza = 0;
    int numberKFC = 0;
    int numberEgg = 0;
    int numberCoca = 0;
    int numberChicken = 0;
    int numberCup = 0;



    public static Order newInstance() {

        Bundle args = new Bundle();

        Order fragment = new Order();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.order,container,false);
        preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        editor = preferences.edit();



        binding.tvPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number = number + 1;

                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);

                numberPizza = numberPizza + 1;
                String pizza = binding.tvPizza.getText().toString();
                editor.putString("name",pizza);
                editor.putString("number",String.valueOf(numberPizza));
                editor.commit();
            }
        });
        binding.tvKFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + 1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);

                numberKFC = numberKFC + 1;
                String kfc = binding.tvKFC.getText().toString();
                editor.putString("name1",kfc);
                editor.putString("number1",String.valueOf(numberKFC));
                editor.commit();
            }
        });
        binding.tvEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + 1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);

                numberEgg = numberEgg + 1;
                String egg = binding.tvEgg.getText().toString();
                editor.putString("name2",egg);
                editor.putString("number2",String.valueOf(numberEgg));
                editor.commit();
            }
        });
        binding.tvCoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + 1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);

                numberCoca = numberCoca + 1;
                String coca = binding.tvCoca.getText().toString();
                editor.putString("name3",coca);
                editor.putString("number3",String.valueOf(numberCoca));
                editor.commit();
            }
        });
        binding.tvChicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + 1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);

                numberChicken = numberChicken + 1;
                String chicken = binding.tvChicken.getText().toString();
                editor.putString("name4",chicken);
                editor.putString("number4",String.valueOf(numberChicken));
                editor.commit();
            }
        });
        binding.tvCup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + 1;
                price = price + 10;
                String pri = Integer.toString(price);
                String num = Integer.toString(number);
                binding.tvTotal.setText(pri);
                binding.tvNumber.setText(num);

                numberCup = numberCup + 1;
                String cup = binding.tvCup.getText().toString();
                editor.putString("name5",cup);
                editor.putString("number5",String.valueOf(numberCup));
                editor.commit();
            }
        });
        binding.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Your_order.class);
                intent.putExtra("price",String.valueOf(price));
                startActivity(intent);
            }
        });
        binding.btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Thank you! Your order is send to restaurant!", Toast.LENGTH_SHORT).show();
            }
        });

        return binding.getRoot();
    }

}
