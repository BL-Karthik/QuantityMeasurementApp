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
    public static class Inches{
        private final double value;
        public Inches(double value)
        {
            this.value=value;
        }

        public boolean equals(Object obj)
        {
            if(this==obj)
            {
                return true;
            }
            if(obj==null||getClass()!=obj.getClass())
            {
                return  false;
            }
            Inches inches=(Inches) obj;
            return Double.compare(inches.value,this.value)==0;

        }

    }

    public static void demonstrateFeetEquality()
    {
         Feet feet=new Feet(6);
         Feet feet1=new Feet(6);
         boolean result=feet.equals(feet1);
         System.out.println("Input = " +feet.value+ "Ft  and "+feet1.value+"Ft");
         System.out.println(result?"Equal ("+result+")":" Not Eqaul ("+result+")");
    }
    public static void demonstrateInchesEquality()
    {
        Inches inches=new Inches(6);
        Inches inches1=new Inches(6);
        System.out.println("Input = " +inches.value+ "inches  and "+inches1.value+"inches");
        boolean result=inches.equals(inches1);
        System.out.println(result?"Equal ("+result+")":" Not Eqaul ("+result+")");
    }


    public static void main( String[] args )
    {
       demonstrateFeetEquality();
       demonstrateInchesEquality();
    }
}
