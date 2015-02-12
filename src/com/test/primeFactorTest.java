package com.test;

import com.clss.primeFactor;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class primeFactorTest {

    primeFactor  primeFactorClss = new primeFactor();
    List<Integer> multiplicadores = new ArrayList<Integer>();
    @org.junit.Before
    public void setUp() throws Exception {

    }
    @Test
    public  void primeFactor ()throws Exception {


        Assert.assertEquals(multiplicadores,primeFactorClss.generate(1));

    }
}