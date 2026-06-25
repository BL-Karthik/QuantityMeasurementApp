package com.bridgelabz.quantitymeasurementapp;

public class QuantityMeasurementApp
{
    public static boolean demonstrateLengthEquality() {
        Length length = new Length(1, LengthUnit.FEET);
        Length length1 = new Length(1, LengthUnit.FEET);
        return length.equals(length1);
    }

    public static boolean demonstrateLengthComparison()
    {
        Length length1=new Length(1.0,LengthUnit.FEET);
        Length length2=new Length(12.0,LengthUnit.INCHES);
        return  length1.equals(length2);
    }
    public static Length demonstrateLengthConversion(double value,LengthUnit fromUnit,LengthUnit toUnit)
    {
        double result=value*(fromUnit.getConversionFactor()/toUnit.getConversionFactor());
        return new Length(result,toUnit);
    }
    public static Length demonstrateLengthConversion(Length length,LengthUnit toUnit)
    {
      double value= length.getValue();
      LengthUnit lengthUnit=length.getUnit();
      return demonstrateLengthConversion(value,lengthUnit,toUnit);
    }


    public static void main( String[] args )
    {
        System.out.println(demonstrateLengthEquality());
        System.out.println(demonstrateLengthComparison());
        System.out.println( demonstrateLengthConversion(1.0,LengthUnit.FEET,LengthUnit.INCHES));
        System.out.println( demonstrateLengthConversion(36.0,LengthUnit.INCHES,LengthUnit.YARDS));
        System.out.println( demonstrateLengthConversion(new Length(3,LengthUnit.INCHES),LengthUnit.CENTIMETERS));

    }
}
