package com.lambton.vehicle;

public class MotorCycle
{
    int maxSpeed;
    float Milage;

    public MotorCycle(int maxSpeed, float milage)
    {
        this.maxSpeed = maxSpeed;
        Milage = milage;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getMilage() {
        return Milage;
    }

    public void setMilage(float milage) {
        Milage = milage;
    }
}
