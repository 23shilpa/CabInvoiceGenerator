import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceGeneratorTest {
    private InvoiceGenerator invoiceGenerator;

    @BeforeEach
    public void setUp() {
        invoiceGenerator = new InvoiceGenerator();
    }

    @Test
    public void testGenerateInvoice() {
        Ride ride1 = new Ride(10, 15); // 10 km, 15 minutes
        Ride ride2 = new Ride(5, 10);  // 5 km, 10 minutes
        double totalFare = ride1.calculateFare() + ride2.calculateFare();
        double averageFare = totalFare / 2; // Two rides

        invoiceGenerator.addRide(ride1);
        invoiceGenerator.addRide(ride2);

        Invoice invoice = invoiceGenerator.generateInvoice();

        assertEquals(2, invoice.getTotalRides());
        assertEquals(totalFare, invoice.getTotalFare());
        assertEquals(averageFare, invoice.getAverageFare());
    }
}
