package com.bridgelabz.quantitymeasurementapp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class QuantityMeasurementAppTest
{
    @Test
    public void testFeetEquality_SameValue()
    {
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(5);
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(5);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void testFeetEquality_DifferentValue()
    {
         QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(14);
         QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(15);
         Assertions.assertNotEquals(feet1,feet2);

    }

    @Test
    public void testFeetEquality_NullComparison()
    {
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(9);
        Assertions.assertFalse(feet2.equals(null));

    }

    @Test
    public void testFeetEquality_DifferentClass()
    {
        QuantityMeasurementApp feet1=new QuantityMeasurementApp();
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(8);
        Assertions.assertNotEquals(feet2,feet1);
    }

    @Test
    public void testFeetEquality_SameReference()
    {
          QuantityMeasurementApp.Feet feet=new QuantityMeasurementApp.Feet(9);
          Assertions.assertEquals(feet,feet);
    }

}

