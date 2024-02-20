package com.example.calcularcompra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public CheckBox op1, op2, op3, op4, op5;
    public Button comprar;
    public TextView total;
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);
        op5 = findViewById(R.id.op5);
        comprar = findViewById(R.id.comprar);
        total = findViewById(R.id.total);


        op1.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        op2.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        op3.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        op4.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        op5.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
    }

    public void calcularTotal(){
        result= 0;

        if (op1.isChecked()){
            result+=69.90;
        }
        if (op2.isChecked()){
            result+=69.90;
        }
        if (op3.isChecked()){
            result+=69.90;
        }
        if (op4.isChecked()){
            result+=69.90;
        }
        if (op5.isChecked()) {
            result+= 69.90;
        }

        else{
            result=result;
        }
    }

    public void selComprar(View view){
        calcularTotal();

        String resultado  = String.format("%.2f",result);
        total.setText(resultado);
    }

}