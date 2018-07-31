package com.musala.training.design.patterns.behavioral.chain.of.responsibility;

public class CEO extends Handler{
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
