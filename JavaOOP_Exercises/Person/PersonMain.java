package Person;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Kudera", 19);
        Person p2 = new Person("Manabit", 18);
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old.");
        System.out.println(p2.getName() + " is " + p2.getAge() + " years old.");

        p1.setName("Gastanes");
        p1.setAge(20);
        System.out.println("Your name is : " + p1.getName() + "" + "Age :" + p1.getAge());
        p2.setName("Forde");
        p2.setAge(20);
        System.out.println("Your Name is : " + p2.getName() + "" + " Age :" + p2.getAge());
    }
}
