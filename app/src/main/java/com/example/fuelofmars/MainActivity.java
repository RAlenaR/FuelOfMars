package com.example.fuelofmars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText weightCargo; //переменная ввода груза
    private Button button;//кнопка расчета
    private TextView weightFuel; //поле вывода веса топлива
    private String string; //строка для ввода
    Сalculation fuelWeight=new Сalculation(); //создание объекта класса Сalculation

    View.OnClickListener listener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            string=weightCargo.getText().toString();
            weightFuel.setText(fuelWeight.calculation(string)+" тонн топлива");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weightCargo=findViewById(R.id.weightCargo);
        button=findViewById(R.id.button);
        weightFuel=findViewById(R.id.weightFuel);
        button.setOnClickListener(listener);


    }
}