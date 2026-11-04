package se.lexicon;
import java.util.ArrayList;
import java.util.List;

public class Lecturer {
    private List<Department> departments = new ArrayList<>();
    private String name;
    public Lecturer(String name) {
        this.name = name;
    }
    void addDepartment(Department department) {
        if (!departments.contains(department)) {
            departments.add(department);
        }
    }
    public String getName() {
        return name;
    }
    public List<Department> getDepartments() {
        return departments;
    }
}