public class Ride {
    private double distanceInKm;
    private int timeInMinutes;
    private static final double COST_PER_KM = 10; // Rs 10 per kilometer
    private static final double COST_PER_MINUTE = 1; // Rs 1 per minute
    private static final double MINIMUM_FARE = 5; // Rs 5 minimum fare

    public Ride(double distanceInKm, int timeInMinutes) {
        this.distanceInKm = distanceInKm;
        this.timeInMinutes = timeInMinutes;
    }

    public double calculateFare() {
        double fare = (distanceInKm * COST_PER_KM) + (timeInMinutes * COST_PER_MINUTE);
        return Math.max(fare, MINIMUM_FARE);
    }
}
