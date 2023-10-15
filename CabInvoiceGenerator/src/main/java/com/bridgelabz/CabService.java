package com.bridgelabz;

public class CabService {
    private static final double COST_PER_KM = 10; // Rs 10 per kilometer
    private static final double COST_PER_MINUTE = 1; // Rs 1 per minute
    private static final double MINIMUM_FARE = 5; // Rs 5 minimum fare

    public static double calculateFare(double distanceInKm, int timeInMinutes) {
        if (distanceInKm <= 0 || timeInMinutes <= 0) {
            return 0; // Invalid input, no fare
        }

        double fare = (distanceInKm * COST_PER_KM) + (timeInMinutes * COST_PER_MINUTE);

        return Math.max(fare, MINIMUM_FARE);
    }

    public static void main(String[] args) {
        double distance = 15; // Example: 15 kilometers
        int time = 30; // Example: 30 minutes

        double fare = calculateFare(distance, time);

        System.out.println("Total Fare: Rs " + fare);
    }
}
