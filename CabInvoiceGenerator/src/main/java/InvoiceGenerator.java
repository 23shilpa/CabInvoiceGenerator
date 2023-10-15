import java.util.ArrayList;
import java.util.List;

public class InvoiceGenerator {
    private List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public Invoice generateInvoice() {
        int totalRides = rides.size();
        double totalFare = 0;

        for (Ride ride : rides) {
            totalFare += ride.calculateFare();
        }

        double averageFare = totalFare / totalRides;

        return new Invoice(totalRides, totalFare, averageFare);
    }

    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Ride ride1 = new Ride(10, 15); // 10 km, 15 minutes
        Ride ride2 = new Ride(5, 10);  // 5 km, 10 minutes

        invoiceGenerator.addRide(ride1);
        invoiceGenerator.addRide(ride2);

        Invoice invoice = invoiceGenerator.generateInvoice();
        System.out.println("Total Rides: " + invoice.getTotalRides());
        System.out.println("Total Fare: Rs " + invoice.getTotalFare());
        System.out.println("Average Fare Per Ride: Rs " + invoice.getAverageFare());
    }
}
