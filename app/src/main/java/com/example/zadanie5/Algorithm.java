package com.example.zadanie5;

public class Algorithm {
    private final double gEarth = 9.80665;
    private final double gMars = 3.721;
    private final int fuelEarth1kg = 100;

    private final long fuelMars1kg = (long) ((gMars*fuelEarth1kg)/(gEarth));
    public Algorithm() {
    }
    public long fuelMars(String input) {
        if (input.contains(",")) {
            String inputMod = input.replace( ",", "." );
       float inputFloat = Float.parseFloat(inputMod);
       return (long) (inputFloat * fuelMars1kg);
        } else {
            float inputFloat = Float.parseFloat(input);
            return (long) (inputFloat * fuelMars1kg);
        }
    }
}
