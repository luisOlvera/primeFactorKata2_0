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
        multiplicadores.add(1);
        Assert.assertEquals(multiplicadores,primeFactorClss.generate(1));
    }

    @Test
    public  void numero2_resultado2 ()throws Exception {
        multiplicadores.add(2);
        Assert.assertEquals(multiplicadores,primeFactorClss.generate(2));
    }
}