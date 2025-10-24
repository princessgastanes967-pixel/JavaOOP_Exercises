package Building;

public class BuildingMain {
    public static void main(String[] args) {
        ResidentialBuilding rb = new ResidentialBuilding(
                " St. Jose", 30, 3000.0, 52, 14000.0);

        CommercialBuilding cb = new CommercialBuilding(
                " Gastanes Street ", 16, 20000.0, 9000.0, 300.0);

        rb.displayInfo();
        cb.displayInfo();
    }
}