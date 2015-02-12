package com.clss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by luisolvera on 11/02/15.
 */
public class primeFactor {
     List<Integer> multiplicadores = new ArrayList<Integer>();

    public List<Integer> generate(int numero){
        if(numero<2)
            multiplicadores.add(1);
        else
        {
            int divisor=2;
            while ( divisor<=numero)
            {
                if (numero%divisor==0)
                {
                    multiplicadores.add(divisor);
                    numero/=divisor;
                }
                else
                    divisor++;
            }
        }

        return multiplicadores;
    }

}
