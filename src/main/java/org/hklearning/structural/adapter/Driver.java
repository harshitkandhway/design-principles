package org.hklearning.structural.adapter;

public class Driver {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard(new ITempSensor());
        dashboard.dataAnalyzer();

        //Using the class adapter pattern
        Dashboard dashboard2 = new Dashboard(new ClassWeatherAdapter());
        dashboard2.dataAnalyzer();

        //Using the object adapter pattern
        Dashboard dashboard3 = new Dashboard(new ObjectWeatherAdapter(new AdvancedUSASensor()));
        dashboard3.dataAnalyzer();
    }
}
