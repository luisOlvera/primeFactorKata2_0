package com.test;

import com.clss.primeFactor;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class primeFactorTest {

    primeFactor  primeFactorClss ;
    List<Integer> multiplicadores ;
    @org.junit.Before
    public void setUp() throws Exception {
        primeFactorClss = new primeFactor();
        multiplicadores = new ArrayList<Integer>();
    }

    @Test
    public  void numero1_resultado1 ()throws Exception {
        assertEquals(addlist(1), 1);

    }

    @Test
    public  void numero2_resultado2 ()throws Exception {
        assertEquals(addlist(2),2);
    }

    @Test
    public  void numero4_resultado2_2 ()throws Exception {
        assertEquals(addlist(2,2),4);

    }

    @Test
    public  void numero6_resultado2_3 ()throws Exception {
        assertEquals(addlist(2,3),6);

    }

    public List<Integer> addlist(int ... operandos){
        for (int c :operandos)
            multiplicadores.add(c);
        return multiplicadores;
    }
    public void assertEquals(List<Integer> divisors, int numero ){
        Assert.assertEquals(divisors, primeFactorClss.generate(numero));
    }
}