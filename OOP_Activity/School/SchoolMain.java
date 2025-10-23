package School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        
        school.addStudent("Gastanes");
        school.addStudent("Kudera");
        school.addTeacher("Ma'am : Amabao");
        school.addTeacher("Sir : Eyas");
        
        school.createClass(" Art Appreciation 101");
        school.createClass(" Human Computing ");
        
        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());
        
        school.removeStudent(" Bales ");
        school.removeTeacher("Ms. Sales");
        
        System.out.println("After removal - Students: " + school.getStudents());
        System.out.println("After removal - Teachers: " + school.getTeachers());
    }
}

