package com.example.alejandro.veranoalejandro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EjerciciosRepaso ejerciciosRepaso = new EjerciciosRepaso();

       boolean valor_devuelto = ejerciciosRepaso.estaLetraEnPalabra("JORGE",'O');

    if (valor_devuelto)

        {
        Log.d(getClass().getCanonicalName(), "La letra aparece en la palabra");

            }
    else

        {
        Log.d(getClass().getCanonicalName(), "La letra no aparece en la palabra");
        }

       int int_dev_ = ejerciciosRepaso.vecesLetraEnPalabra("Gustavo",'1');
        Log.d(getClass().getCanonicalName(),"La letra aparece " + int_dev_ + " veces");

    }

}