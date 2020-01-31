package com.lambton.vehicle;

public class Bus
{
    String busType;
    boolean serviceAvailability;
    boolean wifiAvailability;

    public Bus(String busType, boolean serviceAvailability, boolean wifiAvailability)
    {
        this.busType = busType;
        this.serviceAvailability = serviceAvailability;
        this.wifiAvailability = wifiAvailability;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public boolean isServiceAvailability() {
        return serviceAvailability;
    }

    public void setServiceAvailability(boolean serviceAvailability) {
        this.serviceAvailability = serviceAvailability;
    }

    public boolean isWifiAvailability() {
        return wifiAvailability;
    }

    public void setWifiAvailability(boolean wifiAvailability) {
        this.wifiAvailability = wifiAvailability;
    }
}
