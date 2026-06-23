package com.bridgelabz.quantitymeasurementapp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class QuantityMeasurementAppTest
{
    @Test
    public void testFeetEquaity()
    {
        Length feet1=new Length(1,LengthUnit.FEET);
        Length feet2=new Length(1, LengthUnit.FEET);
        Assertions.assertEquals(feet1,feet2);
    }

    @Test
    public void testInchesEquality()
    {
        Length feet1=new Length(12,LengthUnit.INCHES);
        Length feet2=new Length(12, LengthUnit.INCHES);
        Assertions.assertEquals(feet1,feet2);
    }

    @Test
    public void testFeetInchesComparison()
    {
        Length feet1=new Length(1,LengthUnit.FEET);
        Length feet2=new Length(12, LengthUnit.INCHES);
        Assertions.assertEquals(feet1,feet2);
    }
    @Test
    public void testFeetInequality()
    {
        Length feet1=new Length(12,LengthUnit.FEET);
        Length feet2=new Length(11, LengthUnit.FEET);
        Assertions.assertNotEquals(feet1,feet2);
    }
    @Test
    public void testInchesInequality()
    {
        Length feet1=new Length(12,LengthUnit.INCHES);
        Length feet2=new Length(24, LengthUnit.INCHES);
        Assertions.assertNotEquals(feet1,feet2);
    }
    @Test
    public void testCrossUnitInequality()
    {
        Length feet1=new Length(13,LengthUnit.INCHES);
        Length feet2=new Length(1, LengthUnit.FEET);
        Assertions.assertNotEquals(feet1,feet2);
    }
    @Test
    public void testMultipleFeetComparison()
    {
        Length feet1=new Length(12,LengthUnit.FEET);
        Length feet2=new Length(12, LengthUnit.FEET);
        Length feet3=new Length(12,LengthUnit.FEET);
        Length feet4=new Length(12, LengthUnit.FEET);
        Assertions.assertEquals(feet1,feet2);
        Assertions.assertEquals(feet3,feet4);
    }


}

