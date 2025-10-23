package Inventory;

public class InventoryMain {
   
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct("apple");
        inv.addProduct("grapes");
        inv.addProduct("orange");
        System.out.println("Products in inventory: " + inv.getProducts().size());
        System.out.println("Product names: " + inv.getProducts());
        System.out.println("Is low inventory: " + inv.isLowInventory());
        
        inv.removeProduct("grapes");
        System.out.println("After removal - Products: " + inv.getProducts().size());
        System.out.println("Remaining product names: " + inv.getProducts());
        System.out.println("Is low inventory: " + inv.isLowInventory());
        
        inv.setLowThreshold(3);
        System.out.println("After setting threshold to 3 - Is low inventory: " + inv.isLowInventory());
    }
}

