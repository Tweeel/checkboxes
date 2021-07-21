package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CheckBox Chocolatecb,Sprinklescb,Crushedcb,Cherriescb,Oriocb;
    Button Submit;
    ArrayList<String> mResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chocolatecb=findViewById(R.id.Chocolate);
        Sprinklescb=findViewById(R.id.Sprinkles);
        Crushedcb=findViewById(R.id.Crushed);
        Cherriescb=findViewById(R.id.Cherries);
        Oriocb=findViewById(R.id.Orio);
        Submit=findViewById(R.id.submit);
        mResult=new ArrayList<>();

    }

    public void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,
                Toast.LENGTH_SHORT).show();
    }

    public void show_toast(View view) {
        Chocolatecb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Chocolatecb.isChecked()) mResult.add(Chocolatecb.getText().toString());
                else mResult.remove(Chocolatecb.getText().toString());
            }
        });

        Sprinklescb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Sprinklescb.isChecked()) mResult.add(Sprinklescb.getText().toString());
                else mResult.remove(Sprinklescb.getText().toString());
            }
        });

        Crushedcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Crushedcb.isChecked()) mResult.add(Crushedcb.getText().toString());
                else mResult.remove(Crushedcb.getText().toString());
            }
        });

        Cherriescb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cherriescb.isChecked()) mResult.add(Cherriescb.getText().toString());
                else mResult.remove(Cherriescb.getText().toString());
            }
        });
        Oriocb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Oriocb.isChecked()) mResult.add(Oriocb.getText().toString());
                else mResult.remove(Oriocb.getText().toString());
            }
        });
        String s="Toppings: ";
        for(String i: mResult) s+=i+" ";
        displayToast(s);

    }
}