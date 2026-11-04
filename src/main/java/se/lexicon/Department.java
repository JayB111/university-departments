package se.lexicon;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Lecturer> lecturers = new ArrayList<>();
    private University university;
    Department(String name, University university) {
        this.name = name;
        this.university = university;
    }
    public void addLecturer(Lecturer lecturer) {
        if (!lecturers.contains(lecturer)) {
            lecturers.add(lecturer);
            lecturer.addDepartment(this);
        }
    }public String getName() {
        return name;
    }
    public University getUniversity() {
        return university;
    }
    public List<Lecturer> getLecturers() {
        return lecturers;
    }
}