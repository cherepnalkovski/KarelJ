package com.musala.training.design.patterns.behavioral.state;

public class FanLowState extends State {

    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan to med");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is low.";
    }
}
