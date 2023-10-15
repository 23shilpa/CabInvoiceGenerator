import java.util.ArrayList;
import java.util.List;

public class InvoiceGenerator {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public double calculateTotalFare() {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += ride.calculateFare();
        }
        return totalFare;
    }

    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Ride ride1 = new Ride(10, 15); // 10 km, 15 minutes
        Ride ride2 = new Ride(5, 10);  // 5 km, 10 minutes

        invoiceGenerator.addRide(ride1);
        invoiceGenerator.addRide(ride2);

        double totalFare = invoiceGenerator.calculateTotalFare();
        System.out.println("Total Fare: Rs " + totalFare);
    }
}
