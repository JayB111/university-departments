package se.lexicon;
import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    public University(String name) {
        this.name = name;
    }
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName, this);
        departments.add(department);
    }
    public String getName() {
        return name;
    }
    public List<Department> getDepartments() {
        return departments;
    }
}