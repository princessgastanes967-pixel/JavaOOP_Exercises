package Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog myDog = new Dog("Kring", 3, "Choco");
        Bird myBird = new Bird("Sam", 3, 25.5);

        myDog.displayPetDetails();
        System.out.println();
        myBird.displayPetDetails();
    }
}