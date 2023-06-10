package org.example.A.mypackage;

public class Radius {
    public static double getSquare(int radius) {
        if (radius < 0) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
