package com.ruizvilla.nota_curso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // Construccion de variables

    EditText editText_1, editText_2,editText_3, editText_4,editText_5, editText_6;
    Button button_1;
    Double calificacion, a_1,a_2,a_3,a_4,a_5,a_6;




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
                if (!(editText_1.getText().toString().equals(""))) {
                    a_1 = Double.parseDouble(editText_1.getText().toString());

                    calificacion = a_1 * 2;
                    editText_6.setText(String.valueOf(calificacion));
                }


                //________________________________________________________________
            }
    });
  }
} // Llave mas externa
