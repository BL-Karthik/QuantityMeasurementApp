package com.bridgelabz.quantitymeasurementapp;

public enum LengthUnit {
    FEET(12.0),
    INCHES(1.0),
    YARDS(36.0),
    CENTIMETERS(0.3937007874015748);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
    public double getConversionFactor()
    {

        return conversionFactor;
    }

    public double toInches(double value)
    {
        return value*conversionFactor;
    }

}
