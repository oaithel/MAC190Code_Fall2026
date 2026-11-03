package com.mac190.midtermsolution;

import java.util.Objects;

public class Device {
    private String brand;
    private double batteryLife;

    public Device(){
        brand = "N/A";
        batteryLife = 0;
    }
    public Device(String b, double bt){
        brand = b;
        batteryLife = bt;
    }
    public Device(String b){
        brand = b;
        batteryLife = 10;
    }
    public Device(Device d){
        brand = d.brand;
        batteryLife = d.batteryLife;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getBatteryLife() {
        return batteryLife;
    }
    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
    public double batteryUsagePerHour(){
        return (100.0/batteryLife);
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", batteryLife=" + batteryLife +
                '}';
    }

    public boolean equals(Device dev) {
        if (this == dev) return true;
        return Double.compare(batteryLife, dev.batteryLife) == 0 && Objects.equals(brand, dev.brand);
    }

   public Device add(Device d){
        String newBrand = brand;
        if(!d.brand.equals(this.brand)){
            newBrand += "+" + d.brand;
        }
        double bl = (this.batteryLife+d.batteryLife)/2.0;
        return new Device(newBrand, bl);
   }
    public static Device add(Device t, Device d){
        String newBrand = t.brand;
        if(!d.brand.equals(t.brand)){
            newBrand += "+" + d.brand;
        }
        double bl = (t.batteryLife+d.batteryLife)/2.0;
        return new Device(newBrand, bl);
    }
}
