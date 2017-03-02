package com.ruizvilla.nota_curso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

// CALCULADORA DE NOTAS

public class MainActivity extends AppCompatActivity {

   // Construccion de variables

    EditText editText_1, editText_2,editText_3, editText_4,editText_5, editText_6;
    Button button_1;
    Double calificacion, a_1,a_2,a_3,a_4,a_5;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Relacionando objetos con widgets
        editText_1 = (EditText) findViewById (R.id.editText_1);
        editText_2 = (EditText) findViewById (R.id.editText_2);
        editText_3 = (EditText) findViewById (R.id.editText_3);
        editText_4 = (EditText) findViewById (R.id.editText_4);
        editText_5 = (EditText) findViewById (R.id.editText_5);
        editText_6 = (EditText) findViewById (R.id.editText_6);

        button_1 = (Button) findViewById(R.id.button_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//______________Entres estos dos segmentos programo lo que sucede al accionarn el boton

                a_1 = Double.parseDouble(editText_1.getText().toString());
                a_2 = Double.parseDouble(editText_2.getText().toString());
                a_3 = Double.parseDouble(editText_3.getText().toString());
                a_4 = Double.parseDouble(editText_4.getText().toString());
                a_5 = Double.parseDouble(editText_5.getText().toString());

                calificacion = (a_1 * 0.6)+(a_2 * 0.05)+(a_3 * 0.07)+(a_4 * 0.08)+(a_5 * 0.2);
                editText_6.setText(String.valueOf(calificacion));
                // Hasta aca listo el calculo de la nota

                if (calificacion<=1) {
                    Toast.makeText(getApplicationContext(), "Estas en el lugar equivocado", Toast.LENGTH_SHORT).show();
                } else {
                    if(calificacion>=1.1 && calificacion<=2){
                        Toast.makeText(getApplicationContext(), "Remal", Toast.LENGTH_SHORT).show();

                }else{
                    if(calificacion>=2 && calificacion<=3){
                        Toast.makeText(getApplicationContext(), "Es posible recuperarse", Toast.LENGTH_SHORT).show();
                    } else {
                        if(calificacion>=3.1 && calificacion<=4){
                            Toast.makeText(getApplicationContext(), "Normalito", Toast.LENGTH_SHORT).show();
                        }else{
                            if(calificacion>=4.1 && calificacion<=4.5){
                                Toast.makeText(getApplicationContext(), "Muy bien", Toast.LENGTH_SHORT).show();
                            }else{
                                if(calificacion>=4.6 && calificacion<=5) {
                                    Toast.makeText(getApplicationContext(), "Excelente estudiante", Toast.LENGTH_SHORT).show();
                                }
                                }
                            }
                        }
                    }
                }
                }

                //________________________________________________________________
    }); //Fin de boton
  } // Fin de OnCreate
} // Llave mas externa
