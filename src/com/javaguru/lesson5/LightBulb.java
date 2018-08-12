package com.javaguru.lesson5;

class LightBulb {

    public static final int MAX_TURN_ON_COUNT = 5;

    private boolean turnedOn;
    private int currentTurnOnCount;

    public void turnOn() {
        if (!turnedOn && currentTurnOnCount < MAX_TURN_ON_COUNT) {
            turnedOn = true;
            currentTurnOnCount++;
            System.out.println("Turned ON, count=" + currentTurnOnCount);
        } else {
            System.out.println("Unable to turn on");
        }
    }

    public void turnOff() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Turned OFF");
        } else {
            System.out.println("Already turned off");
        }
    }
}
