import java.util.List;

public class Decan extends ScientificWorkers {
    private Faculty faculty;

    public Decan(String fio, String email, String phoneNumber, int id, Faculty faculty) {
        super(fio, email, phoneNumber, id);
        this.faculty = faculty;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
//