package GymMemberShip;

public class GymMemberShipMain {
    public static void main(String[] args) {
        GymMembership basicMember = new GymMembership("Joyang Gastanes", "Standard", 6);
        basicMember.displayMembershipDetails();
        basicMember.checkSpecialOffers();

        System.out.println("\n--------------------------------\n");

        PremiumMembership premiumMember = new PremiumMembership("Ashira", 12, true, true);
        premiumMember.displayMembershipDetails();
    }
}
