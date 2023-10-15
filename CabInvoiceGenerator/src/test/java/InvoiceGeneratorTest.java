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
    public void testCalculateTotalFare() {
        Ride ride1 = new Ride(10, 15); // 10 km, 15 minutes
        Ride ride2 = new Ride(5, 10);  // 5 km, 10 minutes
        double expectedTotalFare = ride1.calculateFare() + ride2.calculateFare();

        invoiceGenerator.addRide(ride1);
        invoiceGenerator.addRide(ride2);

        double totalFare = invoiceGenerator.calculateTotalFare();
        assertEquals(expectedTotalFare, totalFare);
    }
}
