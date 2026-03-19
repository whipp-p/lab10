import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private static int employeeCount;
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void addEmployee() {
        employeeCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}
