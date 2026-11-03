package com.mac190.midtermsolution;

public class SmartphoneTester {
    public static void main(String[] args) {
        //default Device
        Device D1 = new Device();
        System.out.println("D1: " + D1);
        D1.setBatteryLife(30);
        D1.setBrand("Samsung");
        System.out.println("D1: " + D1);
        Device D2 = new Device(D1);
        System.out.println("D2: " + D2);
        Device D3 = Device.add(D1, D2);
        System.out.println("D3: " + D3);
        Smartphone S1 = new Smartphone(D1, 20);
        System.out.println("S1: " +S1);
        D2.setBrand("Apple");
        Smartphone S2 = new Smartphone(D2, 50);
        System.out.println("S2: " + S2);
        Smartphone S3 = S1.add(S2);
        System.out.println("S3: " + S3);

    }
}
