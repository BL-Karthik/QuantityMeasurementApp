//package com.bridgelabz.quantitymeasurementapp;
//
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//
//public class QuantityMeasurementAppTest
//{
//    @Test
//    public void testFeetEquality_SameValue()
//    {
//        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(5);
//        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(5);
//        Assertions.assertEquals(feet1, feet2);
//    }
//
//    @Test
//    public void testFeetEquality_DifferentValue()
//    {
//         QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(14);
//         QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(15);
//         Assertions.assertNotEquals(feet1,feet2);
//
//    }
//
//    @Test
//    public void testFeetEquality_NullComparison()
//    {
//        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(9);
//        Assertions.assertFalse(feet2.equals(null));
//
//    }
//
//    @Test
//    public void testFeetEquality_DifferentClass()
//    {
//        QuantityMeasurementApp feet1=new QuantityMeasurementApp();
//        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(8);
//        Assertions.assertNotEquals(feet2,feet1);
//    }
//
//    @Test
//    public void testFeetEquality_SameReference()
//    {
//          QuantityMeasurementApp.Feet feet=new QuantityMeasurementApp.Feet(9);
//          Assertions.assertEquals(feet,feet);
//    }
//
//    //for Inches Equality
//    @Test
//    public void testInchesEquality_SameValue()
//    {
//        QuantityMeasurementApp.Inches inches1=new QuantityMeasurementApp.Inches(5);
//        QuantityMeasurementApp.Inches inches2=new QuantityMeasurementApp.Inches(5);
//        Assertions.assertEquals(inches1, inches2);
//    }
//
//    @Test
//    public void testInchesEquality_DifferentValue()
//    {
//        QuantityMeasurementApp.Inches inches1=new QuantityMeasurementApp.Inches(14);
//        QuantityMeasurementApp.Inches inches2=new QuantityMeasurementApp.Inches(15);
//        Assertions.assertNotEquals(inches1,inches2);
//
//    }
//
//    @Test
//    public void testInchesEquality_NullComparison()
//    {
//        QuantityMeasurementApp.Inches inches1=new QuantityMeasurementApp.Inches(9);
//        Assertions.assertFalse(inches1 == null);
//
//    }
//
//    @Test
//    public void testInchesEquality_DifferentClass()
//    {
//        QuantityMeasurementApp app=new QuantityMeasurementApp();
//        QuantityMeasurementApp.Inches inches=new QuantityMeasurementApp.Inches(8);
//        Assertions.assertNotEquals(inches,app);
//    }
//
//    @Test
//    public void testInchesEquality_SameReference()
//    {
//        QuantityMeasurementApp.Inches inches=new QuantityMeasurementApp.Inches(9);
//        Assertions.assertEquals(inches,inches);
//    }
//}
//
