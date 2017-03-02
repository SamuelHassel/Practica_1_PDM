package com.ruizvilla.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etProceso, etconcatenar;;
    Button b7, b8, b9, bMas, b4, b5, b6, bMenos,  b1, b2, b3, bPor, bPunto, b0, bC, bDiv, bIgual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relacionando XML JAVA

        b1 = (Button) findViewById (R.id.b1);
        b2 = (Button) findViewById (R.id.b2);
        b3 = (Button) findViewById (R.id.b3);
        b4 = (Button) findViewById (R.id.b4);
        b5 = (Button) findViewById (R.id.b5);
        b6 = (Button) findViewById (R.id.b6);
        b7 = (Button) findViewById (R.id.b7);
        b8 = (Button) findViewById (R.id.b8);
        b9 = (Button) findViewById (R.id.b9);
        b0 = (Button) findViewById (R.id.b0);
        etProceso = (EditText)findViewById (R.id.etProceso);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "7");
            }
        } ); // Fin boton

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "8");
            }
        } ); // Fin boton

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "9");
            }
        } ); // Fin boton

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "4");
            }
        } ); // Fin boton

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "5");
            }
        } ); // Fin boton

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "6");
            }
        } ); // Fin boton

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "1");
            }
        } ); // Fin boton

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "2");
            }
        } ); // Fin boton

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "3");
            }
        } ); // Fin boton

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etconcatenar = (EditText)findViewById(R.id.etProceso);
                etProceso.setText(etconcatenar.getText().toString() + "0");
            }
        } ); // Fin boton



        // Fin de programacion  __________________________________________
    }
}
