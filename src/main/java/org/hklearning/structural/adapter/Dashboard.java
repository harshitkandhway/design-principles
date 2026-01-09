package org.hklearning.structural.adapter;

public class Dashboard {

    private final IWeatherSensor sensor;

    public Dashboard(IWeatherSensor sensor){
        this.sensor = sensor;
    }

    public void dataAnalyzer(){
        System.out.println("This method runs logic to read data from sensor : "+ sensor.getTemperature());
    }

}
