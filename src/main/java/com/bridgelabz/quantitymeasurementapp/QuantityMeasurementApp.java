package com.bridgelabz.quantitymeasurementapp;

public class QuantityMeasurementApp
{
    public static void demonstrateLengthEquality()
    {
        Length length=new Length(1,LengthUnit.FEET);
        Length length1=new Length(1,LengthUnit.FEET);

         boolean result=length.equals(length1);
         System.out.println("Input = " +length1.getValue()+ "Ft  and "+length.getValue()+"Ft");
         System.out.println(result?"Equal ("+result+")":" Not Eqaul ("+result+")");
    }


    public static void demonstrateLengthComparison()
    {
        Length length1=new Length(1.0,LengthUnit.FEET);
        Length length2=new Length(12.0,LengthUnit.INCHES);
        System.out.println("Input = " +length1.getValue()+ "Feet  and "+length2.getValue()+"inches");

        System.out.print("Two lengths are equal  : "+length1.equals(length2));
        System.out.println();
        System.out.println();
        Length length3=new Length(1.0,LengthUnit.YARDS);
        Length length4=new Length(36.0,LengthUnit.INCHES);
        System.out.println("Input = " +length3.getValue()+ " Yards  and "+length4.getValue()+" inches");
        System.out.println("Two lengths are equal  : "+length3.equals(length4));
        System.out.println();
        Length length5=new Length(2,LengthUnit.YARDS);
        Length length6=new Length(2,LengthUnit.YARDS);
        System.out.println("Input = " +length5.getValue()+ " Yards  and "+length6.getValue()+" Yards");
        System.out.println("Two lengths are equal  : "+length5.equals(length6));
        System.out.println();
        Length length7=new Length(1.0,LengthUnit.CENTIMETERS);
        Length length8=new Length(0.3937007874015748,LengthUnit.INCHES);
        System.out.println("Input = " +length7.getValue()+ "centimeter and "+length8.getValue()+"inches");
        System.out.print("Two lengths are equal  : "+length7.equals(length8));
        System.out.println();
        Length length9=new Length(3,LengthUnit.FEET);
        Length length10=new Length(1,LengthUnit.YARDS);
        System.out.println();
        System.out.println("Input = " +length7.getValue()+ "Feet and "+length8.getValue()+"Yards");
        System.out.print("Two lengths are equal  : "+length9.equals(length10));
        System.out.println();
        Length length11=new Length(30.48,LengthUnit.CENTIMETERS);
        Length length12=new Length(1,LengthUnit.FEET);
        System.out.println();
        System.out.println("Input = " +length11.getValue()+ "centimeters and "+length12.getValue()+"Feet");
        System.out.print("Two lengths are equal  : "+length11.equals(length12));

    }

    public static void main( String[] args )
    {
        demonstrateLengthEquality();
       demonstrateLengthComparison();
    }
}
