package TravelService;

import java.util.ArrayList;
import java.util.List;
public class TravelServiceMain {
    public static void main(String[] args) {
        TravelService ts = new TravelService();
        
        List<String> flights = ts.searchFlights("Cebu");
        List<String> hotels = ts.searchHotels("5Star");
        System.out.println("Flights to Cebu: " + flights);
        System.out.println("Hotels in Cebu: " + hotels);
        
        ts.bookReservation("Flight EXO123 to Cebu");
        ts.bookReservation("5Star Hotel in Cebu");
        System.out.println("Reservations: " + ts.getReservations());
        
        ts.cancelReservation("Flight EXO123 to Cebu");
        System.out.println("After cancel - Reservations: " + ts.getReservations());
    }
}