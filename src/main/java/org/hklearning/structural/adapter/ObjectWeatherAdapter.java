package org.hklearning.structural.adapter;

public class ObjectWeatherAdapter implements IWeatherSensor{

    private final AdvancedUSASensor advancedSensor;

    public ObjectWeatherAdapter(AdvancedUSASensor advancedSensor){
        this.advancedSensor = advancedSensor;
    }
    @Override
    public double getTemperature() {
        float tempInF = advancedSensor.getTempF();
        return (tempInF - 32) * 5 / 9;
    }
}
