package Event;
import java.util.*;

public class EventMain {
    public static void main(String[] args) {
        Seminar seminar = new Seminar("Masid Concert 2024", "2024-11-15", "Mall of Asia", 5);
        MusicalPerformance concert = new MusicalPerformance(
                "Ong Fam",
                "2024-11-15",
                "Mall of Asia",
                Arrays.asList("Masid", "", "Ong Fam")
        );
        MusicalPerformance concert2 = new MusicalPerformance(
                "K-pop",
                "2025-12-01",
                "Arena",
                Arrays.asList("K-pop", "EXB")
        );

        seminar.displayDetails();
        concert.displayDetails();
        concert2.displayDetails();

        System.out.println("Checking event conflicts...");
        checkConflict(seminar, concert);
        checkConflict(seminar, concert2);
        checkConflict(concert, concert2);
    }

    
    public static void checkConflict(Event e1, Event e2) {
        if (e1.isConflict(e2)) {
            System.out.println(" Conflict detected between \"" + e1.getEventName() + "\" and \"" + e2.getEventName() + "\" on " + e1.getDate() + " at " + e1.getLocation() + ".");
        } else {
            System.out.println(" No conflict between \"" + e1.getEventName() + "\" and \"" + e2.getEventName() + "\".");
        }
    }
}