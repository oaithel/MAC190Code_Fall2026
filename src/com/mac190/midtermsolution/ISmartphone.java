package com.mac190.midtermsolution;

import java.util.Objects;

/*
Implement the Smartphone class using inheritance.
 */
public class ISmartphone extends Device{
    private int storage;
    public ISmartphone(){
        super();
        storage = 0;
    }
    public ISmartphone(Device d, int s){
        super(d);
        storage = s;
    }
    public ISmartphone(String b, int s){
        super(b);
        storage = s;
    }
    public ISmartphone(String b){
        super(b);
        storage = 64;
    }
    public ISmartphone(ISmartphone sp){
        super(sp.getBaseDevice());
        storage = sp.storage;
    }
    public Device getBaseDevice() {
        return this;
    }
    public void setBaseDevice(Device baseDevice) {
        this.setBrand(baseDevice.getBrand());
        this.setBatteryLife(baseDevice.getBatteryLife());
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public double efficiencyScore(){
        return (storage / this.batteryUsagePerHour());
    }
    @Override
    public String toString() {
        return "Smartphone{" +
                "baseDevice=" + super.toString() +
                ", storage=" + storage +
                '}';
    }
    public boolean equals(ISmartphone that) {
        if (this == that) return true;
        return storage == that.storage && super.equals(that);
    }
    public ISmartphone add(ISmartphone s){
        return new ISmartphone(super.add(s.getBaseDevice()), (this.storage+s.storage)/2);
    }
    public static ISmartphone add(ISmartphone t, ISmartphone s){
        return new ISmartphone(t.getBaseDevice().add(s.getBaseDevice()), (t.storage+s.storage)/2);
    }
}