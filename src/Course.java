import java.util.ArrayList;
import java.util.List;
//
public class Course {
    private int id;
    private String name;
    private int hours;
    private List<ScientificWorkers> lectures = new ArrayList<>();

    public Course(int id, String name, int hours) {
        this.id = id;
        this.name = name;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public List<ScientificWorkers> getLectures() {
        return lectures;
    }

    public void setLectures(List<ScientificWorkers> lectures) {
        this.lectures = lectures;
    }

    public void addLecturer(ScientificWorkers lecturer) {
        if (!lectures.contains(lecturer)) {
            lectures.add(lecturer);
        }
    }
}
