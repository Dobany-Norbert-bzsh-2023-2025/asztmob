package com.example;

public class Main {
    public static void main(String[] args) {
        Network network = new Network();
        network.connectToNetwork("networkName");
        network.disconnectFromNetwork();
    }
}