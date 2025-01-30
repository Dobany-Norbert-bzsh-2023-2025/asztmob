package com.example;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTetra {
    Tetra tetra;
    @BeforeTest
    public void initTest()
    {
        tetra = new Tetra();
    }
    
    @Test
    public void testCalcVolume_30_35(){
        Double actual = tetra.calcVolume(30,35);
        Double expected = 350.0;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testCalcVolume_10_10(){
        Double actual = tetra.calcVolume(10,10);
        Double expected = 33.333333333333336;
        Assert.assertEquals(actual,expected);
    }

}
