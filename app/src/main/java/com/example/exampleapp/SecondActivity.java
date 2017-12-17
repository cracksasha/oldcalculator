package com.example.exampleapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Расширение");
        addListenerOnButton();
    }


    private Button btn_Exit, act_change;

    public void addListenerOnButton(){
        btn_Exit = (Button)findViewById(R.id.Exit2);

        btn_Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a_exit = new AlertDialog.Builder(SecondActivity.this);
                a_exit.setMessage("Закрыть окно?").setCancelable(false).setPositiveButton("Да", new DialogInterface.OnClickListener() {
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
                exit.setTitle("Закрытие окна");
                exit.show();
            }
        });



    }

    public void onButtonClick6 (View v){
        EditText el1 = (EditText)findViewById(R.id.Num3);
        EditText el2 = (EditText)findViewById(R.id.Num4);
        TextView resText = (TextView)findViewById(R.id.Output2);

        double number1 = Integer.parseInt(el1.getText().toString());
        double number2 = Integer.parseInt(el2.getText().toString());

        double resSum = Math.pow(number1, 1/number2);

        resText.setText(Double.toString(resSum));


    }

    public void onButtonClick7 (View v){
        EditText el1 = (EditText)findViewById(R.id.Num3);
        EditText el2 = (EditText)findViewById(R.id.Num4);
        TextView resText = (TextView)findViewById(R.id.Output2);

        double number1 = Integer.parseInt(el1.getText().toString());
        double number2 = Integer.parseInt(el2.getText().toString());

        double resSum = Math.pow(number1, number2);

        resText.setText(Double.toString(resSum));


    }


}