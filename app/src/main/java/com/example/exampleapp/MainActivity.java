package com.example.exampleapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button act_change, btn_Exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Калькулятор");
        addListenerOnButton();
    }


    public void addListenerOnButton(){
        btn_Exit = (Button)findViewById(R.id.Exit);
        act_change = (Button)findViewById(R.id.button_SecondActivity);

        btn_Exit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 AlertDialog.Builder a_exit = new AlertDialog.Builder(MainActivity.this);
                 a_exit.setMessage("Закрыть приложение?").setCancelable(false).setPositiveButton("Да", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         finish();
                     }
                 }).setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         dialog.cancel();
                     }
                 });
                 AlertDialog exit = a_exit.create();
                 exit.setTitle("Закрытие приложения");
                 exit.show();
             }
         });

        act_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.exampleapp.SecondActivity");
                startActivity(intent);
            }
        });


    }




    public void onButtonClick (View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText = (TextView)findViewById(R.id.Output);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());

        int resSum = number1 + number2;

        resText.setText(Integer.toString(resSum));


    }

    public void onButtonClick1 (View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText = (TextView)findViewById(R.id.Output);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());

        int resSum = number1 - number2;

        resText.setText(Integer.toString(resSum));


    }

    public void onButtonClick2 (View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText = (TextView)findViewById(R.id.Output);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());

        int resSum = number1 * number2;

        resText.setText(Integer.toString(resSum));


    }

    public void onButtonClick3 (View v){
        EditText el1 = (EditText)findViewById(R.id.Num1);
        EditText el2 = (EditText)findViewById(R.id.Num2);
        TextView resText = (TextView)findViewById(R.id.Output);

        int number1 = Integer.parseInt(el1.getText().toString());
        int number2 = Integer.parseInt(el2.getText().toString());

        int resSum = number1 / number2;

        resText.setText(Integer.toString(resSum));


    }
}
