package com.mac190.midtermsolution;

import java.util.Objects;

public class Smartphone {
    private Device baseDevice;
    private int storage;
    public Smartphone(){
        baseDevice = new Device();
        storage = 0;
    }
    public Smartphone(Device d, int s){
        baseDevice = new Device(d);
        storage = s;
    }
    public Smartphone(String b, int s){
        baseDevice = new Device(b);
        storage = s;
    }
    public Smartphone(String b){
        baseDevice = new Device(b);
        storage = 64;
    }
    public Smartphone(Smartphone sp){
        baseDevice = new Device(sp.baseDevice);
        storage = sp.storage;
    }
    public Device getBaseDevice() {
        return baseDevice;
    }
    public void setBaseDevice(Device baseDevice) {
        this.baseDevice = baseDevice;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public String getBrand(){
        return baseDevice.getBrand();
    }
    public void setBrand(String b){
        baseDevice.setBrand(b);
    }
    public double getBatteryLife(){
        return baseDevice.getBatteryLife();
    }
    public void setBatteryLife(double bl){
        baseDevice.setBatteryLife(bl);
    }
    public double efficiencyScore(){
        return (storage / baseDevice.batteryUsagePerHour());
    }
    @Override
    public String toString() {
        return "Smartphone{" +
                "baseDevice=" + baseDevice +
                ", storage=" + storage +
                '}';
    }

    public boolean equals(Smartphone that) {
        if (this == that) return true;
        return storage == that.storage && Objects.equals(baseDevice, that.baseDevice);
    }
    public Smartphone add(Smartphone s){
        return new Smartphone(this.baseDevice.add(s.getBaseDevice()), (this.storage+s.storage)/2);
    }
    public static Smartphone add(Smartphone t, Smartphone s){
        return new Smartphone(t.baseDevice.add(s.getBaseDevice()), (t.storage+s.storage)/2);
    }
}
