package com.bridgelabz.quantitymeasurementapp;

public class QuantityMeasurementApp
{
    public static class Feet {
        private final double value;
        public Feet(double value)
        {
            this.value=value;
        }

        public boolean equals(Object obj) {
            //checking of same type
            if (this == obj) {
                return true;
            }
            //checking for Null
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            //Casting into  Feet Obj
            Feet feet = (Feet) obj;
            //Comparing the two values
            return Double.compare(this.value, feet.value) == 0;
        }
    }

    public static void main( String[] args )
    {
       Feet feet1=new Feet(5);
       Feet feet2=new Feet(5);
       boolean result=feet1.equals(feet2);
       System.out.println(result?" Two are equal "+result:"Two are not equal "+result);

    }
}
