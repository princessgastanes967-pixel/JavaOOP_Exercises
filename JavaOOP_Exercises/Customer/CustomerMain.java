package Customer;

public class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer(" Joyang ", " joyang@gmail.com ");
        c.addPurchase(600.0);
        c.addPurchase(200.0);
        System.out.println("Customer: " + c.getName());
        System.out.println("Total Expenditure: $" + c.calculateTotalExpenditure());
        
        LoyalCustomer lc = new LoyalCustomer(" JayEsco ", " Esco@gmail.com ", 10.0);
        lc.addPurchase(1000.0);
        lc.addPurchase(90.0);
        System.out.println("Loyal Customer: " + lc.getName());
        System.out.println("Total Expenditure: $" + lc.calculateTotalExpenditure());
        System.out.println("Discounted Price for $100: $" + lc.applyDiscount(100.0));
    }
}