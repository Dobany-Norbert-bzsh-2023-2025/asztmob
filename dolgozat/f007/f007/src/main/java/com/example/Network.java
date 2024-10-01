package com.example;

public class Network implements Connectable {

    @Override
    public void connectToNetwork(String networkName) {
        System.out.println("Connected to " + networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("Disconnected");
    }
    
}
