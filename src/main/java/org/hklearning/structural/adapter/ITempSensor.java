package org.hklearning.structural.adapter;

public class ITempSensor implements IWeatherSensor{
    @Override
    public double getTemperature() {
        //This returns a double value which is in Celsius.
        return 25.5;
    }
}
