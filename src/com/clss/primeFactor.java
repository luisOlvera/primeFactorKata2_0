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
        if(numero==1)
            multiplicadores.add(1);
        else
            multiplicadores.add(2);
        return multiplicadores;
    }

}
