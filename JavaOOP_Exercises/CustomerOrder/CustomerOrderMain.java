package CustomerOrder;

import java.time.LocalDate;
public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order1 = new OnlineOrder(
                " ORD 115 ",
                " Joyang Gastanes",
                LocalDate.now(),
                " Gabi, Compostela Ddo ",
                " QRK12345986 "
        );

        order1.displayOrderDetails();
        System.out.println("\n--- Updating Tracking Status ---");
        order1.updateTrackingStatus("Out for Delivery");
        order1.displayOrderDetails();
    }
}