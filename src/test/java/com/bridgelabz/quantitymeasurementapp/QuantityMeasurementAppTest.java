package com.bridgelabz.quantitymeasurementapp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.naming.NameNotFoundException;

import static java.lang.Double.NaN;


public class QuantityMeasurementAppTest
{
    @Test
    public void testConversion_FeetToInches()
    {
       Length length1=QuantityMeasurementApp.demonstrateLengthConversion(1.0,LengthUnit.FEET,LengthUnit.INCHES);
       Length length2=new Length(12,LengthUnit.INCHES);
        Assertions.assertEquals(length1,length2);
    }

    @Test
    public void testConversion_InchesToFeet()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion(24.0,LengthUnit.INCHES,LengthUnit.FEET);
        Length length2=new Length(2,LengthUnit.FEET);
        Assertions.assertEquals(length1,length2);
    }

    @Test
    public void  testConversion_YardsToInches()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion(1,LengthUnit.YARDS,LengthUnit.INCHES);
        Length length2=new Length(36,LengthUnit.INCHES);
        Assertions.assertEquals(length1,length2);
    }
    @Test
    public void  testConversion_CentimetersToInches()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion(2.54,LengthUnit.CENTIMETERS,LengthUnit.INCHES);
        Length length2=new Length(1,LengthUnit.INCHES);
        Assertions.assertEquals(length1,length2);
    }
    @Test
    public void testConversion_FeetToYard()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion(6,LengthUnit.FEET,LengthUnit.YARDS);
        Length length2=new Length(2,LengthUnit.YARDS);
        Assertions.assertEquals(length1,length2);
    }

    @Test
    public void testConversion_RoundTrip_PreservesValue()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion(6,LengthUnit.FEET,LengthUnit.YARDS);
        Length length2=new Length(2,LengthUnit.YARDS);
        Length length3=QuantityMeasurementApp.demonstrateLengthConversion(2,LengthUnit.YARDS,LengthUnit.FEET);
        Length length4=new Length(6,LengthUnit.FEET);
        Assertions.assertEquals(length1,length2);
        Assertions.assertEquals(length3,length4);
    }
    @Test
    public void testConversion_ZeroValue()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion(0,LengthUnit.FEET,LengthUnit.INCHES);
        Length length2=new Length(0,LengthUnit.INCHES);
        Assertions.assertEquals(length1,length2);
    }


    @Test
    public void testConversion_InvalidUnit_Throws()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion(0,null,LengthUnit.INCHES);
        Assertions.assertNotNull(length1);
    }

    @Test
    public void testConversion_NaNOrInfinite_Throws()
    {
        Length length1=QuantityMeasurementApp.demonstrateLengthConversion( NaN,LengthUnit.FEET,LengthUnit.INCHES);
        Assertions.assertNotNull(length1);
    }
    @Test
    public void testConversion_PrecisionTolerance()
    {
        Length length = new Length(1, LengthUnit.FEET);

        double actual = length.getUnit().toInches(length.getValue());

        Assertions.assertEquals(12.0, actual, 1e-6);

    }


}

