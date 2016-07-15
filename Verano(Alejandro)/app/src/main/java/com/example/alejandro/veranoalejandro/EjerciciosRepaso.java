package com.example.alejandro.veranoalejandro;

/**
 * Created by Alejandro on 14/07/2016.
 */
public class EjerciciosRepaso {
   public boolean estaLetraEnPalabra (String palabra, char letra) {
       boolean valor_devuelto = false;

       //TODO resolver la funcion

       valor_devuelto = (palabra.indexOf(letra) != -1);

       /*if (palabra.indexOf(letra) !=-1)

       {
                  valor_devuelto = true;
       }*/

       return valor_devuelto;
   }

    public int vecesLetraEnPalabra(String palabra, char letra)
    { //TODO CONTAR EL NUMERO DE VECES QUE APARECE EL CARACTER EN LA PALABRA

        int n_veces = 0;
        int longuitd = -1;
        int indice = 0;
        char auxiliar = 0;

        longuitd = palabra.length();


        for (indice = 0; indice < longuitd; indice = indice + 1) {
            auxiliar = palabra.charAt(indice);
            if (auxiliar == letra) {
                n_veces = n_veces + 1; //n_veces++;
            }

        }


        {


            return n_veces;



        }


    }

}




