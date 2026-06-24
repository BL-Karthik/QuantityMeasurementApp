package com.bridgelabz.quantitymeasurementapp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class QuantityMeasurementAppTest
{
    @Test
    public void testEquality_YardToYard_SameValue()
    {
        Length feet1=new Length(1,LengthUnit.YARDS);
        Length feet2=new Length(1, LengthUnit.YARDS);
        Assertions.assertEquals(feet1,feet2);
    }

    @Test
    public void testEquality_YardToYard_DifferentValue()
    {
        Length feet1=new Length(1,LengthUnit.YARDS);
        Length feet2=new Length(2, LengthUnit.YARDS);
        Assertions.assertNotEquals(feet1,feet2);
    }

    @Test
    public void testEquality_FeetToYard_EquivalentValue()
    {
        Length feet1=new Length(3,LengthUnit.FEET);
        Length feet2=new Length(1, LengthUnit.YARDS);
        Assertions.assertEquals(feet1,feet2);
    }
    @Test
    public void testEquality_YardToInches_EquivalentValue()
    {
        Length feet1=new Length(1,LengthUnit.YARDS);
        Length feet2=new Length(36, LengthUnit.INCHES);
        Assertions.assertEquals(feet1,feet2);
    }
    @Test
    public void testEquality_InchesToYard_EquivalentValue()
    {
        Length feet1=new Length(36,LengthUnit.INCHES);
        Length feet2=new Length(1, LengthUnit.YARDS);
        Assertions.assertEquals(feet1,feet2);
    }
    @Test
    public void testEquality_YardToFeet_NonEquivalentValue()
    {
        Length feet1=new Length(1,LengthUnit.YARDS);
        Length feet2=new Length(2, LengthUnit.FEET);
        Assertions.assertNotEquals(feet1,feet2);
    }
    @Test
    public void testEquality_CentimetersToInches_EquivalentValue()
    {
        Length feet1=new Length(1,LengthUnit.CENTIMETERS);
        Length feet2=new Length(0.3937007874015748, LengthUnit.INCHES);
        Assertions.assertEquals(feet1,feet2);
    }

    @Test
    public void testEquality_CentimetersToFeet_NonEquivalentValue()
    {
        Length feet1=new Length(1,LengthUnit.CENTIMETERS);
        Length feet2=new Length(1, LengthUnit.FEET);
        Assertions.assertNotEquals(feet1,feet2);
    }

    @Test
    public void testEquality_MultiUnit_TransitiveProperty()
    {
        Length yard = new Length(1, LengthUnit.YARDS);
        Length feet = new Length(3, LengthUnit.FEET);
        Length inches = new Length(36, LengthUnit.INCHES);

        Assertions.assertEquals(yard, feet);
        Assertions.assertEquals(feet, inches);
        Assertions.assertEquals(yard, inches);
    }
//    @Test
//    public void testEquality_YardWithNullUnit()
//    {
//        Length feet5=new Length(1,LengthUnit.YARDS);
//        Length feet1=new Length(2,null);
//        Assertions.assertNotEquals(feet1,feet5);
//    }
    @Test
    public void testEquality_YardSameReference()
    {
        Length feet1=new Length(12,LengthUnit.FEET);
        Assertions.assertEquals(feet1,feet1);
    }
    @Test
    public void testEquality_YardNullComparison()
    {
        Length feet1=null;
        Assertions.assertNull(feet1);
    }
//    @Test
//    public void testEquality_CentimetersWthNullUnit()
//    {
//        Length feet5=new Length(1,LengthUnit.CENTIMETERS);
//        Length feet1=new Length(2,null);
//        Assertions.assertEquals(feet1,feet5);
//    }
    @Test
    public void testEquality_CentimetersWthSameReference()
    {
        Length feet5=new Length(1,LengthUnit.CENTIMETERS);
        Assertions.assertEquals(feet5,feet5);
    }
    @Test
    public void testEquality_CentimetersNullComparison()
    {
        Length feet5=new Length(1,LengthUnit.CENTIMETERS);
        Assertions.assertNotNull(feet5);
    }
    @Test
    public void testEquality_AllUnits_ComplexScenario()
    {
        Length feet5=new Length(2,LengthUnit.YARDS);
        Length feet1=new Length(6,LengthUnit.FEET);
        Length feet2=new Length(72,LengthUnit.INCHES);
        Assertions.assertEquals(feet5,feet1);
        Assertions.assertEquals(feet1,feet2);
    }

}

