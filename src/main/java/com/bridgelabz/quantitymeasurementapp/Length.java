package com.bridgelabz.quantitymeasurementapp;

public class Length {
    private double value;
    private LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.unit = unit;
        this.value = value;
    }
    public double getValue()
    {
        return  value;
    }
    private double convertToBaseUnit() {
        return unit.toInches(value);
    }
    public  LengthUnit getUnit()
    {
        return  unit;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Length length = (Length) obj;

        return Double.compare(this.convertToBaseUnit(), length.convertToBaseUnit()) == 0;
    }

    @Override
    public String toString()
    {
        return "The value will be  "+value+" , unit : "+unit;
    }
}