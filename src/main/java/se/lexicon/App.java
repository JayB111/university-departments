package se.lexicon;

public class App {
    public static void main(String[] args) {
        University university = new University("Lexicon University");
        university.addDepartment("Computer Science");
        university.addDepartment("Business");
        university.addDepartment("Design");
        Lecturer anna = new Lecturer("Anna");
        Lecturer peter = new Lecturer("Peter");
        Lecturer maria = new Lecturer("Maria");
        Department computerScience = university.getDepartments().get(0);
        Department business = university.getDepartments().get(1);
        Department design = university.getDepartments().get(2);
        computerScience.addLecturer(anna);
        computerScience.addLecturer(peter);
        business.addLecturer(peter);
        business.addLecturer(maria);
        design.addLecturer(anna);
        System.out.println("University: " + university.getName());
        for (Department department : university.getDepartments()) {
            System.out.println("\nDepartment: " + department.getName());
            for (Lecturer lecturer : department.getLecturers()) {
                System.out.println("Lecturer: " + lecturer.getName());
            }
        }
    }
}