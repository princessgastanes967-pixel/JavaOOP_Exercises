package Reservation;

import java.time.LocalDate;

public class ReservationMain {
    public static void main(String[] args) {
        ResortReservation resort = new ResortReservation(
                "RES-003", 
                "Gatsanes, Joy", 
                LocalDate.of(2025, 12, 25), 
                103
        );

        resort.displayReservationDetails();
        resort.checkReservationStatus();

        System.out.println("\n--- Updating Resort Reservation ---");
        resort.modifyReservationDetails("Gatsanes, J", LocalDate.of(2025, 12, 25));
        resort.modifyRoomNumber(103);
        resort.updateStatus("Confirmed");
        resort.displayReservationDetails();

        System.out.println("\n----------------------------------------\n");
        RailwayReservation railway = new RailwayReservation(
                "RAIL-105", 
                "Andress Mulach", 
                LocalDate.of(2025, 12, 24), 
                "B12"
        );

        railway.displayReservationDetails();
        railway.checkReservationStatus();

        System.out.println("\n--- Updating Railway Reservation ---");
        railway.modifyReservationDetails("Maria S.", LocalDate.of(2025, 12, 3));
        railway.modifySeatNumber("C5");
        railway.updateStatus("Confirmed");
        railway.displayReservationDetails();
    }
}
  
