package org.hklearning.structural.adapter;

public class ClassWeatherAdapter extends AdvancedUSASensor implements IWeatherSensor
{
    @Override
    public double getTemperature() {
        float tempInF = this.getTempF();
        return (tempInF - 32) * 5 / 9;
    }
}
