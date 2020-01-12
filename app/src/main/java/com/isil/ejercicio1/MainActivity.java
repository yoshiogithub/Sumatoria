package com.isil.ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero1,numero2;
    TextView resultado;
    double n1,n2;
    double acum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1=findViewById(R.id.n1);
        numero2=findViewById(R.id.n2);
        resultado=findViewById(R.id.txtresultado);

    }
        public void calcular(View view){
            n1=Double.parseDouble(numero1.getText().toString());
            n2=Double.parseDouble(numero2.getText().toString());

            for (double i = n1; i <= n2; i+=2) {
                if (i % 7 == 0 || i % 5==0) {
                    acum = acum + i;
                }

            }

            resultado.setText("LA SUMATORIA NÚMEROS PARES DE LOS MULTIPLOS DE 7 Y 5 ES : " + acum);
        }

}

