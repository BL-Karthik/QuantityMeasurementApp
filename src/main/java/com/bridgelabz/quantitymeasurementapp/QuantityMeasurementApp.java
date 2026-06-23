package com.bridgelabz.quantitymeasurementapp;

public class QuantityMeasurementApp
{
    public static void demonstrateFeetEquality()
    {
        Length length=new Length(1,LengthUnit.FEET);
        Length length1=new Length(1,LengthUnit.FEET);

         boolean result=length.equals(length1);
         System.out.println("Input = " +length1.getValue()+ "Ft  and "+length.getValue()+"Ft");
         System.out.println(result?"Equal ("+result+")":" Not Eqaul ("+result+")");
    }

    public static void demonstrateInchesEquality()
    {
        Length length=new Length(12,LengthUnit.INCHES);
        Length length1=new Length(12,LengthUnit.INCHES);
        System.out.println("Input = " +length.getValue()+ "inches  and "+length1.getValue()+"inches");
        boolean result=length.equals(length1);
        System.out.println(result?"Equal ("+result+")":" Not Eqaul ("+result+")");
    }
    public static void demonstrateFeetInchesComparison()
    {
        Length length1=new Length(1.0,LengthUnit.FEET);
        Length length2=new Length(12.0,LengthUnit.INCHES);
        System.out.println("Input = " +length1.getValue()+ "Feet  and "+length2.getValue()+"inches");
        System.out.print("Two lengths are equal  : "+length1.equals(length2));
    }

    public static void main( String[] args )
    {
       demonstrateFeetEquality();
       demonstrateInchesEquality();
       demonstrateFeetInchesComparison();
    }
}
